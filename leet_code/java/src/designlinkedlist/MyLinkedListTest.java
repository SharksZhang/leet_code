package designlinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList list = new MyLinkedList();

    @Test
    void get() {
        list.addAtHead(1);
        assertEquals(1, list.get(0));
    }

    @Test
    void addAtHead() {
    }

    @Test
    void addAtTail() {
    }

    @Test
    void addAtIndex() {
    }

    @Test
    void deleteAtIndex() {
    }
}