package com.andymitchell.datastructuresalgorithms.hashmap;

public class HashObject <K,V> {
    private K key;
    private V value;

    public HashObject(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
