package org.ms.medicalsystem.dao;

import org.apache.ibatis.annotations.Param;
import org.ms.medicalsystem.model.User;
import org.ms.medicalsystem.utils.ResponseResult;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUidAndPwd(User record);
//    ResponseResult selectByUidAndPwd(User user);

    int insertUser(User record);
}