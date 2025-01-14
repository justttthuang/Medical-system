package org.ms.medicalsystem.service.imp;

import org.ms.medicalsystem.dao.DoctorMapper;
import org.ms.medicalsystem.model.Doctor;
import org.ms.medicalsystem.service.MangerService;
import org.ms.medicalsystem.utils.ListPageHelper;
import org.ms.medicalsystem.utils.PageHelper;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangerServiceImpl implements MangerService {
    @Autowired
    DoctorMapper doctorMapper;
//    @Autowired
//    PageHelper pageHelper;
//    @Autowired
//    ListPageHelper listPageHelper;

    @Override
    public ResponseResult addDoctor(Doctor doctor) {
        int number = doctorMapper.insertSelective(doctor);
        if(number != 0){
            return new ResponseResult("200","成功添加");
        }
        return new ResponseResult("404","添加失败");
    }

    @Override
    public ResponseResult updateDoctor(Doctor doctor) {
        int number = doctorMapper.updateByPrimaryKeySelective(doctor);
        if(number != 0){
            return new ResponseResult("200","修改成功");
        }
        return new ResponseResult("400","修改失败");
    }

    @Override
    public ResponseResult getAllDoctor() {
        List<Doctor> list  = doctorMapper.getAllDoctor();
        if(list == null){
            return new ResponseResult("404","查询不到结果");
        }
        return new ResponseResult("200","查询成功",list);
    }

    @Override
    public ResponseResult selectByPrimaryKey(Integer id) {
        Doctor doctor = doctorMapper.selectByPrimaryKey(id);
        if(doctor == null){
            return new ResponseResult("404","查询不到该医生");
        }
        return new ResponseResult("200","查询成功",doctor);
    }

    @Override
    public ResponseResult selectByDepartment(String department) {
        List<Doctor> list = doctorMapper.selectByDepartment(department);
        if(list.size() == 0){
            return new ResponseResult("404","查询失败");
        }
        return new ResponseResult("200","查询成功",list);
    }


}
