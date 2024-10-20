/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepar1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
public class POEPAR1 {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int totalHours = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Login login = new Login("user_", "Password1!", "John", "Doe");
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (login.loginUser(username, password)) {
                System.out.println(login.returnLoginStatus(username, password));
                loggedIn = true;
            } else {
                System.out.println("Login failed. Please try again.");
            }
        }

        System.out.println("Welcome to POEpart2");

        while (true) {
            System.out.println("\n1) Add tasks");
            System.out.println("2) Show report");
            System.out.println("3) Quit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTasks();
                    break;
                case 2:
                    System.out.println("Coming Soon");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addTasks() {
        System.out.print("How many tasks do you want to add? ");
        int numTasks = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < numTasks; i++) {
            System.out.println("\nEntering details for Task " + (i + 1));

            System.out.print("Task Name: ");
            String taskName = sc.nextLine();

            String taskDescription;
            while (true) {
                System.out.print("Task Description (max 50 characters): ");
                taskDescription = sc.nextLine();
                if (taskDescription.length() <= 50) {
                    System.out.println("Task successfully captured");
                    break;
                } else {
                    System.out.println("Please enter a task description of less than 50 characters");
                }
            }

            System.out.print("Developer Details (First and Last Name): ");
            String developerDetails = sc.nextLine();

            System.out.print("Task Duration (in hours): ");
            int taskDuration = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.println("Task Status:");
            System.out.println("1) To Do");
            System.out.println("2) Done");
            System.out.println("3) Doing");
            System.out.print("Choose a status: ");
            int statusChoice = sc.nextInt();
            sc.nextLine(); // Consume newline

            String taskStatus;
            switch (statusChoice) {
                case 1:
                    taskStatus = "To Do";
                    break;
                case 2:
                    taskStatus = "Done";
                    break;
                case 3:
                    taskStatus = "Doing";
                    break;
                default:
                    taskStatus = "To Do"; // Default status
            }

            Task task = new Task(taskName, i, taskDescription, developerDetails, taskDuration, taskStatus);
            tasks.add(task);
            totalHours += taskDuration;

            System.out.println("\nTask Details:");
            System.out.println(task.printTaskDetails());
        }

        System.out.println("\nTotal hours for all tasks: " + totalHours);
    }

    public static int returnTotalHours() {
        return totalHours;
    }
}
    
        
    

