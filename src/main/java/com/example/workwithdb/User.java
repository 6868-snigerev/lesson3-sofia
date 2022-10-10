package com.example.workwithdb;

import java.util.Objects;

public class User {
    private String name;
    private Integer age;
    private Integer male;

    public User(String name, Integer age, Integer male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMale() {
        return male;
    }

    public void setMale(Integer male) {
        this.male = male;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(age, user.age) && Objects.equals(male, user.male);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, male);
    }
}
