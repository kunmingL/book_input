package com.example.book_input;

import com.example.book_input.service.exceldeal;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = {"com.example.book_input.mapper.*"})
public class BookInputApplication {
    @Autowired
//    static  exceldeal ex;

    public static void main(String[] args) {
        try {
            SpringApplication.run(BookInputApplication.class, args);
            exceldeal ex = new exceldeal();
            ex.readexcel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
