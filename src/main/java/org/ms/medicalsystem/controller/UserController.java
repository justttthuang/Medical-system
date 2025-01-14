package org.ms.medicalsystem.controller;

import org.apache.ibatis.annotations.Update;
import org.ms.medicalsystem.model.User;
import org.ms.medicalsystem.service.UserService;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PutMapping("/user/update")
    public ResponseResult update(@RequestBody User user){
        return userService.update(user);
    }


}
