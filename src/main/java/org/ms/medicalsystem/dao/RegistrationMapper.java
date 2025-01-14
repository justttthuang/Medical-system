package org.ms.medicalsystem.dao;

import org.ms.medicalsystem.model.Registration;

public interface RegistrationMapper {
    int deleteByPrimaryKey(Integer registrationId);

    int insert(Registration record);

    int insertSelective(Registration record);

    Registration selectByPrimaryKey(Integer registrationId);

    int updateByPrimaryKeySelective(Registration record);

    int updateByPrimaryKey(Registration record);
}