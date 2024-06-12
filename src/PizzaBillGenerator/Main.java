package PizzaBillGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("What type of pizza do you want?");
            System.out.println("1. Basic Pizza\n2. Deluxe Pizza");
            int op = sc.nextInt();
            if (op == 1) {
                basicPizza(sc);
            } else if (op == 2) {
                deluxPizza(sc);
            } else {
                System.out.println("Invalid option.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a number.");
        }
    }

    // Function for basic pizza menu
    static void basicPizza(Scanner sc) {
        System.out.println("Welcome to Sasta Pizza's :D");
        System.out.println("Which type of pizza do you want?");
        System.out.println("1. Veg \n2. Non-Veg");
        int op = sc.nextInt();
        try {
            if (op == 1 || op == 2) {
                boolean isVeg = op == 1;
                Pizza p = new Pizza(isVeg);

                System.out.println("Do you want extra cheese? (y/n)");
                char ansChar = sc.next().charAt(0);
                p.extraCheese(ansChar == 'y');

                System.out.println("Do you want extra toppings? (y/n)");
                ansChar = sc.next().charAt(0);
                p.extraToppings(ansChar == 'y');

                System.out.println("Do you want to takeaway? (y/n)");
                ansChar = sc.next().charAt(0);
                p.takeAway(ansChar == 'y');

                p.getBill();
            } else {
                System.out.println("Invalid option, try again.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, try again.");
            sc.next(); // Clear the invalid input
        }
    }

    // Function for deluxe pizza
    static void deluxPizza(Scanner sc) {
        System.out.println("Welcome to Sasta Pizza's :D");
        System.out.println("Which type of pizza do you want?");
        System.out.println("1. Veg \n2. Non-Veg");
        int op = sc.nextInt();
        try {
            if (op == 1 || op == 2) {
                boolean isVeg = op == 1;
                DeluxPizza dp = new DeluxPizza(isVeg);
                System.out.println("Do you want to takeaway? (y/n)");
                char ansChar = sc.next().charAt(0);
                dp.takeAway(ansChar == 'y');

                dp.getBill();
            } else {
                System.out.println("Invalid option, try again.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, try again.");
            sc.next(); // Clear the invalid input
        }
    }
}
