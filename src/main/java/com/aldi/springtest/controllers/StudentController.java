package com.aldi.springtest.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/student-form")
    public String showForm() {
        return "student-form";
    }

    @RequestMapping("/student")
    public String processForm() {
        return "student";
    }

    @RequestMapping("/register/student")
    public String shout(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String result = "Hei! " + name;
        model.addAttribute("message", result);
        return "student";
    }

}
