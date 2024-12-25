package com.example.tusttreatment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.tusttreatment.mapper.BasePatientMapper;
import com.example.tusttreatment.pojo.entity.Patient;
import com.example.tusttreatment.service.BasePatientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BasePatientServiceImpl extends ServiceImpl<BasePatientMapper, Patient> implements BasePatientService {


    private BasePatientMapper basePatientMapper;

    @Override
    public List<Patient> ListPatient()
    {
        return basePatientMapper.ListPatient();
    }

    @Override
    public boolean removePatientById(Integer patientId)
    {
        return basePatientMapper.removePatientById(patientId);
    }

}
