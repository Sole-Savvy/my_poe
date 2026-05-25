/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register;

/**
 *
 * @author molek
 */
import java.util.Scanner;
public class Register {
    //check username
    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    //check password
    public static boolean checkPassword(String password) {
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char chr : password.toCharArray()) {
            if (Character.isUpperCase(chr)) {
                hasUpper = true;
            }//end case
            if (Character.isDigit(chr)) {
                hasNumber = true;
            }//end digit
            if (!Character.isLetterOrDigit(chr)) {
                hasSpecial = true;
            }//end special
        }//end for

        return password.length() >= 8 && hasUpper && hasNumber && hasSpecial;
    }

    //check SA cellnumber
    public static boolean checkCellNumber(String phoneNumber) {
        return phoneNumber.matches("^\\+27\\d{9}$");
    }

    //main method
    public static void main(String[] args) {
        //declaration of variables
        try (Scanner input = new Scanner(System.in)) {
            //declaration of variables
            String userName;
            String password;
            String phoneNumber;
            //username loop
            while (true) {
                System.out.print("Enter username: ");
                userName = input.nextLine();
                
                if (checkUserName(userName)) {
                    System.out.println("Username successfully captured.");
                    break;
                }//end if
                else {
                    System.out.println("Username is not correctly formatted.");
                    System.out.println("Please ensure that your username contains an underscore and is no more than five characters in length.");
                }//end else
            }//end while
            //password loop
            while (true) {
                System.out.print("Enter password: ");
                password = input.nextLine();
                
                if (checkPassword(password)) {
                    System.out.println("Password successfully captured.");
                    break;
                }//end if
                else {
                    System.out.println("Password is not correctly formatted.");
                    System.out.println("Please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
                }//end else
            }//end while
            //cellnumber loop
            while (true) {
                System.out.print("Enter cell phone number: ");
                phoneNumber = input.nextLine();
                
                if (checkCellNumber(phoneNumber)) {
                    System.out.println("Cell phone number successfully added.");
                    break;
                }//end if
                else {
                    System.out.println("Cell phone number incorrectly formatted or does not contain international code, which is a South African code.");
                }//end else
            }//end while
            //acc success message
            System.out.println("Account created successfully!");
            //close
        }
    }
}
