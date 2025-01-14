package org.ms.medicalsystem.dao;

import org.ms.medicalsystem.model.Medicine;

import java.util.List;

public interface MedicineMapper {
    int deleteByPrimaryKey(Integer medicineId);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    Medicine selectByPrimaryKey(Integer medicineId);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);

    List<Medicine> getAll();
}