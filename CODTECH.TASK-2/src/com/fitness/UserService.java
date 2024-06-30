package com.fitness;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void registerUser(String name, int age, int weight, int height) {
        User user = new User(name, age, weight, height);
        users.add(user);
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}

