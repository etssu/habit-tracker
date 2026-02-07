package app;


import model.Frequency;
import service.HabitService;
import storage.InMemoryHabitStorage;

import java.util.Scanner;

public class HabitApp {
    Scanner scanner = new Scanner(System.in);
    InMemoryHabitStorage storage = new InMemoryHabitStorage();
    HabitService habitService = new HabitService();

    HabitApp() {
        System.out.println("Welcome to your Habit Tracker!");
        System.out.println("Please, choose an option: ");
        System.out.println("1. Display all habits.");
        System.out.println("2. Add a new habit.");
        // TODO "EDIT A HABIT"
        System.out.println("3. Delete a habit.");
        System.out.println("4. Exit.");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // display all habits
                    break;
                case 2: // add a new habit
                    System.out.print("Enter habit's name: ");
                    String habitName = scanner.next();
                    System.out.print("Enter frequency(daily/x per week): ");
                    String frequencyInput = scanner.next();
                    habitService.createHabit(habitName, frequencyInput);
                    break;
                case 3: // delete a habit
                    break;
                case 4: // exit
                    System.out.println("Thanks for using our Habit Tracker!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }


    }
}
