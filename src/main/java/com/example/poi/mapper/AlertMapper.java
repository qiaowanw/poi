package com.example.poi.mapper;

import com.example.poi.domain.Alert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AlertMapper {
    int save(Alert alert);
    List<Alert> alertCount(); //根据同一个元素和故障类型统计告警次数,返回元素、故障类型、次数
}
