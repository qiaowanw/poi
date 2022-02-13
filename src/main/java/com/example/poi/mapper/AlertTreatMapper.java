package com.example.poi.mapper;

import com.example.poi.domain.Alert;
import com.example.poi.domain.AlertTreat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AlertTreatMapper {
    int save(@Param("alertTreat") List<Alert> alert);
    List<AlertTreat> showAlertInfoByUser(@Param("username")String username);
    List<AlertTreat> findAll();
}
