package com.godwin.service;

import com.github.pagehelper.PageHelper;
import com.godwin.dataobject.Student;
import com.godwin.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2021/3/14.
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int delete(int id) {
        return studentMapper.delete(id);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentMapper.findById(id);
    }

    @Override
    public List<Student> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        List<Student> result = studentMapper.findAll(page, size);
        return result;
    }
}
