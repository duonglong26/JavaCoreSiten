package com.nduonglong02.unit10.entity;

public class Node<T> {
    T value;
    public Node<T> next;

    public Node(T v) {
        this.value = v;
    }

    public Node(T v, Node<T> n) {
        this.value = v;
        this.next = n;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void printData() {
        System.out.println("Data = " + this.value + "\n");
    }
}
