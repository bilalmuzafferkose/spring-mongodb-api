package com.bilalkose.springmongodbapi.controller;

import com.bilalkose.springmongodbapi.service.StudentService;
import com.bilalkose.springmongodbapi.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> fetchAllStudent() {
        return studentService.getAllStudents();
    }
}
