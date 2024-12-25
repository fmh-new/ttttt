package com.example.subscribe.pojo.Vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class MedicalVo {

    private Integer patientId;         // 患者id

    private String patientName;

    private Date visitDate;            // 就诊日期

    private String chiefComplaint;      // 主诉

    private String medicalHistory;      // 病史

    private String physicalExam;        // 体检结果

    private String diagnosis;           // 诊断

    private String treatmentPlan;       // 治疗方案
}