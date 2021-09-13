package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
 */
/*Exercise 10 - Self-Checkout
        Working with multiple inputs and currency can introduce some tricky precision issues.

        Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

        Example Output
        Enter the price of item 1: 25
        Enter the quantity of item 1: 2
        Enter the price of item 2: 10
        Enter the quantity of item 2: 1
        Enter the price of item 3: 4
        Enter the quantity of item 3: 1
        Subtotal: $64.00
        Tax: $3.52
        Total: $67.52
        Constraints
        Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
        Be sure you explicitly convert input to numerical data before doing any calculations.

*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tax_rate;
        tax_rate = 0.055;

        double the_first_price, FST_QUANTY, the_secnd_price, SND_QNTITY, thd_PRICE;
        int THE_THD_QNTY;
        System.out.println("Enter the price of item 1: ");
        the_first_price = in.nextDouble();

        System.out.println("Enter the quantity of item 1: ");
        FST_QUANTY = in.nextInt();

        System.out.println("Enter the price of item 2: ");
        the_secnd_price = in.nextDouble();

        System.out.println("Enter the quantity of item 2: ");
        SND_QNTITY = in.nextInt();

        System.out.println("Enter the price of item 3: ");
        thd_PRICE = in.nextDouble();

        System.out.println("Enter the quantity of item 3: ");
        THE_THD_QNTY = in.nextInt();

        double the_subtotal;
        double THE_TAXES;
        double TOTAL_AMOUNT;
        the_subtotal = (the_first_price * FST_QUANTY) + (the_secnd_price * SND_QNTITY) + (thd_PRICE * THE_THD_QNTY);


        THE_TAXES = the_subtotal * tax_rate;
        TOTAL_AMOUNT = THE_TAXES + the_subtotal;


        String output = String.format("Subtotal: %.2f\nTax: %.2f\nTotal: $%.2f", the_subtotal, THE_TAXES, TOTAL_AMOUNT);
        System.out.println(output);
    }
}


