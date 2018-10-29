package javaexample;

public class DecisionConstructsExamples {

    public static void main(String[] args) {

        checkIfTwoDigitNumber(10);
        checkIfCharIsVowel();

        // 1. Write a method that checks if a given number is a two-digit number
        // 2. Write a method that checks if a given char is a vowel: a,e,i,o,u,A,E,I,O,U
    }

    private static void checkIfTwoDigitNumber(int n) {
        if (n >= 10 && n < 100) {
            System.out.println("This is a two-digit number");
        } else {
            System.out.println("This is not a two-digit number");
        }
    }

    public static void checkIfCharIsVowel() {
        char c = 'a';
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c== 'U')
            System.out.println(c + " is vowel");
        else
            System.out.println(c + " is consonant");
    }
}