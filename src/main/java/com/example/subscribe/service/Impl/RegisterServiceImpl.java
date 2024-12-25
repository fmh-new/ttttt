package com.example.subscribe.service.Impl;

import com.example.subscribe.mapper.RegisterMapper;
import com.example.subscribe.pojo.Qo.*;
import com.example.subscribe.pojo.Vo.MedicalVo;
import com.example.subscribe.pojo.Vo.PrescriptionsVo;
import com.example.subscribe.pojo.Vo.RegisterVo;
import com.example.subscribe.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RegisterServiceImpl implements RegisterService {
    private RegisterMapper registerMapper;

    @Override
    public List<RegisterVo> ListRegister(RegisterQo registerQo) {
        return registerMapper.ListRegister(registerQo);
    }

    @Override
    public boolean addRegister(RegisterQo registerQo) {
        int doctorId =registerMapper.getDoctorIdById(registerQo.getDoctorName());
        registerQo.setDoctorId(doctorId);
        int patientId =registerMapper.getPatientIdById(registerQo.getPatientName());
        registerQo.setPatientId(patientId);
        return registerMapper.addRegister(registerQo);
    }

    @Override
    public boolean updateRegister(RegisterQo registerQo) {
        if (registerQo.getDoctorName() != null && !registerQo.getDoctorName().equals("")) {
            int doctorId = registerMapper.getDoctorIdById(registerQo.getDoctorName());
            registerQo.setDoctorId(doctorId);
        }
        if (registerQo.getPatientName() != null && !registerQo.getPatientName().equals("")) {
            int patientId = registerMapper.getPatientIdById(registerQo.getPatientName());
            registerQo.setPatientId(patientId);
        }

        return registerMapper.updateRegister(registerQo);
    }

    @Override
    public boolean deleteRegister(RegisterQo registerQo) {
        return registerMapper.deleteRegister(registerQo);
    }

    @Override
    public List<MedicalVo> getMedical(MedicalQo medicalQo) {
        return registerMapper.getMedical(medicalQo);
    }

    @Override
    public boolean addMedical(MedicalQo2 medicalQo2) {
        medicalQo2.setPatientId(registerMapper.getPatientIdById(medicalQo2.getPatientName()));
        return registerMapper.addMedical(medicalQo2);
    }

    @Override
    public boolean updateMedical(MedicalQo2 medicalQo2) {
        if (medicalQo2.getPatientName() != null && !medicalQo2.getPatientName().equals("")) {
            medicalQo2.setPatientId(registerMapper.getPatientIdById(medicalQo2.getPatientName()));
        }
        return registerMapper.updateMedical(medicalQo2);
    }

    @Override
    public boolean deleteMedical(MedicalQo2 medicalQo2) {
        return registerMapper.deleteMedical(medicalQo2);
    }

    @Override
    public boolean updateAppointmentStatusByPatientId(int patientId, String 已诊断) {
        return registerMapper.updateStatusByPatientId(patientId, 已诊断);
    }

    @Override
    public List<PrescriptionsVo> getPrescriptions(PrescriptionsQo prescriptionsQo) {
        return registerMapper.getPrescriptions(prescriptionsQo);
    }

    @Override
    public boolean addPrescriptions(PrescriptionsQo2 prescriptionsQo2) {
        // 根据患者姓名获取患者 ID
        int patientId = registerMapper.getPatientIdById(prescriptionsQo2.getPatientName());
        prescriptionsQo2.setPatientId(patientId);

        // 根据患者 ID 获取记录 ID
        int recordId = registerMapper.getRecordId(patientId);
        prescriptionsQo2.setRecordId(recordId);

        // 根据药物名称获取药物 ID
        int medicationId = registerMapper.getMedicalIdById(prescriptionsQo2.getMedicationName());
        prescriptionsQo2.setMedicationId(medicationId);

        // 添加处方并返回结果
        return registerMapper.addPrescriptions(prescriptionsQo2);
    }

    @Override
    public boolean updatePrescriptions(PrescriptionsQo2 prescriptionsQo2) {
        if (prescriptionsQo2.getPatientName() != null && !prescriptionsQo2.getPatientName().equals("")) {
            int patientId = registerMapper.getPatientIdById(prescriptionsQo2.getPatientName());
            prescriptionsQo2.setPatientId(patientId);

            int recordId = registerMapper.getRecordId(patientId);
            prescriptionsQo2.setRecordId(recordId);
        }
        if (prescriptionsQo2.getMedicationName() != null && !prescriptionsQo2.getMedicationName().equals("")) {
            int medicationId = registerMapper.getMedicalIdById(prescriptionsQo2.getMedicationName());
            prescriptionsQo2.setMedicationId(medicationId);
        }
        return registerMapper.updatePrescriptions(prescriptionsQo2);
    }

    @Override
    public boolean deletePrescriptions(PrescriptionsQo3 prescriptionsQo3) {
        return registerMapper.deletePrescriptions(prescriptionsQo3);
    }


}
