package org.ms.medicalsystem.dao;

import org.ms.medicalsystem.model.MedicalOrder;

public interface MedicalOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(MedicalOrder record);

    int insertSelective(MedicalOrder record);

    MedicalOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(MedicalOrder record);

    int updateByPrimaryKeyWithBLOBs(MedicalOrder record);

    int updateByPrimaryKey(MedicalOrder record);
}