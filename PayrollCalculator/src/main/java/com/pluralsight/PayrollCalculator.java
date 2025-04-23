package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;


public class PayrollCalculator {
    public static void main(String[] args) {
        //here's the file name

        try{
            String filename = "employees.csv";

            // create File reader to bring our file into our code
            FileReader theFile = new FileReader("src/main/resources/" + filename);
            BufferedReader myBufferReader = new BufferedReader(theFile);
            myBufferReader.readLine();

            //looping the bufferReader
            String  theLine;
            while((theLine = myBufferReader.readLine()) != null){
                //this will split the detail by pipes(|)
                String [] employeeDetails = theLine.split("\\|");

                //genenrate a real employee

                Employee employee1 = new Employee(Integer.parseInt(employeeDetails[0]), employeeDetails[1], Double.parseDouble(employeeDetails[2]), Double.parseDouble(employeeDetails[3]));
                System.out.printf("the Employee id is %d, the Employee Name is %s, the employee Gross pay is $%.2f\n ", employee1.getEmployeeId(), employee1.getEmployeeName(), employee1.getGrossPay());







            }


        } catch (Exception e){
            //System.out.println("Sorry ");
            e.printStackTrace();

        }
    }

}

