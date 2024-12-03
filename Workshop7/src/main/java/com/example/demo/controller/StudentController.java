package com.example.demo.controller;

import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController{
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/getStudents")
    ResponseEntity<List<StudentEntity>> getStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/saveStudent")
    ResponseEntity<StudentEntity> saveStudent(@RequestBody StudentEntity student) {
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @PutMapping("/updateStudent/{id}")
    ResponseEntity<StudentEntity> updateStudent(@RequestBody StudentEntity student, @PathVariable int id) {
        return ResponseEntity.ok(studentService.updateStudent(student, id));
    }

    @DeleteMapping("/deleteStudent/{id}")
    ResponseEntity<String> deleteStudent(@PathVariable int id) {
        return ResponseEntity.ok(studentService.deleteStudent(id));
    }

}


