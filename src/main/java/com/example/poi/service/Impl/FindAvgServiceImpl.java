package com.example.poi.service.Impl;

import com.example.poi.domain.Avg;
import com.example.poi.mapper.AvgMapper;
import com.example.poi.service.FindAvgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class FindAvgServiceImpl implements FindAvgService {
    @Autowired
    private AvgMapper avgMapper;


    @Override
    @Transactional
    public  List<List<Avg>> find1Day(Date today) {
        List<List<Avg>> avgList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, 0);
        Date yesterday = calendar.getTime();//这是昨天
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(yesterday);
        avgList.add(avgMapper.findByDate(dateString));
        return avgList;
    }

    @Override
    @Transactional
    public   List<List<Avg>> find3Day(Date today) {
        List<List<Avg>> avgList = new ArrayList<>();
        for(int a = 0; a < 3; a++){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(today);
            calendar.add(Calendar.DAY_OF_MONTH, -(a));
            Date day3 = calendar.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = formatter.format(day3);
            avgList.add(avgMapper.findByDate(dateString));

        }
        return avgList;
    }

    @Override
    @Transactional
    public List<List<Avg>>  find7Day(Date today) {
        List<List<Avg>> avgList = new ArrayList<>();
        for(int a = 0; a < 7; a++){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(today);
            calendar.add(Calendar.DAY_OF_MONTH, -(a));
            Date day7 = calendar.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = formatter.format(day7);
            avgList.add(avgMapper.findByDate(dateString));
        }
        return avgList;

    }

}
