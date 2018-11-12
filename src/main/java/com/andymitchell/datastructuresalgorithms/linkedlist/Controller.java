package com.andymitchell.datastructuresalgorithms.linkedlist;

public class Controller {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        linkedList.pop();

        System.out.println(linkedList.get(2));


        int[] intList = {1,2};


    }
}
