package org.ms.medicalsystem.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ms.medicalsystem.model.MedicalOrder;

import java.util.List;

@Mapper
public interface MedicalOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(MedicalOrder record);

    int insertSelective(MedicalOrder record);

    MedicalOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(MedicalOrder record);

    int updateByPrimaryKeyWithBLOBs(MedicalOrder record);

    int updateByPrimaryKey(MedicalOrder record);

    List<MedicalOrder> getAll();

    List<MedicalOrder> selectByDoctorId(int doctorId);
}