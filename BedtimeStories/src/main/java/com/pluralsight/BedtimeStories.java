package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class BedtimeStories {

    static Scanner UserInput = new Scanner(System.in);

    public static void main(String[] args) {


        try {
            System.out.println("Which Bedtime Story would you like to read? ");
            displayStories();;
            String choiceStory = UserInput.nextLine();


            FileInputStream fis1 = new FileInputStream("src/main/resources/" + choiceStory);
            Scanner fileScanner1 = new Scanner(fis1);

            int lineNum = 1;

            while (fileScanner1.hasNextLine()) {
                //print out each line of the file
                System.out.println(lineNum + ": " + fileScanner1.nextLine());
                lineNum++;

            }
        } catch (Exception e){
            System.out.println("That file doesn't exist, Please try Again");

        }

    }

    static void displayStories(){
        System.out.println("1. Goldilocks | goldilocks.txt \n2. Hansel & Gretel | hansel_and_gretel.txt \n3. Mary had a little lamb | Mary_had_a_little_lamb.txt");
    }
}
