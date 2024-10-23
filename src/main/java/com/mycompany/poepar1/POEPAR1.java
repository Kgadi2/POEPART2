/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepar1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JDialog;
/**
 *
 * @author RC_Student_lab
 */
public class POEPAR1 {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int totalHours = 0;

    public static void main(String[] args) {
        //Declarations
         Scanner sc = new Scanner(System.in);
        Login login = null;

        
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    System.out.print("Enter first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = sc.nextLine();

                    login = new Login(username, password, firstName, lastName);
                    String registrationResult = login.registerUser();
                    System.out.println(registrationResult);
                    break;
                    
                case 2:
                    if (login == null) {
                        System.out.println("Please register first.");
                        break;
                    }
                    System.out.print("Enter username: ");
                    String loginUsername = sc.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = sc.nextLine();

                    String loginResult = login.returnLoginStatus(loginUsername, loginPassword);
                    System.out.println(loginResult);
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        sc.close();
    
       final JDialog dialog = new JDialog(); 
                 dialog.setAlwaysOnTop(true);
       JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanban");

        while (true) {
            String choiceStr = JOptionPane.showInputDialog("1) Add tasks\n2) Show report\n3) Quit\nChoose an option:");
            int secondchoice = Integer.parseInt(choiceStr);
                    
            switch (secondchoice) {
                case 1:
                    addTasks();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(dialog, "Coming Soon");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(dialog, "Goodbye!");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(dialog, "Invalid option. Please try again.");
            }
        }
    }

    private static void addTasks() {
        String numTasksStr = JOptionPane.showInputDialog("How many tasks do you want to add?");
        final JDialog dialog = new JDialog(); 
                 dialog.setAlwaysOnTop(true);
        int numTasks = Integer.parseInt(numTasksStr);

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
            int taskDuration = Integer.parseInt(taskDurationStr);

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

    public static int returnTotalHours() {
        return totalHours;
    }
}