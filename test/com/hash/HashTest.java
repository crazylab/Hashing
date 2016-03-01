package com.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by rahulna on 01/03/16.
 */
public class HashTest {

    @Test
    public void testPut_returns_true_when_the_given_data_is_in_int_and_key_is_in_string_get_stored_successfully() throws Exception {
        Hash<Integer, String> hash = new Hash<Integer, String>();
        String key = "xyz";
        int data = 234;
        assertTrue(hash.put(data, key));
    }

    @Test
    public void testPut_returns_true_when_data_is_given_with_int_as_key_get_stored_successfully() throws Exception {
        Hash<String, Integer> hash = new Hash<String, Integer>();
        String data = "broom..";
        int key = 926;
        assertTrue(hash.put(data, key));
    }

    @Test
    public void testGetData_returns_the_data_associated_with_given_key_when_the_key_is_string_and_data_is_int() throws Exception {
        Hash<Integer, String> hash = new Hash<Integer, String>();
        Integer data = new Integer(439);
        String key = "Allah K Nam Pe De De Baba..";
        hash.put(data, key);
        assertEquals(data, hash.getData(key));
    }

    @Test
    public void testGetData_returns_the_data_associated_with_given_key_when_the_key_is_integer_and_data_is_string() throws Exception {
        Hash<String, Integer> hash = new Hash<String, Integer>();
        Integer key = new Integer(420);
        String data = "Uthalere baba..";
        hash.put(data, key);
        assertEquals(data, hash.getData(key));
    }
}