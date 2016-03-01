package com.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HashTest {

    @Test
    public void testPut_returns_true_when_the_given_data_is_in_int_and_key_is_in_string_get_stored_successfully() throws Exception {
        Hash<String, Integer> hash = new Hash<>();
        String key = "xyz";
        int data = 234;
        assertTrue(hash.put(key, data));
    }

    @Test
    public void testPut_returns_true_when_data_is_given_with_int_as_key_get_stored_successfully() throws Exception {
        Hash<Integer, String> hash = new Hash<>();
        String data = "broom..";
        int key = 926;
        assertTrue(hash.put(key, data));
    }

    @Test
    public void testGetData_returns_the_data_associated_with_given_key_when_the_key_is_string_and_data_is_int() throws Exception {
        Hash<String, Integer> hash = new Hash<>();
        Integer data = 439;
        String key = "Allah K Nam Pe De De Baba..";
        hash.put(key, data);
        assertEquals(data, hash.getData(key));
    }

    @Test
    public void testGetData_returns_the_data_associated_with_given_key_when_the_key_is_integer_and_data_is_string() throws Exception {
        Hash<Integer, String> hash = new Hash<>();
        Integer key = 420;
        String data = "Uthalere baba..";
        hash.put(key, data);
        assertEquals(data, hash.getData(key));
    }

    @Test
    public void testGetData_gives_the_data_associated_with_given_key_when_there_is_multiple_data_inside_the_table_having_key_consisting_of_same_character_set() throws Exception {
        Hash<String, String> hash = new Hash<>();

        String key = "abc";
        String data = "english";
        hash.put(key, data);

        key = "bca";
        data = "boom";
        hash.put(key, data);

        key = "cba";
        data = "c for cat";
        hash.put(key, data);

        key = "d";
        data = "dhoom";
        hash.put(key, data);

        key = "C";
        data = "This is Capital C";
        hash.put(key, data);

        assertEquals("c for cat", hash.getData("cba"));
        assertEquals("boom", hash.getData("bca"));
        assertEquals("english", hash.getData("abc"));
    }
}