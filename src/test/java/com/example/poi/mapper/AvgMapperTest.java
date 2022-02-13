package com.example.poi.mapper;

import com.example.poi.domain.Avg;
import com.example.poi.domain.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AvgMapperTest {
    @Autowired
    private AvgMapper avgMapper;
    Elements elements = new Elements();

   /*
    List<Avg> findAvg(Elements elements);
    int save(Avg avg);
    */

    @Test
    void findAvg() {
        avgMapper.findAvg().forEach(System.out::println);
    }

    @Test
    void save() {
        avgMapper.save(avgMapper.findAvg());

    }

    @Test
    void findByDate() throws ParseException {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        Date yesterday = calendar.getTime();//这是昨天
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(yesterday);
        avgMapper.findByDate(dateString).forEach(System.out::println);

    }

    @Test
    void testOk(){
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, -3);
        Date yesterday = calendar.getTime();//这是昨天
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(yesterday);
        System.out.println(dateString);
    }
}