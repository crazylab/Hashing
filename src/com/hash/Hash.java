package com.hash;

public class Hash<K, V> {
    @SuppressWarnings("unchecked")
    private V[] table = (V[]) new Object[100000];

    private int getHash(K key) {
        String keyString = key.toString();
        int finalHashIndex = 0;

        int keyLenght = keyString.length();

        for (int index = 0; index < keyLenght; index++) {
            int currentChar = keyString.charAt(index);
            finalHashIndex ^= (currentChar >> index);
        }

        return finalHashIndex;
    }

    public boolean put(K key, V value) {
        int index = getHash(key);
        System.out.println(index);
        table[index] = value;
        return true;
    }

    public V getData(K key) {
        int index = getHash(key);
        return table[index];
    }
}
