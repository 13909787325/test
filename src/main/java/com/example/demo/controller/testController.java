package com.example.demo.controller;


import com.example.demo.Util.StudentMapper;
import com.example.demo.Util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "hello")
public class testController {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "test")
    public String test(){
        return "I'm here!";
    }

    @RequestMapping(value = "saveToDB")
    public String saveToDB(){
         studentMapper.addStudent();
        return "Save success!";
    }

    @RequestMapping(value = "getToDB")
    public List<Map<String, Object>> getToDB(){
        return studentMapper.getAllStudent();
    }

    @RequestMapping(value = "saveToRedis")
    public String saveToRedis(@RequestParam("msg") String msg){
        redisUtil.set("yuanxiaofeng","aws_" + msg);
        return "Save success!!!!";
    }

    @RequestMapping(value = "getToRedis")
    public String getToRedis(@RequestParam("key") String key){
        return redisUtil.get(key).toString();
    }
}
