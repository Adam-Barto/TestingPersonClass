package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean isSeated;
    private String pronouns;
    private double height;
    private boolean is_sleeping;
    private String hobby;
    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
//        pronouns = "They/Them";
//        height = 4.1;
//        is_sleeping = false;
//        hobby = "Coding";
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

    public void setPronouns(String s) {
        this.pronouns = s;
    }

    public String getProunouns() {
        return pronouns;
    }

    public void setHobbies(String s) {
        this.hobby = s;
    }

    public String getHobbies() {
        return hobby;
    }

    public void makeSleep(Boolean b) {
        this.is_sleeping = b;
    }

    public Boolean isSleeping() {
        return is_sleeping;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
