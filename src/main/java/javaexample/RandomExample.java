package javaexample;

import java.util.Random;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {

        //Pseudo-random number example

        Random generator = new Random();
        int i = generator.nextInt(10);

        System.out.println(i);


        //Reverse a String

        String forward = "This is a test!";
        StringBuilder sb = new StringBuilder();
        sb.append(forward);
        StringBuilder reversesb = sb.reverse();
        String reverse = reversesb.toString();

        System.out.println(forward);
        System.out.println(reverse);

        //Circumference and area of a circle

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        double radius = input.nextDouble();

        double circ = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);

        System.out.printf("Circumference : %f; Area %f\n", circ, area);

    }
}
