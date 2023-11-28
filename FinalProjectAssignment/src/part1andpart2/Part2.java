package part1andpart2;

import java.util.Scanner;

public class Part2 {
    enum Day {
        MONDAY("9:01 AM - 5:01 PM"),
        TUESDAY("9:30 AM - 10:30 AM"),
        WEDNESDAY("10:00 AM - 7:00 PM"),
        THURSDAY("8:30 AM - 4:00 PM"),
        FRIDAY("9:00 AM - 5:30 PM"),
        SATURDAY("Closed"),
        SUNDAY("The Lord's Day");

        private final String businessHours;

        Day(String businessHours) {
            this.businessHours = businessHours;
        }

        public String getBusinessHours() {
            return businessHours;
        }
    }

    public static void main(String[] args) {
        
    	System.out.println("Josiah Barringer - PROGRAMMING: Final Assignment Part 2");
    	
    	Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display list of days
            System.out.println("Days of the Week:");
            for (Day day : Day.values()) {
                System.out.println(day);
            }

            // Prompt for a day
            System.out.print("Enter a day of the week (or 'exit' to exit): ");
            String userInput = scanner.nextLine().toUpperCase();

            if (userInput.equals("EXIT")) {
                break;
            }

            // Parse user input and display business hours
            try {
                Day selectedDay = Day.valueOf(userInput);
                System.out.println("Business Hours for " + selectedDay + ": " + selectedDay.getBusinessHours());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid day");
            }

            System.out.println(); // Add a blank line for readability
        }

        scanner.close();
    }
}

