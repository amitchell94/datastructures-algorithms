package com.andymitchell.datastructuresalgorithms.linkedlist;

public class ListObject <T>{
    T value;

    ListObject next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListObject getNext() {
        return next;
    }

    public void setNext(ListObject next) {
        this.next = next;
    }
}
