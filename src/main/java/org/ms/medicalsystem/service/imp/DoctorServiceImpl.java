package org.ms.medicalsystem.service.imp;

import org.ms.medicalsystem.dao.HospitalizationMapper;
import org.ms.medicalsystem.dao.MedicalOrderMapper;
import org.ms.medicalsystem.dao.MedicineDispenseMapper;
import org.ms.medicalsystem.dao.RegistrationMapper;
import org.ms.medicalsystem.model.Hospitalization;
import org.ms.medicalsystem.model.MedicalOrder;
import org.ms.medicalsystem.model.MedicineDispense;
import org.ms.medicalsystem.model.Registration;
import org.ms.medicalsystem.service.DoctorService;
import org.ms.medicalsystem.utils.PageHelper;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    MedicalOrderMapper medicalOrderMapper;
    @Autowired
    MedicineDispenseMapper medicineDispenseMapper;
    @Autowired
    HospitalizationMapper hospitalizationMapper;
    @Autowired
    RegistrationMapper registrationMapper;
    @Override
    public ResponseResult getAllMO() {
        try {
            List<MedicalOrder> list = medicalOrderMapper.getAll();
            return new ResponseResult("200","查询成功",list);
        }catch (Exception e){}
        return new ResponseResult("404","查询失败");
    }

    @Override
    public ResponseResult insertSelective(MedicalOrder medicalOrder) {
        int number = medicalOrderMapper.insertSelective(medicalOrder);
        if(number == 1){
            return new ResponseResult("200","创建成功");
        }
        return new ResponseResult("404","创建失败");
    }

    @Override
    public ResponseResult selectByDoctorId(int doctorId) {
        try {
            List<MedicalOrder> list = medicalOrderMapper.selectByDoctorId(doctorId);
            if(list.size() != 0){
                return new ResponseResult("200","查询成功",list);
            }
        }catch (Exception e){}
        return new ResponseResult("404","查询失败");
    }

    @Override
    public ResponseResult getAllMD() {
        try {
            List<MedicineDispense> list = medicineDispenseMapper.getAll();
            return new ResponseResult("200","查询成功",list);
        }catch (Exception e){
            return new ResponseResult("404","查询失败");
        }
    }

    @Override
    public ResponseResult setMD(MedicineDispense medicineDispense) {
        medicineDispense.setStatus("未支付");
        int number = medicineDispenseMapper.insertSelective(medicineDispense);
        if(number == 1){
            return new ResponseResult("200","创建成功");
        }
        return new ResponseResult("404","创建失败");
    }

    @Override
    public ResponseResult selectBypatientId(Integer patientId) {
        try {
            List<MedicineDispense> list = medicineDispenseMapper.selectBypatientId(patientId);
            if(list.size() != 0){
                return new ResponseResult("200","查询成功",list);
            }
        }catch (Exception e){
        }
        return new ResponseResult("404","查询失败");
    }

    @Override
    public ResponseResult getAllHp() {
        try{
            List<Hospitalization> list = hospitalizationMapper.getAllHp();
            if(list.size() != 0){
                return new ResponseResult("200","查询成功",list);
            }
        }catch (Exception e){}
        return new ResponseResult("404","查询失败");
    }

    @Override
    public ResponseResult setHp(Hospitalization hospitalization) {
        try {
            int number= hospitalizationMapper.insertSelective(hospitalization);
            if(number == 1){
                return new ResponseResult("200","新增成功");
            }
        }catch (Exception e){
            return new ResponseResult("404","新增失败");
        }
        return new ResponseResult("404","新增失败");

    }

    @Override
    public ResponseResult discharge(int id) {
        int number = hospitalizationMapper.discharge(id);
        if(number == 1){
            return new ResponseResult("200","办理出院成功");
        }
        return new ResponseResult("404","操作失败");
    }

    @Override
    public ResponseResult getMyselfGt(Integer doctorId) {
        try {
            List<Registration> list = registrationMapper.selectByDoctorId(doctorId);
            if(list.size() != 0){
                return new ResponseResult("200","查询成功",list);
            }
        }catch (Exception e){
            return new ResponseResult("404","查询失败");
        }
        return new ResponseResult("404","查询失败");

    }

    @Override
    public ResponseResult visit(Integer registrationId) {
        try{
            Registration registration = registrationMapper.selectByPrimaryKey(registrationId);
            registration.setStatus("就诊中");
            int number = registrationMapper.updateByPrimaryKeySelective(registration);
            if(number == 1){
                return new ResponseResult("200","更新成功");
            }
        }catch (Exception e){
            return new ResponseResult("404","更新失败");
        }
        return new ResponseResult("404","更新失败");
    }

    @Override
    public ResponseResult over(Integer registrationId) {
        Registration registration = registrationMapper.selectByPrimaryKey(registrationId);
        registration.setStatus("就诊完成");
        int number = registrationMapper.updateByPrimaryKeySelective(registration);
        if(number == 1){
            return new ResponseResult("200","更新成功");
        }
        return new ResponseResult("404","更新失败");

    }


}
