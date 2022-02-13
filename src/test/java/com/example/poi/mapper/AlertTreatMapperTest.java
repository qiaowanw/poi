package com.example.poi.mapper;

import com.example.poi.domain.Alert;
import com.example.poi.domain.AlertTreat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AlertTreatMapperTest {

    @Autowired
    private AlertTreatMapper alertTreatMapper;
    @Autowired
    private AlertMapper alertMapper;

    AlertTreat alertTreat=new AlertTreat();

    @Test
    void save() {
       alertTreatMapper.save(alertMapper.alertCount());

    }

    @Test
    void showInfo(){
        alertTreatMapper.showAlertInfoByUser("tom@163.com").forEach(System.out::println);
    }

    @Test
    void findALl(){
        alertTreatMapper.findAll().forEach(System.out::println);
    }
}