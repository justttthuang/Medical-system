package org.ms.medicalsystem.service.imp;



import org.ms.medicalsystem.dao.UserMapper;
import org.ms.medicalsystem.model.User;
import org.ms.medicalsystem.service.UserService;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ResponseResult login(User user) {
        User selected = userMapper.selectByUidAndPwd(user);
        if(selected == null){
            return new ResponseResult("404","查找不到该用户!");
        }
        return new ResponseResult("200","登录成功",selected);
    }

    @Override
    public ResponseResult register(User user) {
    User check = userMapper.selectByPrimaryKey(user.getUserId());
    if(check != null){
        return new ResponseResult("404","该账号已经被注册");
    }

    int number = userMapper.insertUser(user);
    User selected = userMapper.selectByUidAndPwd(user);
    if(number == 0){
        return new ResponseResult("404","注册失败");
    }
        return new ResponseResult("200","注册成功",selected);
    }

    @Override
    public ResponseResult update(User user) {
        int number =  userMapper.updateByPrimaryKeySelective(user);
        if(number == 1){
            return new ResponseResult("200","更新成功");
        }
        return new ResponseResult("404","更新失败");
    }
}
