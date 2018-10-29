package javaexample;

public class OperatorsExamples {
    public static void main(String[] args) {

        checkIfLeapYear();
        checkIfNumberIsPositive();
        checkIfNumberIsOdd();

        // 1. Write a program to check if a given number is positive or not
        // 2. Write a program to compute the following: add parantheses to check if year is leap: year % 4 == 0 && year % 100 != 0 || year % 400 == 0
        // 3. Write a program to check if a given number is even or odd
    }

    private static void checkIfNumberIsPositive() {
        int num=10;
        if ( num>= 0 )
            System.out.println("This is a pozitive number");
        else
            System.out.println("This is a negativ number");

    }

    private static void checkIfLeapYear() {

        int num1 = 1992;
        System.out.println( num1 % 4 == 0 && num1 % 100 != 0 || num1 % 400 == 0);

    }

    private static void checkIfNumberIsOdd() {
        int num=21 ;

        if ( num % 2 == 1 )
            System.out.println("Entered number is odd");
        else
            System.out.println("Entered number is even");
    }
}
