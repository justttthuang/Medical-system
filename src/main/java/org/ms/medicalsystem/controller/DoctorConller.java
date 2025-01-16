package org.ms.medicalsystem.controller;

import org.ms.medicalsystem.service.DoctorService;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorConller {
    @Autowired
    DoctorService doctorService;

    //查看所有医嘱
    @GetMapping("/test")
    public ResponseResult getAllMO(){
        return doctorService.getAllMO();
    }

}
