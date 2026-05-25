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
public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int option;
            
            System.out.println("===== Welcome =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            option = input.nextInt();
            
            switch (option) {
                
                case 1 -> {
                    // Run Register class
                    System.out.println("\n--- Register ---");
                    Register.main(args);
                }
                
                case 2 -> {
                    // Run Login class
                    System.out.println("\n--- Login ---");
                    login.main(args);
                }
                
                case 3 -> // Exit program
                    System.out.println("Goodbye!");
                    
                default -> System.out.println("Invalid option. Please restart and choose 1, 2, or 3.");
            }
        }
    }   
}
