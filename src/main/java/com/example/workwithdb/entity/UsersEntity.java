package com.example.workwithdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity // она позволяет понять джаве, что это не просто объект, а объект из Базы данных
@Table(name = "users") // она говорит нашей джаве, как называется табличка и откуда вообще брать эти объекты
public class UsersEntity { // Подпись Entity обычно добавляют, чтобы было понятно,
    // что это не просто Java класс (Entity - сущность)

    @Id // говорит о том, что поле под аннотацией является уникальным идентификатором записи
    private long id;

    @Column(name = "name") // говорит о том, где искать это поле конкретное
    private String name;

    @Column(name = "age") // говорит о том, где искать это поле конкретное
    private Integer age;

    @Column(name = "male") // говорит о том, где искать это поле конкретное
    private Integer male;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        UsersEntity that = (UsersEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(male, that.male);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, male);
    }
}
