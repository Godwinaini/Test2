package com.godwin.mapper;

import com.godwin.dataobject.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by admin on 2021/3/14.
 */
@Repository
public interface StudentMapper {
    int add(Student student);

    int update(Student student);

    int delete(int id);

    List<Student> findAll();

    Student findById(int id);

    List<Student> findAll(int page,int size);
}
