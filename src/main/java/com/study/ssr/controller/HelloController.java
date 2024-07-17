package com.study.ssr.controller;

import com.study.ssr.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello/1")
    public ModelAndView helloPage1(Model model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/hello");
        return mav;
    }

    @GetMapping("/name")
    public ModelAndView name(Model model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/name");
        mav.addObject(Student.builder().name("박가은").age(24).build());
        return mav;
    }
}
