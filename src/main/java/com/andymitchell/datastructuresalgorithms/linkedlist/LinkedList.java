package com.andymitchell.datastructuresalgorithms.linkedlist;

public class LinkedList <T> {

    private ListObject<T> first;

    private ListObject<T> last;

    private int size = 0;

    public void add( T value) {

        if (first == null) {
            first = new ListObject();

            first.setValue(value);
            last = first;

            size++;
            return;
        }
        last.setNext(new ListObject());
        last = last.getNext();

        last.setValue(value);
        size++;
    }

    public void remove (int index) {

        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0) {
            first = first.getNext();
        }

        int currentIndex = 0;

        ListObject<T> currentObject = first;

        while(currentIndex != index - 1) {
            currentObject = currentObject.getNext();
            currentIndex++;
        }
        currentObject.setNext(currentObject.getNext().getNext());
        size--;
    }

    public void pop () {
        int currentIndex = 0;

        ListObject<T> currentObject = first;

        while(currentIndex != size - 2) {
            currentObject = currentObject.getNext();
            currentIndex++;
        }

        currentObject.setNext(null);
        last = currentObject;
        size--;
    }

    public T get (int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0) {
            return first.getValue();
        } else if (index == size -1) {
            return last.getValue();
        }

        int currentIndex = 0;

        ListObject<T> currentObject = first;

        while(currentIndex != index) {
            currentObject = currentObject.getNext();
            currentIndex++;
        }
        return currentObject.getValue();
    }
}
