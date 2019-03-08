package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String promptString(){
        boolean isSting = false;
        String userString ="";
        while (!isSting){
            try{
                System.out.println("input a String.");
                userString = input.nextLine();
                double stringChecker = Double.parseDouble(userString);
                int stringChecker2 = Integer.parseInt(userString);
                isSting = false;
            }catch (Exception e){
                isSting = true;
            }
        }return userString;
    }
    static int promptInt(){
        boolean isInt = false;
        int newInt = 0;
        while (!isInt){
            try{
                System.out.println("input a int.");
                String userInt = input.nextLine();
                newInt = Integer.parseInt(userInt);
                isInt = true;
            }catch (Exception e){
                System.out.println("Your value is not valid!");
                isInt = false;
            }
        }return newInt;
    }
    static double promptDouble(){
        boolean isDouble = false;
        double newDouble = 0;
        while (!isDouble){
            try{
                System.out.println("input a Double.");
                String userDouble = input.nextLine();
                newDouble = Double.parseDouble(userDouble);
                isDouble = true;
            }catch (Exception e){
                System.out.println("Your value is not valid!");
                isDouble = false;
            }
        }return newDouble;
    }
    public static void main(String[] args) {
        promptString();
        promptInt();
        promptDouble();


    }
}
