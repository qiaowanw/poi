package com.example.poi.service;

import com.example.poi.domain.Elements;
import com.example.poi.mapper.AlertMapper;
import com.example.poi.mapper.ElementsMapper;
import com.example.poi.service.AlertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AlertServiceImplTest {

    @Autowired
    private AlertService alertService;
    @Autowired
    private ElementsMapper elementsMapper;
    @Autowired
    private AlertMapper alertMapper;



    @Test
    void generateAlert() {
        List<Elements> allElements = elementsMapper.findAllElements();
        System.out.println(alertService.generateAlert(allElements));
    }
}