package javaexample;

public class ArraysExemples {

    public static void main(String[] args) {

        computeAverage();
        computeProductOfArray();

        // 1. Write a method in order to compute average of elements in array
        // 2. Write a method that computed the product of the elements in an integer array
    }
    private static void computeAverage() {
        double average, sum;
        average = 0;
        sum= 0;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            sum = sum +a[i];}
        average = sum / 10;
        System.out.println("Average is: " + average);

    }

    private static void computeProductOfArray() {
        {
            double  product;
            product=1.0;
            double[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < 10; i++)
            {
                product = product *a[i];
            }
            System.out.println("Product is: " + product);
        }
    }

}
