package com.fitness;

import java.util.ArrayList;
import java.util.List;

public class MealService {
    private List<Meal> meals = new ArrayList<>();

    public void logMeal(String userName, String mealType, int calories) {
        Meal meal = new Meal(userName, mealType, calories);
        meals.add(meal);
    }

    public void displayMeals(String userName) {
        for (Meal meal : meals) {
            if (meal.getUserName().equals(userName)) {
                System.out.println(meal);
            }
        }
    }

    public double calculateTotalCalories() {
        double totalCalories = 0;
        for (Meal meal : meals) {
            totalCalories += meal.getCalories();
        }
        return totalCalories;
    }
}
