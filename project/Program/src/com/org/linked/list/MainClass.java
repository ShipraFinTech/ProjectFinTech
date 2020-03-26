package com.org.linked.list;

public class MainClass {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(3);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(7);
        singlyLinkedList.traverse();
        singlyLinkedList.reverse();
        singlyLinkedList.traverse();


    }
}
