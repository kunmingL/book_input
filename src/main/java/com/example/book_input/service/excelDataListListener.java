package com.example.book_input.service;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.book_input.entity.ReadSctionData;
import com.alibaba.fastjson.JSON;
import com.example.book_input.entity.TProCharpt;
import com.example.book_input.mapper.TproCharptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Service
public class excelDataListListener extends AnalysisEventListener<ReadSctionData> {



    private static final int BATCH_COUNT = 50;

    List<ReadSctionData> list = new ArrayList<ReadSctionData>(BATCH_COUNT);

    @Autowired
    private ReadSctionData readSctionData;




//    @Autowired
//    private TproCharptMapper tproCharptMapper;

    public excelDataListListener(){

    }

    /**
     * 每一条数据解析都会来调用
     */
    @Override
    public void invoke(ReadSctionData readSctionData, AnalysisContext analysisContext) {
        System.out.println(JSON.toJSONString(readSctionData));
        list.add(readSctionData);
        if (list.size()>=BATCH_COUNT){
            saveData();
            list = new ArrayList<>(BATCH_COUNT);
        }
    }


    /**
     * 所有数据解析完成了 都会来调用
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
        System.out.println(JSON.toJSONString(list));
    }

    public List<TProCharpt> transData(){
        ArrayList<TProCharpt> arrayList = new ArrayList();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        for (int i=0;i<list.size();i++){
            TProCharpt tProCharpt = new TProCharpt();
            tProCharpt.setTitle(list.get(i).getSectionName());
            tProCharpt.setIntroduce(list.get(i).getSectionContent());
            tProCharpt.setRequirement(list.get(i).getSectionFirst());
            tProCharpt.setCreators(0);
            //tProCharpt.setRoot(list.get(i).getIsRoot());
           // tProCharpt.setRootOrd(list.get(i).getOrder());
            tProCharpt.setIsLock(0);
            tProCharpt.setFinish(-1);
            tProCharpt.setCreateBy("TH-570542095060832256");
            tProCharpt.setCreateDat(timestamp);
            tProCharpt.setLUpdateDat(timestamp);
            tProCharpt.setIsDel(0);
            arrayList.add(tProCharpt);
        }
        return arrayList;
    }

    private void saveData(){
        System.out.println(list.size()+"条数据，开始存储数据库！");
        List<TProCharpt> tProCharptList = transData();
        InterfaceService interfaceService = new InterfaceService();
        TproCharptMapper tproCharptMapper = interfaceService.returnInterface();
        tproCharptMapper.insertTProCharptList(tProCharptList);
    }
}
