package com.example.poi.controller;

import com.example.poi.domain.Alert;
import com.example.poi.domain.Elements;
import com.example.poi.mapper.AlertMapper;
import com.example.poi.mapper.AlertTreatMapper;
import com.example.poi.mapper.ElementsMapper;
import com.example.poi.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AlertController {
    @Autowired
    private AlertService alertService;
    @Autowired
    private AlertMapper alertMapper;
    @Autowired
    private AlertTreatMapper alertTreatMapper;

    @Autowired
    private ElementsMapper elementsMapper;

    @RequestMapping("/toAlert")
    public String toAlert(){
        return "alert";
    }

    @RequestMapping("/alert")
    public String alert(){
        int i = alertService.generateAlert(elementsMapper.findAllElements());
        return "redirect:/alert_info";
    }


    @RequestMapping("/alert_info")
    public String alertInfo(Model model){
        List<Alert> alerts = alertMapper.alertCount();
        alertTreatMapper.save(alerts);
        model.addAttribute("alerts",alertTreatMapper.findAll());
        return "alert_info";
    }

}
