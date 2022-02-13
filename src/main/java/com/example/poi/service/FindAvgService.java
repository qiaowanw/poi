package com.example.poi.service;

import com.example.poi.domain.Avg;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


public interface FindAvgService {
    List<List<Avg>> find1Day(Date date); //查24小时均值
    List<List<Avg>> find3Day(Date date); //查3天均值
    List<List<Avg>>  find7Day(Date date); //查7天均值
}
