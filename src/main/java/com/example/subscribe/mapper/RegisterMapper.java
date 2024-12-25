package com.example.subscribe.mapper;

import com.example.subscribe.pojo.Qo.*;
import com.example.subscribe.pojo.Vo.MedicalVo;
import com.example.subscribe.pojo.Vo.PrescriptionsVo;
import com.example.subscribe.pojo.Vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface RegisterMapper {

    List<RegisterVo> ListRegister(RegisterQo registerQo);

    boolean addRegister(RegisterQo registerQo);

    @Select("SELECT doctor_id as doctorId FROM doctors WHERE name = #{name}")
    int getDoctorIdById(@Param("name") String name);

    @Select("SELECT patient_id as patientId FROM patients WHERE name = #{name}")
    int getPatientIdById(@Param("name") String name);

    boolean updateRegister(RegisterQo registerQo);

    boolean deleteRegister(RegisterQo registerQo);

    List<MedicalVo> getMedical(MedicalQo medicalQo);

    boolean addMedical(MedicalQo2 medicalQo2);

    boolean updateMedical(MedicalQo2 medicalQo2);

    boolean deleteMedical(MedicalQo2 medicalQo2);

    @Update("UPDATE appointments SET status = #{status} WHERE patient_id = #{patientId}")
    boolean updateStatusByPatientId(@Param("patientId") int patientId, @Param("status") String status);

    List<PrescriptionsVo> getPrescriptions(PrescriptionsQo prescriptionsQo);

    @Select("SELECT medication_id as medicationId FROM medications WHERE name = #{name}")
    int getMedicalIdById(@Param("name") String name);

    @Select("SELECT record_id as recordId FROM medical_records WHERE patient_id = #{patient_id}")
    int getRecordId(@Param("patient_id") int patient_id);

    boolean addPrescriptions(PrescriptionsQo2 prescriptionsQo2);

    boolean updatePrescriptions(PrescriptionsQo2 prescriptionsQo2);

    boolean deletePrescriptions(PrescriptionsQo3 prescriptionsQo3);
}
