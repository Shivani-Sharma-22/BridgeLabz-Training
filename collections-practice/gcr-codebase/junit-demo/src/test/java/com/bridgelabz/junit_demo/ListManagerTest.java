package com.bridgelabz.junit_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        manager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, manager.getSize(list));
    }
}
