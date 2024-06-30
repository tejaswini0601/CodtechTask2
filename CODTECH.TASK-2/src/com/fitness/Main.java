package com.fitness;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ProgressService progressService = new ProgressService(userService);
        MealService mealService = new MealService();
        NotificationService notificationService = new NotificationService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Fitness App!");
            System.out.println("1. Register User");
            System.out.println("2. Log Workout");
            System.out.println("3. Log Meal");
            System.out.println("4. Display Users");
            System.out.println("5. Display Progress");
            System.out.println("6. Display Meals");
            System.out.println("7. Calculate Total Calories");
            System.out.println("8. Schedule Reminder");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter weight (in kg): ");
                    int weight = scanner.nextInt();
                    System.out.print("Enter height (in cm): ");
                    int height = scanner.nextInt();
                    userService.registerUser(name, age, weight, height);
                    System.out.println("User registered successfully!");
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    String workoutUserName = scanner.nextLine();
                    System.out.print("Enter activity: ");
                    String activity = scanner.nextLine();
                    System.out.print("Enter duration (in minutes): ");
                    int duration = scanner.nextInt();
                    System.out.print("Enter sets: ");
                    int sets = scanner.nextInt();
                    System.out.print("Enter reps: ");
                    int reps = scanner.nextInt();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.next();
                    progressService.logWorkout(workoutUserName, activity, duration, sets, reps, date);
                    break;
                case 3:
                    System.out.print("Enter user name: ");
                    String mealUserName = scanner.nextLine();
                    System.out.print("Enter meal type: ");
                    String mealType = scanner.nextLine();
                    System.out.print("Enter calories: ");
                    int calories = scanner.nextInt();
                    mealService.logMeal(mealUserName, mealType, calories);
                    break;
                case 4:
                    userService.displayUsers();
                    break;
                case 5:
                    System.out.print("Enter user name: ");
                    String progressUserName = scanner.nextLine();
                    progressService.displayProgress(progressUserName);
                    break;
                case 6:
                    System.out.print("Enter user name: ");
                    String mealsUserName = scanner.nextLine();
                    mealService.displayMeals(mealsUserName);
                    break;
                case 7:
                    double totalCalories = mealService.calculateTotalCalories();
                    System.out.println("Total calories: " + totalCalories);
                    break;
                case 8:
                    System.out.print("Enter reminder message: ");
                    String reminderMessage = scanner.nextLine();
                    System.out.print("Enter delay in seconds: ");
                    int delayInSeconds = scanner.nextInt();
                    notificationService.scheduleReminder(reminderMessage, delayInSeconds);
                    break;
                case 9:
                    System.out.println("Exiting Fitness App. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
}