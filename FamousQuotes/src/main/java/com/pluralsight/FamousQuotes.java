package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] quotes = {"Fortune favors the bold. – Virgil",
                "Life is what happens when you’re busy making other plans. – John Lennon.",
                "“I think, therefore I am. – René Descartes.",
                "Be yourself; everyone else is already taken.– Oscar Wilde.",
                "The greatest glory in living lies not in never falling, but in rising every time we fall. – Nelson Mandela.",
                "Tough times never last but tough people do. – Robert H. Schuller.",
                "Get busy living or get busy dying.–  Stephen King.",
                "Time is money. – Benjamin Franklin", "The journey of a thousand miles begins with one step. - Lao Tzu",
                "That which does not kill us makes us stronger. - Friedrich Nietzsche"};
        //
        boolean choosingQuote = true;

        while (choosingQuote) {
            //Prompt the User to pick a number between 1-10
            System.out.println("Select a number between 1 and 10");
            int numChoice = theScanner.nextInt();

            try {
                System.out.println(quotes[numChoice - 1]);
            } catch (Exception e) {
                System.out.println("Sorry, number out of bounds");
                continue;
            }

            theScanner.nextLine();
            System.out.println("Would yould like another quote? (y/n)");
            


        }

            Random random = new Random();

//        int index = random.nextInt(quotes.length);
//        System.out.println(quotes[index]); // print randomized quote

    }
}
