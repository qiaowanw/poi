package com.example.poi.controller;

import com.example.poi.service.FindAvgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


@Controller
public class FindAvgController {
    @Autowired
    private FindAvgService findAvgService;

   /* @InitBinder
    public void initBinderQuery(WebDataBinder binder){
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }*/
   @InitBinder
   public void initBinder(WebDataBinder dataBinder) {
       dataBinder.registerCustomEditor(java.util.Date.class,
               new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
   }

    @GetMapping(value="/avg")
    public String avg(Model model){
        return "find_avg";
    }

  @RequestMapping("/find_avg")
  public String findAvg(@RequestParam("i") int i, @RequestParam("date") String date, Model model) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(date);
        if(i==1 && date!=null)
           model.addAttribute("avgs",findAvgService.find1Day(parse));
        if(i==2 && date!=null)
            model.addAttribute("avgs",findAvgService.find3Day(parse));
        if(i==3 && date!=null)
           model.addAttribute("avgs",findAvgService.find7Day(parse));
        return "find_avg";
  }
}
