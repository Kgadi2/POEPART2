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
        String Username, firstName, lastName, Password;
        Scanner sc = new Scanner(System.in);
        //prompt the user
        System.out.print("Please enter Username");
        Username=sc.next();
        System.out.print("Please enter First name");
        firstName=sc.next();
        System.out.print("Please enter Last Name");
        lastName=sc.next();
        System.out.print("Please enter Password");
        Password=sc.next();
        //Conditions and requirements
        
        if (Username.contains("_")&& Username.length()<5){
            System.out.println("Username is not correctly formatted please ensure your username containds an underscore is no more than 5 characters in lenght");
           

        }
        
        
    
        
    

