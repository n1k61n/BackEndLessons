package org.example;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StringIteratorTest {

    @Test
    void whenStringNotEmpty_thenHasNextTrue(){
        var iterator = new StringIterator("a");
        assertTrue(iterator.hasNext());
    }

    @Test
    void whenStringEmpty_thenHasNextFalse(){
        var iterator = new StringIterator("");
        assertFalse(iterator.hasNext());
    }

    @Test
    void  whenStringNotEmpty_thenIterateTillEnd(){
        var iterator = new StringIterator("abc");

        assertTrue(iterator.hasNext());
        assertEquals('a', iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals('b', iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals('c', iterator.next());

        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, iterator::next);
    }

}