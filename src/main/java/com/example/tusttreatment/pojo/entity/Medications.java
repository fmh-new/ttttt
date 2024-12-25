package com.example.tusttreatment.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("medications")
public class Medications {

    @TableField("medication_id")
    @TableId(type = IdType.AUTO)
    private Integer medicationId;

    @TableField("name")
    private String name;

    @TableField("dosage")
    private String dosage;

    @TableField("side_effects")
    private String sideEffects;

    @TableField("created_at")
    private Date createdAt;

    @TableField("updated_at")
    private Date updatedAt;

    @TableField("is_valid")
    private Integer isValid;
}
