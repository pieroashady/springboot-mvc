package com.aldi.springtest.controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.Valid;

import com.aldi.springtest.models.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/form")
    public String showForm(Model model) {

        Student student = new Student();

        model.addAttribute("student", student);

        return "student-form";
    }

    @RequestMapping("/process")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println("asas");
            return "";
        }

        System.out.println("Student: " + student.getFirstName());
        System.out.println("Student: " + student.getCountry());

        return "studen-confirmation";
    }

}
