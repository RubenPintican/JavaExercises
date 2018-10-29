package javaexample;

public class ConvertVariables {

    public static void main(String[] args) {
        String x = "1";
        String y = "2";

        System.out.println(x + y);

        int i = Integer.parseInt(x);
        int j = Integer.parseInt(y);

        System.out.println(i + j);


        String gpa = "2.58";
        double gpa1 = Double.parseDouble(gpa);

        System.out.println(gpa1 - 1.52);

    }
}
