package org.ms.medicalsystem.service;


import org.ms.medicalsystem.model.User;
import org.ms.medicalsystem.utils.ResponseResult;

public interface UserService {
    public ResponseResult login(User user);

    public ResponseResult register(User user);

    public ResponseResult update(User user);
}
