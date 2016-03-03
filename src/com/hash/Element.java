package com.hash;

public class Element<K, V> {
    private K key;

    private V value;

    private Element<K, V> next;

    Element(K key, V value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public V getData(K key) throws Exception {
        if(this.key.equals(key))
            return this.value;
        if(next == null)
            throw new Exception("Not Found");
        return next.getData(key);
    }

    public void addNext(K key, V value){
        if(hasSameKey(key)){
            this.value = value;
            return;
        }

        if(next == null) {
            next = new Element<>(key, value);
            return;
        }
        next.addNext(key, value);
    }

    public boolean hasSameKey(K key) {
        return key == this.key;
    }
}
