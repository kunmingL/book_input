package com.example.book_input.entity;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class ReadSctionData {
    private String sectionName;
    private String sectionFirst;
    private String sectionContent;
    private long isRoot;
    private long order;
}
