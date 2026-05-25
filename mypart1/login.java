/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register;

/**
 *
 * @author molek
 */
import java.util.Scanner;
public class login {
    public static void main(String[] args) {

        // Same username and password from Register class
        try (Scanner input = new Scanner(System.in)) {
            // Same username and password from Register class
            
            String firstName;
            String lastName;
            String username;
            String password;
            
            // Enter first name and last name
            System.out.print("Enter first name: ");
            firstName = input.nextLine();
            
            System.out.print("Enter last name: ");
            lastName = input.nextLine();
            
            // Enter login details
            System.out.print("Enter username: ");
            username = input.nextLine();
            
            System.out.print("Enter password: ");
            password = input.nextLine();
            
            // Check login details
            if (username.equals(username) && password.equals(password)) {
                System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again.");
            } else {
                System.out.println("Username or password incorrect. Try again.");
            }
        }
    }

    static boolean checkCellPhoneNumber(String cell) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean checkPasswordComplexity(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean checkUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   