
package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLoggerApp {

    static Scanner myScanner = new Scanner(System.in);

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        //Only 2 things you can do with a search engine: Search or Close

        //this is a variable that will keep the loop running
        // until we want to quit
        boolean appRunning = true;

        writeToFile(" launch");

        while (appRunning) {

            //Asks user to search
            System.out.print("Enter your search (Enter x exit): ");
            // to lower because my cases are in lowercase
            String search = myScanner.nextLine();

            if (search.equalsIgnoreCase("x")) {
                System.out.print("Bye!");
                writeToFile(" exit");
                appRunning = false;
                break;
            } else{
                writeToFile(" search: " + search);
            }

        }


    }

    public static void writeToFile (String theAction){
        try {

            //neccessary for writing to file
            FileWriter fileWriter = new FileWriter("src/main/resources/logs.txt", true);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            LocalDateTime today = LocalDateTime.now();

            // writes to the file and puts stuff in the file
            bufWriter.write(today.format(formatter)+ " " + theAction);

            bufWriter.newLine();

            bufWriter.close();

        } catch (Exception e) {
            System.out.println("invalid file.");
            e.printStackTrace();
        }
    }
}

/*package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class theSearchEngineLoggerApp {

    //create pattern/formatter we need for time stamp format
    static DateTimeFormatter timeStampFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    //create the scanner to get input from the user via the console
    static Scanner theScanner = new Scanner(System.in);


    public static void main(String[] args) {

        //when the application launches, make an entry in the log
        logActions("launch");

        //create a variable that will keep us looping the question for the user
        //until they decide to quite
        boolean appRunning = true;

        while(appRunning){

            //dispaly the question to the user
            System.out.println("Enter a search term (X to exit):");
            //store their answer in the variable searchTerm
            String searchTerm = theScanner.nextLine();

            if(searchTerm.equalsIgnoreCase("x")){
                System.out.println("Have a nice life!");
                logActions("exit");
                appRunning = false;
            }else{
                //log the search term to the log file
                logActions("search : " + searchTerm);
            }

        }


    }

    //the is the method that will create and maintain our log file
    public static void logActions(String theAction){

        //allow us to try and write to the file
        try{

            //create a file writer and set append to true so it adds to the file
            //and not override its contents
            FileWriter outPutFile = new FileWriter("src/main/resources/logs.txt", true);
            //create the buffered writer to write to the log file
            BufferedWriter bufWriter = new BufferedWriter(outPutFile);

            //create a date and time
            LocalDateTime timeStamp = LocalDateTime.now();
            //create the line to write to the log file buy concating the timestamp in the correct format a space and the action
            bufWriter.write(timeStamp.format(timeStampFormatter) + " " + theAction);
            //make sure we have a new line in our file
            bufWriter.newLine();
            //close the bufWriter so it actually writes to the file
            bufWriter.close();

        } catch (Exception e) {
            //if we ran into an issue writing to the file, display this instead
            System.out.println("Error writing to the file: " + e.getMessage());
        }

    }

}
*/



