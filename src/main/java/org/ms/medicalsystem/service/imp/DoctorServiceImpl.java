package org.ms.medicalsystem.service.imp;

import org.ms.medicalsystem.dao.MedicalOrderMapper;
import org.ms.medicalsystem.model.MedicalOrder;
import org.ms.medicalsystem.service.DoctorService;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    MedicalOrderMapper medicalOrderMapper;

    @Override
    public ResponseResult getAllMO() {
        List<MedicalOrder> list = medicalOrderMapper.getAll();
        return new ResponseResult("200","查询成功",list);
    }
}
