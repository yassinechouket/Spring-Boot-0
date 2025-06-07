package com.yasschouket.first_springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class software {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String techStack;

    public software(){}
    public software(Integer id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
    public String getTechStack() {
        return techStack;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        software software = (software) o;
        return Objects.equals(id, software.id) && Objects.equals(name, software.name) && Objects.equals(techStack, software.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}
