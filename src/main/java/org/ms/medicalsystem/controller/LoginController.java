package org.ms.medicalsystem.controller;


import org.ms.medicalsystem.model.User;
import org.ms.medicalsystem.service.UserService;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        return userService.login(user);
    }

    @PostMapping("/register")
    public ResponseResult register(@RequestBody User user){return userService.register(user);}


}
