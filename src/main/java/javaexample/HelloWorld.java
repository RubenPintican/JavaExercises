package javaexample;

import java.util.Scanner;

public class HelloWorld {

    /**
     * This is a method
     * @param args
     */
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String yourName = input.nextLine();
//        System.out.println("Hello,");
//        System.out.print(yourName);
        System.out.printf("Hello, %s!!!\n", yourName);

    }


}
