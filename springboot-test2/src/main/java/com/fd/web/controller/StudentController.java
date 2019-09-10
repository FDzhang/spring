package com.fd.web.controller;

import com.fd.model.Student;
import com.fd.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/9 15:33
 * @RestController 用于写api,给移动客户端提供数据，一般是返回json数据
 * @Controller 一般用于写后台 （有页面）
 */
@Controller
@RequestMapping("stu")
public class StudentController {

    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("username","zxq");
        model.addAttribute("age",20);
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1,"zxq","男"));
        stuList.add(new Student(2,"iu","女"));
        stuList.add(new Student(3,"lkx","female"));

        model.addAttribute("stuList",stuList);

        return "stu/list";
    }
}
