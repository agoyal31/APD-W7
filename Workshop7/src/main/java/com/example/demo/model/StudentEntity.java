package com.example.demo.model;

import jakarta.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class StudentEntity {
    // id, name, age, email
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private int age;

    @NotNull
    @Column(unique = true)
    private String email;

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "StudentEntity [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
    }

    // constructor
    public StudentEntity(int id, @NotNull String name, @NotNull int age, @NotNull String email) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public StudentEntity() {
        super();
    }

}
