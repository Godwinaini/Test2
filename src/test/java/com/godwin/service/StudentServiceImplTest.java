package com.godwin.service;

import com.godwin.dataobject.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by admin on 2021/3/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    StudentService studentService;

    @Test
    public void testAdd() throws Exception {
        Student student = new Student();
        student.setId(10);
        student.setAge(18);
        student.setName("刘亦菲");
        student.setSex("女");
        studentService.add(student);
    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testFindAll() throws Exception {

    }

    @Test
    public void testFindById() throws Exception {

    }

    @Test
    public void testFindAll1() throws Exception {

    }
}