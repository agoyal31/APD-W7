package com.example.demo.service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepo.findAll();
    }

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepo.save(student);
    }

    //Update Student
    public StudentEntity updateStudent(StudentEntity student, int id) {
        StudentEntity existingStudent = studentRepo.findById(id).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());
        return studentRepo.save(existingStudent);
    }

    // Delete Student
    public String deleteStudent(int id) {
        studentRepo.deleteById(id);
        return "Student removed !! " + id;
    }
}
