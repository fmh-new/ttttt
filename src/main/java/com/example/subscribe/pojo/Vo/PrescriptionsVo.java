package com.example.subscribe.pojo.Vo;

import lombok.Data;

import java.util.Date;

@Data
public class PrescriptionsVo {

    private String patientName;

    private String medicationName;

    private String dosage;

    private String frequency;

    private String duration;

    private Date createdAt;

    private Date updatedAt;
}
