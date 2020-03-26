package com.org.linked.list;


public class SinglyLinkedList<T> {

    Node<T> head;

    public void add(T element) {
        Node<T> node = new Node<T>();
        node.setValue(element);

        Node<T> temp = head;
        while (true) {
            if (temp == null) {
                head = node;
                break;
            } else if (temp.getReference() == null) {
                temp.setReference(node);
                break;
            } else {
                temp = temp.getReference();
            }
        }
    }

    public void traverse() {
        Node<T> tmp = head;
        while (true) {
            System.out.println("===============temp====" + tmp.getValue());
            if (tmp.getReference() == null) {
                break;
            }
            tmp = tmp.getReference();
        }

    }

    public void reverse() {
        Node<T> current = head;
        Node<T> prev = null;
        Node<T> next = null;

        while (current != null) {
            next = current.getReference();
            current.setReference(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
}

