package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    // creates an array of products and returns it
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        // this method loads product objects into inventory // and its details are not shown

        inventory.add(new Product(1, "product1", 27.99f));
        inventory.add(new Product(2, "chips", 9.99f));
        inventory.add(new Product(3, "rollerblades", 159.99f));
        inventory.add(new Product(4, "dog food", 15.99f));
        inventory.add(new Product(5, "cat food", 9.99f));



        try{

            //open inventory.csv file - File & bufferReader in the Try/catch
            FileReader myFile = new FileReader("src/main/resources/inventory.csv");
            BufferedReader myBufferReader = new BufferedReader(myFile);

             //loop over each line in the csv file - similar loop in payroll calc
            String theLine;
        while((theLine = myBufferReader.readLine()) != null){
            //inside of the loop we will create a product  by spliting a line on the loop
            String [] productDetails = theLine.split("\\|");

            //generate a product
            // add the product to the inventory list using inventory.add instead of printing the employee
            inventory.add(new Product(Integer.parseInt(productDetails[0]), productDetails[1], Float.parseFloat(productDetails[2])));

        }
        } catch(IOException e){
            System.out.println("invalid");
        }

        return inventory;
    }
}

