package com.example.poi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlertTreat {
    private int id;
    private String username;
    private String abElements;
    private int alertTimes;
    private String alertInfo;
    private String treatment;
}
