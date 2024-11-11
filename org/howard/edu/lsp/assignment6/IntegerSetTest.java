/**
*  Name: Morayo Adeyemi
*/
package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerSetTest {
    private IntegerSet main_set;
    private IntegerSet second_set;

    @BeforeEach
    public void setup() {
        main_set = new IntegerSet();
        second_set = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for Clear Method")
    public void testClear() {
        main_set.add(1);
        main_set.clear();
        assertEquals(0, main_set.length());
    }

    @Test
    @DisplayName("Test case for Length Method")
    public void testLength() {
        assertEquals(0, main_set.length());
        main_set.add(1);
        assertEquals(1, main_set.length());
    }

    @Test
    @DisplayName("Test case for Equals Method")
    public void testEquals() {
        main_set.add(1);
        second_set.add(1);
        assertEquals(true, main_set.equals(second_set));
    }

    @Test
    @DisplayName("Test case for Contains Method")
    public void testContains() {
        main_set.add(1);
        assertEquals(true, main_set.contains(1));
        assertEquals(false, main_set.contains(2));
    }

    @Test
    @DisplayName("Test case for Largest Method")
    public void testLargest() {
        main_set.add(1);
        main_set.add(2);
        assertEquals(2, main_set.largest());
        assertNotNull(main_set.largest());
    }

    @Test
    @DisplayName("Test case for Smallest Method")
    public void testSmallest() {
        main_set.add(1);
        main_set.add(200);
        assertEquals(1, main_set.smallest());
        assertNotNull(main_set.smallest());
    }

    @Test
    @DisplayName("Test Largest Method with IllegalStateException")
    public void testLargestWithException() {
        Throwable exception = assertThrows(IllegalStateException.class, () -> main_set.largest(),
                "Set is empty.");
        assertEquals("Set is empty.", exception.getMessage());
        assertNotNull(exception.getMessage());
    }

    @Test
    @DisplayName("Test Smallest Method with IllegalStateException")
    public void testSmallestWithException() {
        Throwable exception = assertThrows(IllegalStateException.class, () -> main_set.smallest(),
                "Set is empty.");
        assertEquals("Set is empty.", exception.getMessage());
        assertNotNull(exception.getMessage());
    }

    @Test
    @DisplayName("Test case for Add Method")
    public void testAdd() {
        main_set.add(1);
        main_set.add(1);
        assertEquals(1, main_set.length());
        main_set.add(1);
        main_set.add(2);
        assertEquals(2, main_set.length());
    }

    @Test
    @DisplayName("Test case for Remove Method")
    public void testRemove() {
        main_set.add(1);
        main_set.remove(1);
        assertEquals(false, main_set.contains(1));
        assertEquals(0, main_set.length());
    }

    @Test
    @DisplayName("Test case for Union Method")
    public void testUnion() {
        main_set.add(1);
        second_set.add(2);
        main_set.union(second_set);
        assertEquals(true, main_set.contains(1) && main_set.contains(2));
        assertNotNull(main_set);
    }

    @Test
    @DisplayName("Test case for Intersect Method")
    public void testIntersect() {
        main_set.add(1);
        second_set.add(1);
        main_set.intersect(second_set);
        assertEquals(true, main_set.contains(1));
        assertNotNull(main_set);

        main_set.add(2);
        main_set.add(3);
        second_set.add(4);
        second_set.add(2);
        main_set.intersect(second_set);
        assertTrue(main_set.contains(2));
        assertEquals(false, main_set.contains(3));
        assertEquals(false, main_set.contains(4));
    }

    @Test
    @DisplayName("Test case for Difference Method")
    public void testDiff() {
        main_set.add(1);
        second_set.add(2);
        main_set.diff(second_set);
        assertEquals(true, main_set.contains(1) && !main_set.contains(2));
        assertNotNull(main_set);
    }

    @Test
    @DisplayName("Test case for isEmpty Method")
    public void testIsEmpty() {
        assertEquals(true, main_set.isEmpty());
        main_set.add(1);
        assertEquals(false, main_set.isEmpty());
    }

    @Test
    @DisplayName("Test case for Complement Method")
    public void testComplementOnlyAddsUniqueElements() {
        main_set.add(1);
        main_set.add(2);

        second_set.add(2);
        second_set.add(3);
        second_set.add(4);

        main_set.complement(second_set);

        assertTrue(main_set.contains(3));
        assertTrue(main_set.contains(4));
        
        assertFalse(main_set.contains(1));
        assertFalse(main_set.contains(2));
        assertEquals(2, main_set.length());
    }

    @Test
    @DisplayName("Test case for toString Method")
    public void testToString() {
        main_set.add(1);
        assertEquals("[1]", main_set.toString());
        assertNotNull(main_set.toString());
    }
}
