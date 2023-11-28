package part1andpart2;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        
    	System.out.println("Josiah Barringer - PROGRAMMING: Final Assignment Part 1");
    	
    	// Student information
        int[] studentIds = {1098, 7654, 3210, 2234, 5641, 4467, 9365, 8884, 0143, 5680};
        String[] studentNames = {"Josiah", "Jesse", "Jacob", "Joy", "James", "Naomi", "Emmah", "Babba", "Kathye", "Rick"};
        double[] studentGPAs = {3.3, 1.9, 3.1, 4.0, 3.7, 3.2, 3.9, 4.0, 3.4, 3.3};

        try (// Prompt for student ID number
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Student ID: ");
			int searchId = scanner.nextInt();

			// Search for the ID number in the array
			boolean found = false;
			String name = "";
			double gpa = 0.0;

			for (int i = 0; i < studentIds.length; i++) {
			    if (studentIds[i] == searchId) {
			        found = true;
			        name = studentNames[i];
			        gpa = studentGPAs[i];
			        break;
			    }
			}

			// Display results
			if (found) {
			    System.out.println("Name: " + name);
			    System.out.println("GPA: " + gpa);
			} else {
			    System.err.println("Invalid ID number: " + searchId);
			}
		}
    }
}
