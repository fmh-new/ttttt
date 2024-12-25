package com.example.tusttreatment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.tusttreatment.mapper.BaseMedicationsMapper;
import com.example.tusttreatment.pojo.entity.Medications;
import com.example.tusttreatment.service.BaseMedicationsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BaseMedicationsServiceImpl extends ServiceImpl<BaseMedicationsMapper,Medications> implements BaseMedicationsService {

    private BaseMedicationsMapper baseMedicationsMapper;

    @Override
    public List<Medications> ListMedications() {
        return baseMedicationsMapper.ListMedications();
    }

    @Override
    public boolean removeMedicationsById(Integer medicationsId) {
        return baseMedicationsMapper.removeMedicationsById(medicationsId);
    }
}
