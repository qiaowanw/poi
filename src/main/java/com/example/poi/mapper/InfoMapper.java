package com.example.poi.mapper;

import com.example.poi.domain.Info;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoMapper {
    int save(Info info); //插入一条监测标准
}
