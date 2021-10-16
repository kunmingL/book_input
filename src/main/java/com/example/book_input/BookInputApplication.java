package com.example.book_input;

import com.example.book_input.mapper.TproCharptMapper;
import com.example.book_input.service.exceldeal;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.book_input.mapper"})
public class BookInputApplication {

    @Autowired
    static TproCharptMapper tproCharptMapper;
    @Autowired
    static exceldeal exceldeal;

    public static void main(String[] args) {
        try {
            SpringApplication.run(BookInputApplication.class, args);
            System.out.println(tproCharptMapper);
            System.out.println(exceldeal);
            exceldeal ex = new exceldeal();
            ex.readexcel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
