package org.ms.medicalsystem.service;

import org.ms.medicalsystem.model.Doctor;
import org.ms.medicalsystem.utils.ResponseResult;

public interface MangerService {
    public ResponseResult addDoctor(Doctor doctor);

    public ResponseResult updateDoctor(Doctor doctor);

    public ResponseResult getAllDoctor();

    public ResponseResult selectByPrimaryKey(Integer id);

    public ResponseResult selectByDepartment(String department);
}
