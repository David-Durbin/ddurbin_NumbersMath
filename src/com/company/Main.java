package com.company;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        // Create new scanner for user input
        Scanner scanner = new Scanner(System.in);

        // create an boolean for flow control
        boolean flow = true;
        // create a double to hold amount total, another to hold the tax rate another for the tip
        // and one for the input and one for the final total with tip
        double total = 0.0, tax = 1.025, tip = 1.175, input = -1, finalTotal = 0.0;

        System.out.println("To calculate the total bill please enter the cost of each item. " );
        System.out.println("To finish please enter a 0. Your total cost with tax will be displayed as will");
        System.out.println("the suggested bill with the addition of a tip. Have a pleasant day.");

        do
        {
            System.out.println("Please enter the cost of the next item:");
            input = scanner.nextDouble();

            if(input == 0)
            {
                flow = false;
            }

            input = Math.abs(input);
            total += input;
            total = (double)Math.round(total * 100) / 100;

            System.out.println("Your current total before tax is: $" + total);
            System.out.println();

        }while(flow);

        // math out total and tax
        total = total * tax;
        total = (double)Math.round(total * 100) / 100;

        finalTotal = total * tip;
        finalTotal = (double)Math.round(finalTotal * 100) / 100;

        System.out.println("Thank you!");
        System.out.println("Your total bill with tax is: $" + total);
        System.out.println("We also recommend that a gratuity of 17.5% be left, bringing your bill to: $" + finalTotal);
    }
}
