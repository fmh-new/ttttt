package com.example.tusttreatment.controller;


import com.example.tusttreatment.pojo.entity.Medications;
import com.example.tusttreatment.service.BaseMedicationsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
@AllArgsConstructor
public class BaseMedicationsController {

    private BaseMedicationsService baseMedicationsService;

    @RequestMapping("/getMedications")
//    @Operation(summary = "查看所有医生")
    public List<Medications> ListMedications() {
        return baseMedicationsService.ListMedications();
    }

    @PostMapping("/addMedications")
    public boolean addMedications(@RequestBody Medications medications) {
        return baseMedicationsService.save(medications);
    }

    @PostMapping("/updateMedications")
    public boolean updateMedications(Medications medications) {
        return baseMedicationsService.updateById(medications);
    }

    @PostMapping("/delete/medications/{medicationsId}")
    public boolean deleteMedications(@PathVariable Integer medicationsId) {
        return baseMedicationsService.removeMedicationsById(medicationsId);
    }
}
