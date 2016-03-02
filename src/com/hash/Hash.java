package com.hash;

public class Hash<K, V> {
    private Element[] table = new Element[100000];

    public int getHash(K key) {
        String keyString = key.toString();
        int finalHashIndex = 0;

        int keyLenght = keyString.length();
        for (int index = 0; index < keyLenght; index++) {
            finalHashIndex += keyString.charAt(index) * (index+1);
        }

        return finalHashIndex;
    }

    private boolean isColision(int index){
        if(table[index] == null)
            return false;
        return true;
    }

    public boolean put(K key, V value) {
        int index = getHash(key);
        if(isColision(index)) {
            table[index].addNext(key, value);
            return true;
        }
        table[index] = new Element<K, V>(key, value);
        return true;
    }

    public Object getData(K key) throws Exception{
        int index = getHash(key);
        return table[index].getData(key);
    }
}
