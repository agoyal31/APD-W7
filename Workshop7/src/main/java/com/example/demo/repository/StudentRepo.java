package com.example.demo.repository;

import com.example.demo.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo  extends JpaRepository<StudentEntity, Integer> {
}
