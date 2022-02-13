package com.example.poi.mapper;

import com.example.poi.domain.Elements;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ElementsMapper {
    int save(Elements elements); //插入一条即时测试数据
    List<Elements> findAllElements(); //查出所有监控数据
}
