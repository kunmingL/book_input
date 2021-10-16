package com.example.book_input.mapper;

import com.example.book_input.entity.TProCharpt;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface TproCharptMapper {
    public void insertTProCharptList(List<TProCharpt> list);
}
