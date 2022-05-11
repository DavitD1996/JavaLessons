package Lesson6;

import java.util.Locale;

public class User {
    private String name;
    private String surName;
    private int age;
    public User(String name,String surName,int age){
        setName(name);
        setSurName(surName);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name=name.toLowerCase(Locale.ROOT);
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
