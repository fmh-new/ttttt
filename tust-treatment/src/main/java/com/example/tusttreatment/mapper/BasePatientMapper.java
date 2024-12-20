package com.example.tusttreatment.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.tusttreatment.pojo.entity.Doctor;
import com.example.tusttreatment.pojo.entity.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BasePatientMapper extends BaseMapper<Patient> {
    //查询所有医生
    List<Patient> ListPatient();

    boolean removePatientById(Integer doctorId);
}