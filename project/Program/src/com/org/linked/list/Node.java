package com.org.linked.list;


public class Node<T> {
    private Node<T> reference;
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setReference(Node<T> reference) {
        this.reference = reference;
    }

    public Node<T> getReference() {
        return reference;
    }
}
