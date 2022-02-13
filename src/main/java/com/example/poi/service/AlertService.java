package com.example.poi.service;

import com.example.poi.domain.Alert;
import com.example.poi.domain.Elements;
import com.example.poi.mapper.ElementsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AlertService {
    int generateAlert(List<Elements> elements); //生成告警信息
}
