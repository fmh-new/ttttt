package com.example.subscribe.service;

import java.util.List;

import com.example.subscribe.pojo.Qo.MedicalQo;
import com.example.subscribe.pojo.Qo.PrescriptionsQo;
import com.example.subscribe.pojo.Qo.RegisterQo;
import com.example.subscribe.pojo.Qo.MedicalQo2;
import com.example.subscribe.pojo.Vo.MedicalVo;
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

    List<PrescriptionsQo> getPrescriptions(PrescriptionsQo prescriptionsQo);
}
