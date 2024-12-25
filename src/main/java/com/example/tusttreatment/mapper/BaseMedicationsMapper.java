package com.example.tusttreatment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.tusttreatment.pojo.entity.Medications;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseMedicationsMapper extends BaseMapper<Medications> {

    List<Medications> ListMedications();

    boolean removeMedicationsById(Integer medicationsId) ;
}
