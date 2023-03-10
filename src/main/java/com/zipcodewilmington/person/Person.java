package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean isSeated;
    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        setName(name);
    }

    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
//My Methods
    public Boolean isSatDown() {
        return isSeated;
    }

    public void setSit(Boolean willSit) {
        this.isSeated = willSit;
    }
}
