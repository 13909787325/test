package com.example.demo.Util;

import com.example.demo.DTO.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class StudentMapper {

    @Autowired
    JdbcTemplate jct;

    public void addStudent(){
        String sql = "insert into student values(default,'小二',20)";
        jct.execute(sql);
    }

    public List<Map<String, Object>> getAllStudent() {
        String sql = "select * from student";
        List<Map<String, Object>> list = jct.queryForList(sql);
        return list;
    }
}
