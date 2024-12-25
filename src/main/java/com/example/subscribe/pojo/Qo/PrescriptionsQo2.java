package com.example.subscribe.pojo.Qo;

import lombok.Data;

import java.util.Date;

@Data
public class PrescriptionsQo2 {

    private Integer id;

    private Integer recordId;

    private Integer patientId;

    private String patientName;

    private Integer medicationId;

    private String medicationName;

    private String dosage;

    private String frequency;

    private String duration;

    private Date createdAt;

    private Date updatedAt;
}
