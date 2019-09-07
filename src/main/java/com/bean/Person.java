package com.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;
    private List<Object> list;
    private Map<String, String> map;
    private Dog dog;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", list=" + list +
                ", map=" + map +
                ", dog=" + dog +
                '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
