package com.example.poi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alert {
    private int id;
    private String elements;
    private LocalDateTime alertTime;
    private double abValue;
    private int alertTimes;
    private String alertInfo;
}
