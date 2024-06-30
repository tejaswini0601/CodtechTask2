package com.fitness;

public class Meal {
    private String userName;
    private String mealType;
    private int calories;

    public Meal(String userName, String mealType, int calories) {
        this.userName = userName;
        this.mealType = mealType;
        this.calories = calories;
    }

    public String getUserName() {
        return userName;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Meal{userName='" + userName + "', mealType='" + mealType + "', calories=" + calories + "}";
    }
}
