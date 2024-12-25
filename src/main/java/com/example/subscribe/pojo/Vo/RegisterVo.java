package com.example.subscribe.pojo.Vo;

import lombok.Data;

import java.util.Date;
@Data
public class RegisterVo {

    private String patientName;

    private String doctorName;

    private Date appointmentDate;

    private String status;

    private Date createdAt;

    private Date updatedAt;
}
