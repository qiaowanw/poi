package com.example.poi.service;

import com.example.poi.domain.Avg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FindAvgServiceImplTest {
    @Autowired
    private FindAvgService findAvgService;

    @Test
    void find1Day() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        Date date = simpleDateFormat.parse("2021-12-11");
        findAvgService.find1Day(date).forEach(System.out::println);
    }

    @Test
    void find3Day() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        Date date = simpleDateFormat.parse("2021-12-11");
        List<List<Avg>> avgService3Day = findAvgService.find3Day(date);
        for (List<Avg> avgList:avgService3Day){
            for(Avg avg:avgList){
                System.out.println(avg.toString());
            }
        }
    }

    @Test
    void find7Day () throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        Date date = simpleDateFormat.parse("2021-12-11");
        List<List<Avg>> avgService7Day = findAvgService.find3Day(date);
        for (List<Avg> avgList:avgService7Day){
            for(Avg avg:avgList){
                System.out.println(avg.toString());
            }
        }
    }
}