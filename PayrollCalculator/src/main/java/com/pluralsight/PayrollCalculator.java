package com.pluralsight;

import java.io.*; // All the input/output imports
import java.util.Scanner;


public class PayrollCalculator {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        //here's the file name

        System.out.println("Enter the name of the file employee file to process: ");
        String filename = userInput.nextLine();

        System.out.println("Enter the name of the payroll file to create: ");
        String writerFileName = userInput.nextLine();

        try{

            // create File reader to bring our file into our code
            FileReader theFile = new FileReader("src/main/resources/" + filename);
            BufferedReader myBufferReader = new BufferedReader(theFile);
            //Eats/moves on to the  next line (the "employees.csv" has a header line of strings)
            myBufferReader.readLine();


            FileWriter writeFile = new FileWriter("src/main/resources/" + writerFileName);
            // Bufwriter takes over for filWriter
            BufferedWriter bufWriter = new BufferedWriter(writeFile);


            //looping the bufferReader
            String  theLine;
            while((theLine = myBufferReader.readLine()) != null){
                //this will split the detail by pipes(|)
                String [] employeeDetails = theLine.split("\\|");

                //generate a real employee
                Employee employee1 = new Employee(Integer.parseInt(employeeDetails[0]), employeeDetails[1], Double.parseDouble(employeeDetails[2]), Double.parseDouble(employeeDetails[3]));

                System.out.printf("the Employee id is %d, the Employee Name is %s, the employee Gross pay is $%.2f\n ", employee1.getEmployeeId(), employee1.getEmployeeName(), employee1.getGrossPay());

                bufWriter.write("id" + "|" + "name" + "Gross Pay" + "|");
                String lineForWriterFileName = employee1.getEmployeeId() + "|" + employee1.getEmployeeName() + "|" + employee1.getGrossPay() + "\n";
                bufWriter.write(lineForWriterFileName);


            }

            //closes both reader and & writer
            bufWriter.close();
            myBufferReader.close();


        } catch (IOException e){
            System.out.println("Sorry, File not found");
            e.printStackTrace();
        }
    }

}

