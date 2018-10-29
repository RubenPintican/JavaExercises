package javaexample;

import java.util.*;

public class CollectionsExamples {
    public static void main(String[] args) {

        findFirstIndexOfElement();
        checkIfKeyExistsInMap();
        deleteAllElementsFromSet();

        // 1. Write a method in order to find the first index of a given element in a List
        // 2. Check if a particular key exists in a HashMap
        // 3. Write a method in order to delete all elements of a HashSet

    }

    private static void findFirstIndexOfElement() {
        List<String> list = new ArrayList<>();

        /**
         * This is how elements should be added to the array list
         */
        list.add("Ruben");
        list.add("Andrei");
        list.add("Gabi");

        System.out.println("First index: " + list.get(0));
    }


    private static void checkIfKeyExistsInMap() {
        Map<Integer, String> hmap = new HashMap<>();

        /**
         * Adding elements to Map
         */
        hmap.put(5, "Raluca");
        hmap.put(1, "Gabriela");
        hmap.put(7, "Delia");

        System.out.println("This key exist:" + " 5 : " + hmap.containsKey(5));
        System.out.println("This key not exist:" + " 12 : " + hmap.containsKey(12));
    }

    private static void deleteAllElementsFromSet() {
        /**
         * HashSet declaration
         */
        Set<String> hset = new HashSet<>();

        /**
         * Adding elements to the HashSet
         */
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");

        hset.removeAll(hset);

        System.out.println("Elements of hashset are: " + hset);


    }
}