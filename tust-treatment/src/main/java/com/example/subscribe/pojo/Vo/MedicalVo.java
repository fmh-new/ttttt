package com.example.subscribe.pojo.Vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class MedicalVo {

//    @TableField("patient_id")
//    private Integer patientId;         // 患者id

    private String patientName;

    @TableField("visit_date")
    private Date visitDate;            // 就诊日期

    @TableField("chief_complaint")
    private String chiefComplaint;      // 主诉

    @TableField("medical_history")
    private String medicalHistory;      // 病史

    @TableField("physical_exam")
    private String physicalExam;        // 体检结果

    @TableField("diagnosis")
    private String diagnosis;           // 诊断

    @TableField("treatment_plan")
    private String treatmentPlan;       // 治疗方案
}