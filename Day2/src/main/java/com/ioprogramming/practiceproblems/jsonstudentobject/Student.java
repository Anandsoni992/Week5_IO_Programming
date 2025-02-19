package com.ioprogramming.practiceproblems.jsonstudentobject;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> subjects;

    public Student() {
    }

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String toJson() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }

    public static void main(String[] args) throws Exception {
        Student student = new Student("Bhuvan  Bam", 20, List.of("Math", "Science", "History"));
        System.out.println(student.toJson());
    }
}
