package com.example.subscribe.service;

import java.util.List;

import com.example.subscribe.pojo.Qo.MedicalQo;
import com.example.subscribe.pojo.Qo.RegisterQo;
import com.example.subscribe.pojo.Vo.MedicalVo;
import com.example.subscribe.pojo.Vo.RegisterVo;

public interface RegisterService {

    List<RegisterVo> ListRegister(RegisterQo registerQo);

    boolean addRegister(RegisterQo registerQo);

    boolean updateRegister(RegisterQo registerQo);

    boolean deleteRegister(RegisterQo registerQo);

    List<MedicalVo> getMedical(MedicalQo medicalQo);
}
