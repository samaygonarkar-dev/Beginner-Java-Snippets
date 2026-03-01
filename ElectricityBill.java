package com.stech.samay.test;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Domestic\n2. Commercial\n3. Industrial");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        System.out.print("Enter Service ID: ");
        String id = sc.next();
        
        System.out.print("Enter Name: ");
        String name = sc.next();
        
        System.out.print("Enter Current Reading: ");
        int current = sc.nextInt();
        
        System.out.print("Enter Previous Reading: ");
        int previous = sc.nextInt();
        
        int units = current - previous;
        double bill = 0;
        
        if (choice == 1) { 
            if (units <= 200) bill = 0;
            else if (units <= 499) bill = units * 3;
            else if (units <= 999) bill = units * 4;
            else bill = units * 5;
            if (bill < 10) bill = 10;
        } else if (choice == 2) { 
            if (units <= 200) bill = units * 3;
            else if (units <= 499) bill = units * 5;
            else if (units <= 999) bill = units * 6;
            else bill = units * 7;
            if (bill < 100) bill = 100;
        } else { 
            if (units <= 200) bill = units * 4;
            else if (units <= 499) bill = units * 6;
            else if (units <= 999) bill = units * 7;
            else bill = units * 8;
            if (bill < 500) bill = 500;
        }
        
        double serviceCharges = bill * 0.05;
        double total = bill + serviceCharges;
        System.out.println("===================================");
        System.out.println("\n============MahaVitaran===========");
        System.out.println("===================================");
        System.out.println("Customer Type: " + (choice == 1 ? "DOMESTIC" : choice == 2 ? "COMMERCIAL" : "INDUSTRIAL"));
        System.out.println("Service Id: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Net Bill: " + bill);
        System.out.println("Service Charges: " + serviceCharges);
        System.out.println("Total Bill: " + total);
        System.out.println("===================================");
        System.out.println("Please pay the bill in time to avoid disconnection");
        System.out.println("===================================");
        
    }
}