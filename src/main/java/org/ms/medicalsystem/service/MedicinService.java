package org.ms.medicalsystem.service;

import org.ms.medicalsystem.model.Medicine;
import org.ms.medicalsystem.utils.ResponseResult;

public interface MedicinService {
    public ResponseResult insertSelective(Medicine medicine);

    public ResponseResult getAll();

    ResponseResult selectByPrimaryKey(int id);

    ResponseResult updateByPrimaryKeySelective(Medicine medicine);
}
