package javaexample1;

import java.util.Scanner;

public class ShowThePrimeNumbers {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar de inceput! ");
        int numar1 = scanner.nextInt();

        System.out.println("Introduceti un alt numar de sfarsit");
        int numar2 = scanner.nextInt();

        if (numar1 > numar2 ){
            showPrime(numar2, numar1);
        }else {
            showPrime(numar1, numar2);
        }

    }

    public static void showPrime(int nr1, int nr2){

        for (int i = nr1; i<nr2; i++){
            int rez = divisors(i);
            if (rez == 2)
                System.out.print(i+ " ");
        }
    }

    public static int divisors (int numar){
        int nrDivizori  = 0;
        for (int i = 1; i<= numar; i ++){
            if (numar%i == 0)
                nrDivizori++;
        }
        return nrDivizori;
    }

}
