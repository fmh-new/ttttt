package com.example.subscribe.pojo.Qo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class RegisterQo {
    @TableField("appointment_id")
    private Integer id;

    private Integer patientId;
    private String patientName;
    private Integer doctorId;
    private String doctorName;
    private String appointmentDate;
    private String status;

}
