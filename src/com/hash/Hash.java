package com.hash;

/**
 * Created by rahulna on 01/03/16.
 */
public class Hash<V, K> {
    private V[] table;

    Hash() {
        table = (V[]) new Object[100];
    }

    private int getIndex(K key) {
        String keyString = key.toString();
        int hashIndex = 0;
        for (int index = 0; index < keyString.length(); index++)
            hashIndex ^= keyString.charAt(index);
        return hashIndex/keyString.length();
    }

    public boolean put(V value, K key) {
        int index = getIndex(key);
        System.out.println(index);
        table[index] = value;
        return true;
    }

    public V getData(K key) {
        int index = getIndex(key);
        return table[index];
    }
}
