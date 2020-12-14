package se.lexicon;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        boolean active = true;
        Scanner sc = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        double answer;
        String choice;

        System.out.println("Armin Fajkovic homemade calculator \n\n");


        while (active = true) {
            System.out.println("\n Write the symbol of the desired mathematical operation");
            choice = sc.next();
            System.out.println("Please enter the first number:");
            firstNumber = sc.nextInt();
            System.out.println("\nPlease enter the second number");
            secondNumber = sc.nextInt();

            switch (choice) {
                case "+":
                    answer = Functions.addition(firstNumber,secondNumber);
                    System.out.println("\n"+answer);
                    break;
                case "*":
                    answer = Functions.multiplication(firstNumber,secondNumber);
                    System.out.println("\n"+answer);
                    break;
                case "/":
                    answer = Functions.division(firstNumber,secondNumber);
                    System.out.println("\n"+answer);
                    break;
                case "-":
                    answer = Functions.addition(firstNumber,secondNumber);
                    System.out.println("\n"+answer);
                    break;
                default:
                    System.out.println("\n\nThat doesn't work. Shutting down calculator.");
                    active=false;
                    break;


            }


        }
    }
}