package org.challenge.day1;

// OOP Java Constructors

// default constructors & print
public class Cat {
    private String name;
    private int age;

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

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void printCatDetails() {
        System.out.println("This Cat is called: " + getName());
        System.out.println("This Cat is called: " + getAge());
    }

}


