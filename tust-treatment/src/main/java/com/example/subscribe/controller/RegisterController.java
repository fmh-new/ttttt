package com.example.subscribe.controller;

import com.example.subscribe.pojo.Qo.MedicalQo;
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
    public boolean addMedical(@RequestBody MedicalQo2 medicalQo2){
        return registerService.addMedical(medicalQo2);
    }

}
