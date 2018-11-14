package com.andymitchell.datastructuresalgorithms.hashmap;

import com.andymitchell.datastructuresalgorithms.linkedlist.LinkedList;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.NoSuchElementException;

public class HashMap<K,V> {

    private static final int listSize = 10;

    private LinkedList<HashObject<K,V>>[] table = new LinkedList[listSize];

    void add (K key, V value) throws KeyAlreadyExistsException {

        HashObject hashObject = new HashObject(key, value);

        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
            table[index].add(hashObject);
            return;
        }

        for (int i = 0; i < table[index].size(); i++) {
            if (table[index].get(i).getKey().equals(key)) {
                throw new KeyAlreadyExistsException();
            }
        }

        table[index].add(hashObject);
    }

    V get (K key) throws NoSuchElementException{
        int index = hash(key);
        for (int i = 0; i < table[index].size(); i++) {
            if (table[index].get(i).getKey().equals(key)) {
                return table[index].get(i).getValue();
            }
        }
        throw new NoSuchElementException();
    }

    private int hash (K key) {
        Object object = key;

        return object.hashCode() % listSize;
    }
}
