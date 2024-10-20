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

    

