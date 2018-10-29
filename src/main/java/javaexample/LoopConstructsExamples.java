package javaexample;

public class LoopConstructsExamples {
    public static void main(String[] args) {

        computeSum();
        computeFactorial();

        // 1. Write a method that computes the sum of numbers from 1 to 10 - try to do it with FOR and then with WHILE
        // 2. Write a program that computes n! for given n
    }

    private static void computeSum() {
        int sum;
        sum = 0;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            sum = sum + a[i];
        }

        System.out.println("sum is: " + sum);
    }

    private static void computeFactorial() {
        int n = 7;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("The factorial of 7 is " + result);
    }
}