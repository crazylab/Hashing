package com.hash;

/**
 * Created by rahulna on 01/03/16.
 */
public class Hash<V, K> {
    private V[] table;

    Hash() {
        table = (V[]) new Object[10];
    }

    private int getIndex(K key) {
        String keyString = key.toString();
        return 0;
    }

    public boolean put(V value, K key) {
        int index = getIndex(key);
        table[index] = value;
        return true;
    }

    public V getData(K key) {
        int index = getIndex(key);
        return table[index];
    }
}
