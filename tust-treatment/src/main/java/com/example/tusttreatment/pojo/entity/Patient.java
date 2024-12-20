package com.example.tusttreatment.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.tusttreatment.pojo.enums.PatientsEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("patients")
public class Patient {
    @TableField("patient_id")
    @TableId(type = IdType.AUTO)
    private Integer patientId;

    @TableField("name")
    private String name;

    @TableField("gender")
    private PatientsEnum gender;

    @TableField("date_of_birth")
    private Date dateOfBirth;

    @TableField("contact_number")
    private String contactNumber;

    @TableField("address")
    private String address;

    @TableField("created_at")
    private Date createdAt;

    @TableField("updated_at")
    private Date updatedAt;

    @TableField("is_valid")
    private Integer isValid;
}
