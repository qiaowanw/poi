package com.example.poi.service.Impl;

import com.example.poi.domain.AlertTreat;
import com.example.poi.mapper.AlertTreatMapper;
import com.example.poi.service.AlertTreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlertTreatServiceImpl implements AlertTreatService {


   @Autowired
   private AlertTreatMapper alertTreatMapper;

    @Override
    @Transactional
    public List<AlertTreat> showAlertInfo(String username) {
        return alertTreatMapper.showAlertInfoByUser(username);
    }
}
