package com.example.poi.service.Impl;

import com.example.poi.domain.Alert;
import com.example.poi.domain.Elements;
import com.example.poi.mapper.AlertMapper;
import com.example.poi.mapper.ElementsMapper;
import com.example.poi.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {
    @Autowired
    private ElementsMapper elementsMapper;
    @Autowired
    private AlertMapper alertMapper;

    @Override
    @Transactional
    public int generateAlert(List<Elements> elements) {
            for (Elements element: elements) {
                double s1 = element.getS1();
                if (s1 < 0 || s1 > 14) {
                    Alert alert = new Alert();
                    alert.setAbValue(s1);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S1");
                    alertMapper.save(alert);
                }
                double s2 = element.getS2();
                if (s2 < 0 || s2 > 1) {
                    Alert alert = new Alert();
                    alert.setAbValue(s2);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S2");
                    alertMapper.save(alert);
                }
                double s3 = element.getS3();
                if (s3 < 0 || s3 > 500) {
                    Alert alert = new Alert();
                    alert.setAbValue(s3);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S3");
                    alertMapper.save(alert);
                }
                double s4 = element.getS4();
                if (s4 < 0 || s4 > 500) {
                    Alert alert = new Alert();
                    alert.setAbValue(s4);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S4");
                    alertMapper.save(alert);
                }
                double s5 = element.getS5();
                if (s5 < 0 || s5 > 200) {
                    Alert alert = new Alert();
                    alert.setAbValue(s5);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S5");
                    alertMapper.save(alert);
                }
                double s6 = element.getS6();
                if (s6 < 0 || s6 > 1000) {
                    Alert alert = new Alert();
                    alert.setAbValue(s6);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S6");
                    alertMapper.save(alert);
                }
                double s7 = element.getS7();
                if (s7 < 0 || s7 > 1) {
                    Alert alert = new Alert();
                    alert.setAbValue(s7);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S7");
                    alertMapper.save(alert);
                }
                double s8 = element.getS8();
                if (s8 < 0 || s8 > 200) {
                    Alert alert = new Alert();
                    alert.setAbValue(s8);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S8");
                    alertMapper.save(alert);
                }
                double s9 = element.getS9();
                if (s9 < 0 || s9 > 60) {
                    Alert alert = new Alert();
                    alert.setAbValue(s9);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S9");
                    alertMapper.save(alert);
                }
                double s10 = element.getS10();
                if (s10 < 0 || s10 > 360) {
                    Alert alert = new Alert();
                    alert.setAbValue(s10);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S10");
                    alertMapper.save(alert);
                }
                double s11 = element.getS11();
                if (s11 < 0.01 || s11 > 60) {
                    Alert alert = new Alert();
                    alert.setAbValue(s11);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S11");
                    alertMapper.save(alert);
                }
                double s12 = element.getS12();
                if (s12 < 600 || s12 > 1100) {
                    Alert alert = new Alert();
                    alert.setAbValue(s12);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S12");
                    alertMapper.save(alert);
                }
                double s13 = element.getS13();
                if (s13 < 0 || s13 > 100) {
                    Alert alert = new Alert();
                    alert.setAbValue(s13);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S13");
                    alertMapper.save(alert);
                }
                double s14 = element.getS14();
                if (s14 < -10 || s14 > 50) {
                    Alert alert = new Alert();
                    alert.setAbValue(s14);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S14");
                    alertMapper.save(alert);
                }
                double s15 = element.getS15();
                if (s15 < 0 || s15 > 2000) {
                    Alert alert = new Alert();
                    alert.setAbValue(s15);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S15");
                    alertMapper.save(alert);
                }
                double s16 = element.getS16();
                if (s16 < 0 || s16 > 500) {
                    Alert alert = new Alert();
                    alert.setAbValue(s16);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S16");
                    alertMapper.save(alert);
                }
                double s17 = element.getS17();
                if (s17 < 0 || s17 > 20) {
                    Alert alert = new Alert();
                    alert.setAbValue(s17);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S17");
                    alertMapper.save(alert);
                }
                double s18 = element.getS18();
                if (s18 < 0 || s18 > 100) {
                    Alert alert = new Alert();
                    alert.setAbValue(s18);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S18");
                    alertMapper.save(alert);
                }
                double s19 = element.getS19();
                if (s19 < 0 || s19 > 100) {
                    Alert alert = new Alert();
                    alert.setAbValue(s19);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S19");
                    alertMapper.save(alert);
                }
                double s20 = element.getS20();
                if (s20 < 0 || s20 > 100) {
                    Alert alert = new Alert();
                    alert.setAbValue(s20);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S20");
                    alertMapper.save(alert);
                }
                double s21 = element.getS21();
                if (s21 < 0 || s21 > 100) {
                    Alert alert = new Alert();
                    alert.setAbValue(s21);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S21");
                    alertMapper.save(alert);
                }
                double s22 = element.getS22();
                if (s22 < 0 || s22 > 500) {
                    Alert alert = new Alert();
                    alert.setAbValue(s22);
                    alert.setAlertTime(LocalDateTime.now());
                    alert.setElements("S22");
                    alertMapper.save(alert);
                }
            }

        return -1;
    }
}
