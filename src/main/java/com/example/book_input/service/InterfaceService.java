package com.example.book_input.service;

import com.example.book_input.mapper.TproCharptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterfaceService {
    @Autowired
    private TproCharptMapper tproCharptMapper;
    public InterfaceService(){

    }
    public TproCharptMapper returnInterface(){
        return tproCharptMapper;
    }

}
