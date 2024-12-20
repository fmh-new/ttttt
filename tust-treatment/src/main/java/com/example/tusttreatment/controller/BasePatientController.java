package com.example.tusttreatment.controller;

import com.example.tusttreatment.pojo.entity.Patient;
import com.example.tusttreatment.service.BasePatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
@AllArgsConstructor
public class BasePatientController {

    private BasePatientService basePatientService;

    @RequestMapping("/getPatient")
//    @Operation(summary = "查看所有病人")
    public List<Patient> ListPatient(){
        return basePatientService.ListPatient();
    }

    @PostMapping("/addPatient")
    public boolean addPatient(@RequestBody Patient patients){
        return basePatientService.save(patients);
    }

    @PostMapping("/updatePatient")
    public boolean updatePatient(Patient patients){
        return basePatientService.updateById(patients);
    }

    @PostMapping("/delete/{patientId}")
    public boolean deletePatient(@PathVariable Integer patientId) {
        return basePatientService.removePatientById(patientId);
    }
}
