package com.hash;

public class Hash<K, V> {
    private Element<K, V>[] table;

    Hash(int size){
        table = new Element[size];
    }

    Hash(){
        this(100000);
    }

    public int getHash(K key) {
        String keyString = key.toString();
        int finalHashIndex = 0;

        int keyLength = keyString.length();
        for (int index = 0; index < keyLength; index++) {
            finalHashIndex += keyString.charAt(index) * (index+1);
        }
        return finalHashIndex;
    }

    private boolean isColision(int index){
        return table[index] != null;
    }

    public boolean put(K key, V value) {
        int index = getHash(key);
        if(isColision(index)) {
            table[index].addNext(key, value);
            return true;
        }
        table[index] = new Element<>(key, value);
        return true;
    }

    public Object getData(K key) throws Exception{
        int index = getHash(key);
        return table[index].getData(key);
    }
}
