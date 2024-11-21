package com.mycompany.poepar1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class POEPAR1 {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int totalHours = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        Part3Task second = new Part3Task();
        
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                // User registration
                System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                System.out.print("Enter first name: ");
                String firstName = sc.nextLine();
                System.out.print("Enter last name: ");
                String lastName = sc.nextLine();
                 
                
                String registrationResult = login.registerUser(username, password, firstName, lastName);
                System.out.println(registrationResult);

               
                    System.out.print("Enter username to Login: ");
                    String loginUsername = sc.nextLine();
                    
                    System.out.print("Enter password: ");
                    String loginPassword = sc.nextLine();
                    
                    boolean loginCheck = login.loginUser(loginUsername, loginPassword);
                    String loginResult = login.returnLoginStatus(loginCheck);
                    System.out.println(loginResult);
                
                break;
               
            case 2:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                return; // Exit if invalid
        }
          sc.close();
          
        //Part Two
        boolean loginCheck = login.loginUser(login.username, login.password);
        if (loginCheck) {
              
        }
        // Welcome dialog
        final JDialog dialog = new JDialog(); 
        dialog.setAlwaysOnTop(true);
         JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanban");

        // Main task management loop
        while (true) {
            String choiceStr = JOptionPane.showInputDialog("1) Add tasks\n2) Show report\n3) Search Task Name \n4) Find Longest Task\n5) Search Developer\n6) Completed Tasks\n7) Delete Task\n8) Quit\n) \nChoose an option:");
            int secondChoice;

            try {
                secondChoice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(dialog, "Invalid input. Please enter a number.");
                continue;
            }

            switch (secondChoice) {
                case 1:
                    addTasks(dialog);
                    break;
                case 2:
                    second.displayFullReport();
                    break;
                case 3:
                    String input = JOptionPane.showInputDialog("Enter task name to search");
                    second.searchTaskByName(input);
                case 4:
                    second.findLongestTask();
                    break;
                case 5:
                    String developername = JOptionPane.showInputDialog("Enter developer name to search");
                    second.searchTasksByDeveloper(developername);
                    break;
                case 6:
                    second.displayCompletedTasks();
                    break;
                case 7:
                    String taskdelete = JOptionPane.showInputDialog("Enter task to delete");
                    second.deleteTask(taskdelete);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(dialog, "Goodbye!");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(dialog, "Invalid option. Please try again.");
            }
        }
    }

    public static void addTasks(JDialog dialog) {
        String numTasksStr = JOptionPane.showInputDialog("How many tasks do you want to add?");
        int numTasks;

        try {
            numTasks = Integer.parseInt(numTasksStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(dialog, "Invalid number of tasks.");
            return;
        }

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Entering details for Task " + (i + 1) + "\nTask Name:");

            String taskDescription;
            while (true) {
                taskDescription = JOptionPane.showInputDialog("Task Description (max 50 characters):");
                if (taskDescription.length() <= 50) {
                    JOptionPane.showMessageDialog(dialog, "Task successfully captured");
                    break;
                } else {
                    JOptionPane.showMessageDialog(dialog, "Please enter a task description of less than 50 characters");
                }
            }

            String developerDetails = JOptionPane.showInputDialog("Developer Details (First and Last Name):");
            String taskDurationStr = JOptionPane.showInputDialog("Task Duration (in hours):");
            int taskDuration;

            try {
                taskDuration = Integer.parseInt(taskDurationStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(dialog, "Invalid duration. Please enter a number.");
                return;
            }

            String statusChoiceStr = JOptionPane.showInputDialog("Task Status:\n1) To Do\n2) Done\n3) Doing\nChoose a status:");
            int statusChoice = Integer.parseInt(statusChoiceStr);

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

            JOptionPane.showMessageDialog(dialog, "Task Details:\n" + task.printTaskDetails());
        }

        JOptionPane.showMessageDialog(dialog, "Total hours for all tasks: " + totalHours);
    }
}