package com.example.book_input.mapper;

import com.example.book_input.entity.TProCharpt;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface TproCharptMapper {

    public void insertTProCharptList(List<TProCharpt> list);
}
