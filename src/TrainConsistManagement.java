package com.train.management;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement{

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC2 - Passenger Bogie Management");
        System.out.println("===================================");

        // Create ArrayList to store passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- ADD BOGIES ----
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies added:");

        // ---- DISPLAY BOGIES ----
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // ---- REMOVE A BOGIE ----
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("Updated bogie list:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // ---- CHECK EXISTENCE ----
        System.out.println("\nChecking if 'Sleeper' bogie exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        System.out.println("\nProgram continues...");
    }
}