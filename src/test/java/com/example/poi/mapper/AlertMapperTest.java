package com.example.poi.mapper;

import com.example.poi.domain.Alert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class AlertMapperTest {

    @Autowired
    private AlertMapper alertMapper;
    Alert alert = new Alert();
    static int i = 0;

    @Test
    void save() {
        i++;
        alert.setId(1);
        alert.setElements("S2");
        alert.setAlertTime(LocalDateTime.now());
        alert.setAbValue(0);
        alert.setAlertTimes(i);
        alert.setAlertInfo("环境异常");
        alertMapper.save(alert);
    }

    @Test
    void alertCount(){
        List<Alert> alerts = alertMapper.alertCount();
        for(Alert alert : alerts){
            System.out.println(alert.getElements()+"::"+ alert.getAlertTimes()+"::"+ alert.getAlertInfo());
        }

    }

}