package javaexample1;

public class ArrayExercises {


    public static void main(String[] args) {

//        System.out.println(exist(8));
        System.out.println(getPosition(7));
    }

    public static boolean exist (int n)
    {
      int [] array = {1,2,3,4,5,6,7,8,9,10};
      for (int element : array)
      {
          if (element==n)
          {
              return true;
          }
      }
          return false;
    }

    public static int getPosition (int n) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }

    }