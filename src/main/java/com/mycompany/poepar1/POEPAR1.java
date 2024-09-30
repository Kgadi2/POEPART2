/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepar1;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
public class POEPAR1 {

    public static void main(String[] args) {
        
        //Declarations
         Scanner sc = new Scanner(System.in);
        Login login = null;

        while (true) {
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
        
        
    
        
    

