package com.train.management;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("===================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("===================================");

        // Initialize empty train consist (List of bogies)
        List<String> bogies = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + bogies.size());

        System.out.println("Program continues...");
    }
}