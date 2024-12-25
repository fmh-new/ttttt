package com.example.tusttreatment.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("doctors")
public class Doctor {

    @TableField("doctor_id")
    @TableId(type = IdType.AUTO)
    private Integer doctorId;

    @TableField("name")
    private String name;

    @TableField("specialty")
    private String specialty;

    @TableField("contact_number")
    private String contactNumber;

    @TableField("is_valid")
    private Integer isValid;

    @TableField("email")
    private String email;
}
