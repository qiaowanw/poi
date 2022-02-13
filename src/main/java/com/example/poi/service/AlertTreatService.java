package com.example.poi.service;

import com.example.poi.domain.AlertTreat;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AlertTreatService {
    List<AlertTreat> showAlertInfo(String username);
}
