package com.fitness;

public class User {
    private String name;
    private int age;
    private int weight;
    private int height;

    public User(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", weight=" + weight + ", height=" + height + "}";
    }

    // Getters (and possibly setters if needed)
}