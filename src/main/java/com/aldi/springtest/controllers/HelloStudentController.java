package com.aldi.springtest.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello-student")
public class HelloStudentController {

    @RequestMapping("/form")
    public String showForm() {
        return "hello-student-form";
    }

    @RequestMapping("/process")
    public String processForm() {
        return "hello-student";
    }

    @RequestMapping("/process-v2")
    public String shout(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();

        String result = "Hei! " + name;

        model.addAttribute("message", result);

        return "hello-student";
    }

    @RequestMapping("/process-v3")
    public String shoutV2(@RequestParam("studentName") String name, Model model) {
        name = name.toUpperCase();

        String result = "Hei! " + name;
        String color = "blue";

        model.addAttribute("message", result);
        model.addAttribute("color", color);

        return "hello-student";
    }

}
