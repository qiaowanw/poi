package com.example.poi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info {

    /*
    code varchar(50),
    elements varchar(50),
    sd_lower_limit float,
    sd_upper_limit float,
    unit varchar(50),
    vd_lower_limit float,
    vd_upper_limit float
     */
    private String code;
    private String elements;
    private double sdLowerLimit;
    private double sdUpperLimit;
    private String unit;
    private double vdLowerLimit;
    private double vdUpperLimit;

}
