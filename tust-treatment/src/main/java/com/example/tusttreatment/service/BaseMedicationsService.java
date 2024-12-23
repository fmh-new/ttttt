package com.example.tusttreatment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.tusttreatment.pojo.entity.Medications;
import java.util.List;

public interface BaseMedicationsService extends IService<Medications> {

    List<Medications> ListMedications();

    boolean removeMedicationsById(Integer medicationsId) ;
}
