package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Saveable project from Udemy!");
        // write your code here
        Pirate pirateJack = new Pirate("MadJack", "captain", 10, 10);


        //pirateJack.toString();
        //System.out.println(pirateJack.toString());
        System.out.println(pirateJack);
        pirateJack.setCast("private");
        System.out.println(pirateJack);
        saveObject(pirateJack);


    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.writeElements().size(); i++) {
            System.out.println("Saving " + objectToSave.writeElements().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.readElements(values);

    }


}
