package com.andymitchell.datastructuresalgorithms.hashmap;

public class HashMapController {
    public static void main(String[] args) {
        HashMap<String,Integer> hashTable = new HashMap<>();

        hashTable.add("One",1);
        hashTable.add("Two",2);
        hashTable.add("Three",3);
        hashTable.add("Four",4);

        System.out.println(hashTable.get("One"));
        System.out.println(hashTable.get("Two"));
        System.out.println(hashTable.get("Three"));
        System.out.println(hashTable.get("Four"));
    }
}
