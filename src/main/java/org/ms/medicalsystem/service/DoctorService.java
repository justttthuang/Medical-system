package org.ms.medicalsystem.service;

import org.ms.medicalsystem.model.Hospitalization;
import org.ms.medicalsystem.model.MedicalOrder;
import org.ms.medicalsystem.model.MedicineDispense;
import org.ms.medicalsystem.utils.ResponseResult;

public interface DoctorService {
    ResponseResult getAllMO();

    ResponseResult insertSelective(MedicalOrder medicalOrder);

    ResponseResult selectByDoctorId(int doctorId);

    ResponseResult getAllMD();

    ResponseResult setMD(MedicineDispense medicineDispense);

    ResponseResult selectBypatientId(Integer patientId);

    ResponseResult getAllHp();

    ResponseResult setHp(Hospitalization hospitalization);

    ResponseResult discharge(int id);
}
