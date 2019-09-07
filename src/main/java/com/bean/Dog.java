package com.bean;

public class Dog {
    private String dogName;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog() {
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
