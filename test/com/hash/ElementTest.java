package com.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElementTest {

    @Test
    public void testGetData_gives_the_string_data_inside_the_element() throws Exception {
        Element<String, String> element = new Element<>("key","Hello");
        assertEquals("Hello", element.getData("key"));
    }

    @Test
    public void testGetData_throws_exception_when_data_with_the_associated_key_is_not_found () {
        Element<String, String> element = new Element<>("keygen","Hi! I'm keygen");
        try {
            element.getData("key");
        } catch(Exception e) {
            assertEquals(e.getMessage(), "Not Found");
        }
    }
    @Test
    public void testGetData_gives_the_int_data_inside_the_element() throws Exception {
        Element<Integer, Integer> element = new Element<>(92,324);
        assertEquals(new Integer(324), element.getData(92));
    }

    @Test
    public void testAddNext_adds_an_element_next_to_the_current_element() throws Exception {
        Element<String, String> element = new Element<>("key","I'm having key");
        element.addNext("key1","I'm Having key1");
        element.addNext("key2","I'm Having key2");
        element.addNext("key3","I'm Having key3");
        element.addNext("key4","I'm Having key4");
        element.addNext("key5","I'm Having key5");

        assertEquals("I'm Having key4", element.getData("key4"));
        assertEquals("I'm Having key5", element.getData("key5"));
        assertEquals("I'm Having key1", element.getData("key1"));
    }
}