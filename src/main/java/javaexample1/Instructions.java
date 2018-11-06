package javaexample1;

public class Instructions {

    /**
     * 1.	Afisati rezultatul urmatoarelor operatii
     * 2.	Sa se determine daca un numar este prim.
     * 3.	Calculati suma, diferenta, produsul si catul cifrelor unui numar dat.
     *
     * @param
     */

    public static void main(String[] args) {
//        calculation();
//        prim(5);
//        operation(5.5,10.5);
//        mamximumOfANumber(15,14);
        //forDisplay(new int[10]);
        //foreachDisplay(new int[15]);
        // returnnumeber();
        doWhileDisplay();
    }

    private static void calculation() {
        int a = -5;
        int b = 8;
        int c = 6;
        System.out.println(a + (b * c));

        int d = 55;
        int e = 9;
        int f = 9;
        System.out.println((d + e) % f);

    }

    public static void prim(int n) {
        int divizori = 0; // initializam variabila
        int nr = 1; //initializam variabila
        while (nr <= n) {
            if (n % nr == 0) {
                divizori++;
            }
            nr++;
        }
        if (divizori == 2) {
            System.out.println(n + " este prim!");
        } else
            System.out.println(n + "nu este prim!");
    }


    public static void operation(double a, double b) {
        double sum;
        double prod;
        double multiplication;
        double division;

        System.out.println("suma este " + (a + b));
        System.out.println("suma este " + (a - b));
        System.out.println("produsul este " + (a * b));
        System.out.println("catul  este " + (a / b));

    }

    public static void mamximumOfANumber(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
            System.out.println("a este mare " + a);
        } else {
            max = b;
            System.out.println("b este mai mare " + b);
        }
    }

    public static void forDisplay(int[] a) {
        System.out.println("Display an array using for loop");
        for (int index = 0; index < a.length; index++) {
            System.out.println(a[index] + " ");
        }
        System.out.println();
    }

    public static void foreachDisplay(int[] a) {
        System.out.println("Display an array using for each loop");
        for (int element : a) {
            System.out.println(element + " ");
        }
    }

    public static void returnnumeber() {
        for (int x = 0; x < 100; x++)
            System.out.println(x);
    }

    public static void doWhileDisplay() {
        int num = 0;
        do {
            System.out.println(num);
            num++;
        }
        while (num < 10);
    }
}

