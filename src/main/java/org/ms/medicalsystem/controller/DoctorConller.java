package org.ms.medicalsystem.controller;

import org.ms.medicalsystem.model.Hospitalization;
import org.ms.medicalsystem.model.MedicalOrder;
import org.ms.medicalsystem.model.MedicineDispense;
import org.ms.medicalsystem.service.DoctorService;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorConller {
    @Autowired
    DoctorService doctorService;

    //查看所有医嘱
    @GetMapping("/doctor/getAllMO")
    public ResponseResult getAllMO(){
        return doctorService.getAllMO();
    }
    //新建医嘱
    @PostMapping("/doctor/setOneMO")
    public ResponseResult setOneMO(@RequestBody MedicalOrder medicalOrder){
        return doctorService.insertSelective(medicalOrder);
    }
    //查看自己所写的医嘱
    @GetMapping("/doctor/getMyselfMO/{doctorId}")
    public ResponseResult getMyselfMO(@PathVariable int doctorId){
        return doctorService.selectByDoctorId(doctorId);
    }

    //查看所有的药单
    @GetMapping("/doctor/getMyselfMO")
    public ResponseResult getAllMD(){
        return doctorService.getAllMD();
    }

    //创建新的药单
    @PostMapping("/doctor/setOneMD")
    public ResponseResult setMD(@RequestBody MedicineDispense medicineDispense){
        return doctorService.setMD(medicineDispense);
    }
    //查看患者的药单
    @GetMapping("/doctor/getMyselfMD/{patientId}")
    public ResponseResult getMyselfMD(@PathVariable Integer patientId){
        return doctorService.selectBypatientId(patientId);
    }

    //查看所有住院
    @GetMapping("/doctor/getAllHp")
    public ResponseResult getAllHp(){
        return doctorService.getAllHp();
    }
    //创建新的住院单
    @PostMapping("/doctor/setHp")
    public ResponseResult setHp(@RequestBody Hospitalization hospitalization){
        return doctorService.setHp(hospitalization);
    }
    //修改住院单,增加出院时间
    @PostMapping("/doctor/discharge/{id}")
    public ResponseResult discharge(@PathVariable int id){
        return doctorService.discharge(id);
    }
}
