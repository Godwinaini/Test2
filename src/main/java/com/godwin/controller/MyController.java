//package com.godwin.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by admin on 2021/3/13.
// */
//@RestController
//public class MyController {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @GetMapping("/user")
//    public List<Map<String,Object>> map(){
//        String sql = "select * from student";
//        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
//        return result;
//    }
//
//    @GetMapping("/add")
//    public String add(){
//        String sql = "insert into stu.student(id,age,name,sex) values (8,18,'zs','nan')";
//        jdbcTemplate.update(sql);
//        return "add ok";
//    }
//
//    @GetMapping("/update/{id}")
//    public String update(@PathVariable("id") int id){
//        String sql = "update stu.student set age=?,name=?,sex=? where id=" + id;
//        Object[] objects = new Object[3];
//        objects[0] =  6;
//        objects[1] = "小明";
//        objects[2] = "男";
//        jdbcTemplate.update(sql,objects);
//        return "update ok";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable("id") int id){
//        String sql = "delete from stu.student where id = ?";
//        jdbcTemplate.update(sql,id);
//        return "delete ok";
//    }
//}
