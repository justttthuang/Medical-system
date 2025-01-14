package org.ms.medicalsystem.dao;

import org.ms.medicalsystem.model.Doctor;

import java.util.List;

public interface DoctorMapper {
    int deleteByPrimaryKey(Integer doctorId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer doctorId);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    List<Doctor> getAllDoctor();

    List<Doctor> selectByDepartment(String department);
}