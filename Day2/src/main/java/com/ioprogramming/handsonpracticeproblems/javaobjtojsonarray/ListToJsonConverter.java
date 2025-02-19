package com.ioprogramming.handsonpracticeproblems.javaobjtojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}

public class ListToJsonConverter {

    public static String convertListToJson(List<Person> people) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(people);
    }

    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(
                new Person("Samay", 25),
                new Person("Raftaar", 30),
                new Person("Rebelkid", 28)
        );

        String jsonArray = convertListToJson(people);
        System.out.println("JSON Array: " + jsonArray);
    }
}

