/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balex;

/**
 *
 * @author user 2022
 */
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        // Declare the variables for course details
        String courseName = "";
        int tuition = 0;
        boolean validCourseID = true;

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the applicant to enter the CourseID
        System.out.print("Enter CourseID: ");
        String courseID = scanner.nextLine().toUpperCase();

        // Determine the course details based on the CourseID
        switch (courseID) {
            case "BSE":
                courseName = "Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                courseName = "Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                courseName = "Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                courseName = "Computer Engineering";
                tuition = 950000;
                break;
            default:
                validCourseID = false;
                break;
        }

        // Display the course details or an error message
        if (validCourseID) {
            System.out.println("Course Name: " + courseName);
            System.out.println("Tuition: " + tuition);
        } else {
            System.out.println("Wrong CourseID details");
        }

        // Close the scanner
        scanner.close();
    }
}
