package com.fitness;

public class ProgressService {
    public ProgressService(UserService userService) {
    }

    public void logWorkout(String userName, String activity, int durationInMinutes, int sets, int reps, String date) {
        // Implement logging worked logic
        System.out.println("Workout logged for user: " + userName);
    }

    public void displayProgress(String userName) {
        // Implement display progress logic
        System.out.println("Displaying progress for user: " + userName);
    }
}
