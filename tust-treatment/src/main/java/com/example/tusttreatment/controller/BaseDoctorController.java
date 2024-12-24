package com.example.tusttreatment.controller;


import com.example.tusttreatment.pojo.entity.Doctor;
import com.example.tusttreatment.service.BaseDoctorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
@AllArgsConstructor
public class BaseDoctorController {

    private BaseDoctorService baseDoctorService;

    @RequestMapping("/getDoctor")
//    @Operation(summary = "查看所有医生")
    public List<Doctor> ListDoctor() {
        return baseDoctorService.ListDoctor();
    }

    @PostMapping("/addDoctor")
    public boolean addDoctor(@RequestBody Doctor doctors) {
        return baseDoctorService.save(doctors);
    }

    @PostMapping("/updateDoctor")
    public boolean updateDoctor(Doctor doctors) {
        return baseDoctorService.updateById(doctors);
    }

    @PostMapping("/delete/doctor/{doctorId}")
    public boolean deleteDoctor(@PathVariable Integer doctorId) {
        return baseDoctorService.removeDoctorById(doctorId);
    }
}


