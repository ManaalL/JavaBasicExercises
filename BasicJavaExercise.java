
/**
 * Here are some of the Basic Java Exercises to understand how to do proper input and output as well as proper code formats
 *
 * @Manaal Lakhani
 * @March 5, 2024
 */

import java.util.Scanner;
import java.time.Year;

public class BasicJavaExercise {
    public static void deskconverter() {
            // This method converts the length of a desk from inches to centimeters
        
        Scanner scanner = new Scanner(System.in);
            // Create a Scanner object to read input from the user
            
        System.out.print("Enter the length of the desk in inches: ");
        double lengthInInches = scanner.nextDouble();
            // Takes in user imput on what the lenght of the desk is in inches and stores that as a double
        
        scanner.close();
            // Close the Scanner to prevent leak
        
        double InchestoCentimeters = 2.54;
        double lengthInCentimeters = lengthInInches * InchestoCentimeters;
            // Converts the lenght of the desk in inches by multiplying it with the conversion rate of Inches to Centimeters 
        
        System.out.println("The length of the desk in centimeters is: " + lengthInCentimeters + " cm");
            // Prints out results of how long the desk is in centimeters 
            
    }
    public static void ageCalculator() {
            // This method takes your birth date and the current year to calculate your current age 
        
        Scanner scanner = new Scanner(System.in);
            // Creates a Scanner object to read input from the user
            
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
            // Takes input of what the users birth year is and saves it as an integer
        scanner.close();
            // Close the Scanner to prevent leak

        int currentYear = Year.now().getValue();
        int age = currentYear - yearOfBirth;
            // Uses the current year and subtracts that from the birth year of the user to get the current age 

        System.out.println("Your age in the current year is: " + age);
            // Prints out the result of the age of the user
        
    }
    public static void numbers() {
            // This method lists out 4 numbers seperated by commas
        
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read input from the user
            
        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scan.nextInt();
        System.out.print("Enter the fourth number: ");
        int number4 = scan.nextInt();
            // Asks user to enter 4 numbers and stores them as integers 
        
        scan.close();
            // Close the Scanner to prevent leak

        System.out.println(number1 + ", " + number2 + ", " + number3 + ", " + number4);
            // Prints out result of each number given seperated by commas 
        
    }
    public static void greeting() {
            // This method greats the user using their name and a special phrase 
            
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read input from the user 
        
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
            // Asks user to input thier name and saves it as a string
            
            scan.close();
            // Close the Scanner to prevent leak
        
        System.out.println("Good day to you " + name + "!");
            // Greets the user by wishing them a good day 
        
        
    }
    public static void productAndSquares() {
            // This method takes 3 numbers from the User and finds the product of them and then squares the product
        
        Scanner scan = new Scanner(System.in);
            // Create a Scanner object to read input from the user

        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scan.nextInt();
            // Asks use to provide 3 numbers and then save them as int 
            
        scan.close();
            // Close the Scanner to prevent leak
        
        int productOfNumbers = number1 * number2 * number3; 
            // Multiplys the 3 numbers together 
            
        int squareOfProduct = productOfNumbers * productOfNumbers;
            // Takes the product of the 3 numbers and multiplies them with each other, essentially squaring the product
        
        System.out.println("The product of all the numbers is " + productOfNumbers);
        System.out.println("The square of the product of the three numbers is " + squareOfProduct);
            // Prints out the product of the three numbers and the square of the product on two seperate lines
    }
    public static void reverseNames(){
            // This method gets 5 names from the user and prints them in a reverse order
            
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user 
        
        System.out.print("Enter the first name: ");
        String name1 = scan.nextLine();
        System.out.print("Enter the second name: ");
        String name2 = scan.nextLine();
        System.out.print("Enter the third name: ");
        String name3 = scan.nextLine();
        System.out.print("Enter the fourth name: ");
        String name4 = scan.nextLine();
        System.out.print("Enter the fifth name: ");
        String name5 = scan.nextLine();
            // Asks user for 5 names and saves them as a string
        
        scan.close();
            // Close the Scanner to prevent leak
        
        System.out.println(name5 + ", " + name4 + ", " + name3 + ", " + name2 + ", " + name1);
            // Prints out the 5 names seperated by commas in the reverse order that they were given 
        
    }
    public static void fullName(){
            // This method asks the user for thier first and last name and prints it out in reverse order 
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user
        
        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();
            // Asks for users first and last name, then saves them as strings 
        
        scan.close();
            // Closes the Scanner to prevent leak
        
        System.out.println(lastName + ", " + firstName);
            // Prints out the last name and then the first name 
    }
}
    
    
    


