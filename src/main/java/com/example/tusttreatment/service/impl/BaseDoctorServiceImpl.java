package com.example.tusttreatment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.tusttreatment.mapper.BaseDoctorMapper;
import com.example.tusttreatment.pojo.entity.Doctor;
import com.example.tusttreatment.service.BaseDoctorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BaseDoctorServiceImpl extends ServiceImpl<BaseDoctorMapper,Doctor> implements BaseDoctorService {

    private BaseDoctorMapper baseDoctorMapper;
    @Override
    public List<Doctor> ListDoctor() {
        return baseDoctorMapper.ListDoctor();
    }

    @Override
    public boolean removeDoctorById(Integer doctorId) {
        return baseDoctorMapper.removeDoctorById(doctorId);
    }
}