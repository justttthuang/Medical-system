package org.ms.medicalsystem.service.imp;

import org.ms.medicalsystem.dao.MedicalOrderMapper;
import org.ms.medicalsystem.dao.MedicineDispenseMapper;
import org.ms.medicalsystem.model.MedicalOrder;
import org.ms.medicalsystem.model.MedicineDispense;
import org.ms.medicalsystem.service.DoctorService;
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
            return new ResponseResult("200","查询成功",list);
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
}
