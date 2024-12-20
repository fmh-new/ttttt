package com.example.tusttreatment.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.tusttreatment.pojo.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BaseDoctorMapper extends BaseMapper<Doctor> {
    //查询所有医生
    List<Doctor> ListDoctor();

    boolean removeDoctorById(Integer doctorId);
}
