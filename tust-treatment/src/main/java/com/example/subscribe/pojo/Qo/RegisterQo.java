package com.example.subscribe.pojo.Qo;

import lombok.Data;

@Data
public class RegisterQo {
    private Integer patientId;
    private Integer doctorId;
    private String appointmentDate;
    private String status;
}
