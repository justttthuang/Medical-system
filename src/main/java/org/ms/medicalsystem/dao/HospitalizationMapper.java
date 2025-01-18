package org.ms.medicalsystem.dao;

import org.ms.medicalsystem.model.Hospitalization;

import java.util.List;

public interface HospitalizationMapper {
    int deleteByPrimaryKey(Integer hospitalizationId);

    int insert(Hospitalization record);

    int insertSelective(Hospitalization record);

    Hospitalization selectByPrimaryKey(Integer hospitalizationId);

    int updateByPrimaryKeySelective(Hospitalization record);

    int updateByPrimaryKey(Hospitalization record);

    List<Hospitalization> getAllHp();

    int discharge(int id);
}