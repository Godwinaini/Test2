package com.godwin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.godwin.dataobject.Student;
import com.godwin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2021/3/14.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> findAll(){
        List<Student> result = studentService.findAll();
        return result;
    }

    @GetMapping("/query")
    public PageInfo<Student> getQuery(@RequestParam(value = "page",defaultValue = "1") int page
            ){
        PageHelper.startPage(page,5);
        List<Student> list = studentService.findAll();
        //使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行。
        //封装了详细的分页信息，包括我们查询出来的数据userList，传入连续显示的页数5。
        PageInfo<Student> result = new PageInfo<>(list);
        return result;
    }


    @PostMapping("/add")
    public String add(Student student){
        studentService.add(student);
        return "add ok";
    }

    @PostMapping("/update")
    public String update(Student student){
        int result = studentService.update(student);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id){
        studentService.delete(id);
        return "delete ok";
    }

}
