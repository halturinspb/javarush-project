package com.javarush.task.pro.task13.task1314;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        Node currentNode = first;
        String element = null;
        int count = 0;
        while (currentNode != null && currentNode.next != null) {
            currentNode = currentNode.next;
            if (count == index) {
                element = currentNode.value;
                break;
            }
            count++;
        }
        return element;
    }


    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
