package com.example.book_input.service;
import com.alibaba.excel.EasyExcel;

import com.example.book_input.entity.ReadSctionData;
import com.example.book_input.mapper.TproCharptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class exceldeal {
    public exceldeal(){}

    @Autowired
    private ReadSctionData readSctionData;

    public void readexcel(){
        System.out.println(readSctionData);
        String fileName = "C:\\Users\\77032\\Desktop\\测试.xls";
        //这里需要指定读用哪个class去读，然后读取第一个sheet 文件流自动关闭
        //参数一：读取excel的文件路径，
        //参数二：读取sheet的一行数据，
        //参数三：读取每一行的时候都会执行监听器
        EasyExcel.read(fileName, ReadSctionData.class,new excelDataListListener()).sheet().doRead();
    }



}
