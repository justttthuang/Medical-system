package org.ms.medicalsystem.controller;

import org.ms.medicalsystem.model.Doctor;
import org.ms.medicalsystem.model.Medicine;
import org.ms.medicalsystem.service.MangerService;
import org.ms.medicalsystem.service.MedicinService;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//管理员模块
//添加医生信息
//修改医生信息
//查看所有医生信息
@RestController
public class MangerController {
    @Autowired
    MangerService mangerService;

    @Autowired
    MedicinService medicinService;

    //添加医生信息/manger/addDoctor
    @PostMapping("/manger/addDoctor")
    public ResponseResult adddDoctor(@RequestBody Doctor doctor){
        return mangerService.addDoctor(doctor);
    }

    //修改医生信息(可以板顶医生账号)
    @PutMapping("/manger/updateDoctor")
    public ResponseResult updateDoctor(@RequestBody Doctor doctor){
        return mangerService.updateDoctor(doctor);
    }

    //查看所有医生信息
    @GetMapping("/manger/getAllDoctor")
    public ResponseResult getAllDoctor(){
        return mangerService.getAllDoctor();
    }

    //根据医生主键查询
    @GetMapping("/manger/getOneDoctor/{id}")
    public ResponseResult getOneDoctor(@PathVariable Integer id){
        return mangerService.selectByPrimaryKey(id);
    }

    //根据科室查看医生
    @GetMapping("/manger/getDepartmentDoctor/{department}")
    public ResponseResult getDepartmentDoctor(@PathVariable String department){
        return mangerService.selectByDepartment(department);
    }


    //药瓶管理模块
    //添加药品
    @PostMapping("/manger/addMedicine")
    public ResponseResult addMedicine(@RequestBody Medicine medicine){
        return medicinService.insertSelective(medicine);
    }
    //查看所有的药品
    @GetMapping("/manger/getAllMedicine")
    public ResponseResult getAllMedicine(){
        return medicinService.getAll();
    }
    //具体药瓶信息
    @GetMapping("/manger/getOneMedicine/{id}")
    public ResponseResult getOneMedicine(@PathVariable int id){
        return medicinService.selectByPrimaryKey(id);
    }
    //修改药品信息
    @PutMapping("/manger/updateMedicine")
    public ResponseResult updateMedicine(@RequestBody Medicine medicine){
        return medicinService.updateByPrimaryKeySelective(medicine);
    }


    //用户管理模块
    //查看所有用户

}
