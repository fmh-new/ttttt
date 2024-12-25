package com.example.tusttreatment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.tusttreatment.pojo.entity.Doctor;
import com.example.tusttreatment.pojo.entity.Patient;

import java.util.List;

public interface BasePatientService extends IService<Patient> {

    List<Patient> ListPatient();

    boolean removePatientById(Integer patientId);
}
