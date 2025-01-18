package org.ms.medicalsystem.dao;

import org.ms.medicalsystem.model.MedicineDispense;

import java.util.List;

public interface MedicineDispenseMapper {
    int deleteByPrimaryKey(Integer dispenseId);

    int insert(MedicineDispense record);

    int insertSelective(MedicineDispense record);

    MedicineDispense selectByPrimaryKey(Integer dispenseId);

    int updateByPrimaryKeySelective(MedicineDispense record);

    int updateByPrimaryKey(MedicineDispense record);

    List<MedicineDispense> getAll();

    List<MedicineDispense> selectBypatientId(Integer patientId);
}