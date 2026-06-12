/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskreport;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author molek
 */
public class Taskreport {

    public static ArrayList<String> sentMessages = new ArrayList<>();
    public static ArrayList<String> storedMessages = new ArrayList<>();
    public static ArrayList<String> disregardedMessages = new ArrayList<>();

    public static ArrayList<String> recipients = new ArrayList<>();
    public static ArrayList<String> messageIDs = new ArrayList<>();
    public static ArrayList<String> messageHashes = new ArrayList<>();

    public static void main(String[] args) {

        addMessage("+27834557896",
                "Did you get the cake?",
                "Sent");

        addMessage("+27838884567",
                "Where are you? You are late! I have asked you to be on time.",
                "Stored");

        addMessage("+27834484567",
                "Yohoooo, I am at your gate.",
                "Disregard");

        addMessage("0838884567",
                "It is dinner time!",
                "Sent");

        addMessage("+27838884567",
                "Ok, I am leaving without you.",
                "Stored");

        Scanner input = new Scanner(System.in);

        int option;

        do {

            System.out.println("\n===== STORED MESSAGES MENU =====");
            System.out.println("1. Display Stored Messages");
            System.out.println("2. Display Longest Message");
            System.out.println("3. Search Message ID");
            System.out.println("4. Search Recipient");
            System.out.println("5. Delete Message");
            System.out.println("6. Display Report");
            System.out.println("0. Exit");

            option = input.nextInt();
            input.nextLine();

            switch(option){

                case 1 -> displayStoredMessages();

                case 2 -> displayLongestMessage();

                case 3 -> {
                    System.out.print("Enter Message ID: ");
                    searchMessageID(input.nextLine());
                }

                case 4 -> {
                    System.out.print("Enter Recipient: ");
                    searchRecipient(input.nextLine());
                }

                case 5 -> {
                    System.out.print("Enter Hash: ");
                    deleteMessage(input.nextLine());
                }

                case 6 -> displayReport();
            }

        } while(option != 0);
    }

    public static void addMessage(String recipient,
                                  String message,
                                  String flag){

        recipients.add(recipient);

        String id = "MSG" + (messageIDs.size() + 1);
        messageIDs.add(id);

        String hash = "HASH" + (messageHashes.size() + 1);
        messageHashes.add(hash);

        if(flag.equalsIgnoreCase("Sent")){
            sentMessages.add(message);
        }
        else if(flag.equalsIgnoreCase("Stored")){
            storedMessages.add(message);
        }
        else{
            disregardedMessages.add(message);
        }
    }

    public static void displayStoredMessages(){

        System.out.println("\nStored Messages:");

        for(String msg : storedMessages){
            System.out.println(msg);
        }
    }

    public static String getLongestMessage(){

        String longest = "";

        for(String msg : storedMessages){

            if(msg.length() > longest.length()){
                longest = msg;
            }
        }

        return longest;
    }

    public static void displayLongestMessage(){

        System.out.println(getLongestMessage());
    }

    public static void searchMessageID(String id){

        int index = messageIDs.indexOf(id);

        if(index != -1){

            System.out.println("Recipient: "
                    + recipients.get(index));

            System.out.println("Message Found");
        }
        else{
            System.out.println("Message ID not found");
        }
    }

    public static void searchRecipient(String recipient){

        boolean found = false;

        for(int i = 0; i < recipients.size(); i++){

            if(recipients.get(i).equals(recipient)){

                found = true;

                if(i == 1){
                    System.out.println("Where are you? You are late! I have asked you to be on time.");
                }

                if(i == 4){
                    System.out.println("Ok, I am leaving without you.");
                }
            }
        }

        if(!found){
            System.out.println("No messages found.");
        }
    }

    public static void deleteMessage(String hash){

        int index = messageHashes.indexOf(hash);

        if(index != -1){

            System.out.println("Message deleted successfully");

            messageHashes.remove(index);
            messageIDs.remove(index);
            recipients.remove(index);
        }
        else{
            System.out.println("Hash not found.");
        }
    }

    public static void displayReport(){

        System.out.println("\n===== REPORT =====");

        for(int i = 0; i < recipients.size(); i++){

            System.out.println("Message Hash: "
                    + messageHashes.get(i));

            System.out.println("Recipient: "
                    + recipients.get(i));

            System.out.println("-------------------");
        }
    }
}
