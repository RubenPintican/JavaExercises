package javaexample;

import java.util.Scanner;

public class CalculateArea_Perimeter {

    public static void main ( String [] args)
    {
        int length, width;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length :");
        length = input.nextInt();
        System.out.print("Enter the width :");
        width = input.nextInt();

        int area = rectangleArea (length, width);
        int per = rectanglePerimeter(length, width);

        System.out.printf("Rectangle Area is : %d ; Perimeter is : %d", area, per);
    }

    public static int rectangleArea(int someLength, int someWidth)
    {
        return someLength * someWidth;
    }

    public static int rectanglePerimeter(int someLength, int someWidth)
    {
        return 2*(someLength + someWidth);
    }
}
