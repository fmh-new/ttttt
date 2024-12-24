package com.example.subscribe.mapper;

import com.example.subscribe.pojo.Qo.MedicalQo;
import com.example.subscribe.pojo.Qo.MedicalQo2;
import com.example.subscribe.pojo.Qo.PrescriptionsQo;
import com.example.subscribe.pojo.Qo.RegisterQo;
import com.example.subscribe.pojo.Vo.MedicalVo;
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

    List<PrescriptionsQo> getPrescriptions(PrescriptionsQo prescriptionsQo);
}
