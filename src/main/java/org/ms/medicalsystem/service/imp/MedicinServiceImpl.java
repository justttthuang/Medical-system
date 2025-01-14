package org.ms.medicalsystem.service.imp;

import org.ms.medicalsystem.dao.MedicineMapper;
import org.ms.medicalsystem.model.Medicine;
import org.ms.medicalsystem.service.MedicinService;
import org.ms.medicalsystem.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicinServiceImpl implements MedicinService {
    @Autowired
    MedicineMapper medicineMapper;
    @Override
    public ResponseResult insertSelective(Medicine medicine) {
        try {
            int number = medicineMapper.insertSelective(medicine);
            if(number != 0){
                return new ResponseResult("200","添加成功");
            }
        }catch (Exception e){
            return new ResponseResult("404","添加失败");
        }
        return new ResponseResult("404","添加失败");
    }

    @Override
    public ResponseResult getAll() {
        try{
            List<Medicine>  list = medicineMapper.getAll();
            if(list != null){
                return new ResponseResult("200","查询成功",list);
            }
        }catch (Exception e){
            return new ResponseResult("404","查询失败");
        }
        return new ResponseResult("404","查询失败");

//        List<Medicine>  list = medicineMapper.getAll();
//        return new ResponseResult("200","查询成功",list);
    }

    @Override
    public ResponseResult selectByPrimaryKey(int id) {
        try{
            Medicine medicine = medicineMapper.selectByPrimaryKey(id);
            if(medicine != null){
                return new ResponseResult("200","查询成功",medicine);
            }
        }catch (Exception e){
            return new ResponseResult("404","查询失败");
        }
        return new ResponseResult("404","查询失败");
    }

    @Override
    public ResponseResult updateByPrimaryKeySelective(Medicine medicine) {
        try{
            int number = medicineMapper.updateByPrimaryKeySelective(medicine);
            if(number != 0 ){
                return new ResponseResult("200","修改成功");
            }
        }catch (Exception E){
            return new ResponseResult("404","修改失败");
        }
        return new ResponseResult("404","修改失败");
    }


}
