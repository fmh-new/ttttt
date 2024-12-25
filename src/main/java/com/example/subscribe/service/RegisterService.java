package com.example.subscribe.service;

import java.util.List;

import com.example.subscribe.pojo.Qo.*;
import com.example.subscribe.pojo.Vo.MedicalVo;
import com.example.subscribe.pojo.Vo.PrescriptionsVo;
import com.example.subscribe.pojo.Vo.RegisterVo;

public interface RegisterService {

    List<RegisterVo> ListRegister(RegisterQo registerQo);

    boolean addRegister(RegisterQo registerQo);

    boolean updateRegister(RegisterQo registerQo);

    boolean deleteRegister(RegisterQo registerQo);

    List<MedicalVo> getMedical(MedicalQo medicalQo);

    boolean addMedical(MedicalQo2 medicalQo2);

    boolean updateMedical(MedicalQo2 medicalQo2);

    boolean deleteMedical(MedicalQo2 medicalQo2);

    boolean updateAppointmentStatusByPatientId(int patientId, String 已诊断);

    List<PrescriptionsVo> getPrescriptions(PrescriptionsQo prescriptionsQo);

    boolean addPrescriptions(PrescriptionsQo2 prescriptionsQo2);

    boolean updatePrescriptions(PrescriptionsQo2 prescriptionsQo2);

    boolean deletePrescriptions(PrescriptionsQo3 prescriptionsQo3);
}
