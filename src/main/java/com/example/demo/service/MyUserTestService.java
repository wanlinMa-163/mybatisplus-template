package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.demo.entity.MyUserTestEntity;
import com.example.demo.mapper.MyUserTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserTestService {
    @Autowired
    private MyUserTestMapper myUserTestMapper;

    public List<MyUserTestEntity> findAll() {
        List<MyUserTestEntity> myUserTestControllers = myUserTestMapper.selectList(null);
        // 自定义 查询
//        QueryWrapper<MyUserTestEntity> testEntityQueryWrapper = new QueryWrapper<>();
//        testEntityQueryWrapper.eq("name", "xh");
//        myUserTestMapper.selectList(testEntityQueryWrapper);
        return myUserTestControllers;
    }

    public boolean add(MyUserTestEntity myUserTestEntity) {
        int insert = myUserTestMapper.insert(myUserTestEntity);
        return insert != 0;
    }
    public boolean update(MyUserTestEntity myUserTestEntity) {
        int update = myUserTestMapper.updateById(myUserTestEntity);

        // 自定义修改
//        UpdateWrapper<MyUserTestEntity> updateWrapper = new UpdateWrapper<MyUserTestEntity>().eq("id", "6");
//        int update = myUserTestMapper.update(myUserTestEntity,updateWrapper);
        return update != 0;
    }
    public boolean delete(Integer id) {
        int delete = myUserTestMapper.deleteById(id);
        return delete != 0;
    }
}
