package com.example.poi.mapper;

import com.example.poi.domain.Avg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface AvgMapper {
    List<Avg> findAvg(); //按小时计算均值，查出来
    int save(@Param("avgs") List<Avg> avgs); //查出的均值插入均值统计表avg
    List<Avg> findByDate(@Param("date") String date); //按日期查出当日24小时均值
}
