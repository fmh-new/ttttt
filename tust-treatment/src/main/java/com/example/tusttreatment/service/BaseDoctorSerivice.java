package com.example.tusttreatment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.tusttreatment.pojo.entity.Doctor;


import java.util.List;

public interface BaseDoctorSerivice extends IService<Doctor> {

    List<Doctor> ListDoctor();

    boolean removeDoctorById(Integer doctorId);
}
