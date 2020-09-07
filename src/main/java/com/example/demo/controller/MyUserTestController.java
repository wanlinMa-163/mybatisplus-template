package com.example.demo.controller;

import com.example.demo.entity.MyUserTestEntity;
import com.example.demo.service.MyUserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("test")
public class MyUserTestController {
    @Autowired
    private MyUserTestService myUserTestService;

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping
    public List<MyUserTestEntity> findAll() {
        return myUserTestService.findAll();
    }

    @PostMapping("add")
    public boolean add(@RequestBody MyUserTestEntity myUserTestEntity) {
        return myUserTestService.add(myUserTestEntity);
    }

    @PostMapping("update")
    public boolean update(@RequestBody MyUserTestEntity myUserTestEntity) {
        return myUserTestService.update(myUserTestEntity);
    }

    @PostMapping("delete")
    public boolean delete(@RequestParam Integer id) {
        return myUserTestService.delete(id);
    }

}
