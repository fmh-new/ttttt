package com.example.subscribe.controller;

import com.example.subscribe.pojo.Qo.MedicalQo;
import com.example.subscribe.pojo.Qo.PrescriptionsQo;
import com.example.subscribe.pojo.Qo.RegisterQo;
import com.example.subscribe.pojo.Qo.MedicalQo2;
import com.example.subscribe.pojo.Vo.MedicalVo;
import com.example.subscribe.pojo.Vo.RegisterVo;
import com.example.subscribe.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
@AllArgsConstructor
public class RegisterController {

    private RegisterService registerService;

    @GetMapping("/getRegister")
    public List<RegisterVo> getRegister(RegisterQo registerQo){
        return registerService.ListRegister(registerQo);
    }

    @PostMapping("/addRegister")
    public boolean addRegister(RegisterQo registerQo){
        return registerService.addRegister(registerQo);
    }

    @PostMapping("/updateRegister")
    public boolean updateRegister(RegisterQo registerQo){
        return registerService.updateRegister(registerQo);
    }

    @PostMapping("/deleteRegister")
    public boolean deleteRegister(RegisterQo registerQo){
        return registerService.deleteRegister(registerQo);
    }

    @GetMapping("/getMedical")
    public List<MedicalVo> getMedical(MedicalQo medicalQo){
        return registerService.getMedical(medicalQo);
    }

    @PostMapping("/addMedical")
    public boolean addMedical(MedicalQo2 medicalQo2) {
        // 添加医疗记录
        boolean addSuccess = registerService.addMedical(medicalQo2);
        if (addSuccess) {
            // 获取 patientId
            int patientId = medicalQo2.getPatientId();
            // 更新 appointments 表中的状态为“已诊断”
            boolean updateSuccess = registerService.updateAppointmentStatusByPatientId(patientId, "已诊断");
            // 返回添加和更新是否都成功
            return updateSuccess;
        } else {
            // 如果添加医疗记录失败，返回 false
            return false;
        }
    }


    @PostMapping("/updateMedical")
    public boolean updateMedical(MedicalQo2 medicalQo2){
        return registerService.updateMedical(medicalQo2);
    }

    @PostMapping("/deleteMedical")
    public boolean deleteMedical(MedicalQo2 medicalQo2){
        return registerService.deleteMedical(medicalQo2);
    }

    @GetMapping("/getPrescriptions")
    public List<PrescriptionsQo> getPrescriptions(PrescriptionsQo prescriptionsQo){
        return registerService.getPrescriptions(prescriptionsQo);
    }

}
