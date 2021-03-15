package com.godwin.mapper;

import com.github.pagehelper.PageHelper;
import com.godwin.dataobject.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 2021/3/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;
    @Test

    public void testAdd() throws Exception {
        Student student = new Student();
        student.setId(7);
        student.setAge(18);
        student.setName("刘亦菲");
        student.setSex("女");
        studentMapper.add(student);

    }

    @Test
    public void testUpdate() throws Exception {
        Student student = studentMapper.findById(8);
        student.setAge(19);
        student.setName("飞");
        student.setSex("男");
        studentMapper.update(student);
    }

    @Test
    public void testDelete() throws Exception {
        studentMapper.delete(8);
    }

    @Test
    public void testFindAll() throws Exception {
        List<Student> list = studentMapper.findAll();
        System.out.println(list.toString());
    }

    @Test
    public void testFindQueryAll() throws Exception {
        PageHelper.startPage(1,2);
        List<Student> list = studentMapper.findAll(1,2);
        System.out.println(list.toString());
    }
}