package com.nduonglong02.unit10.entity;

public class QueueLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public QueueLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void enqueue(Node<T> node) {
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
            this.size++;
            return;
        }
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }

    public Node<T> dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Node<T> node = this.head;
        this.head = this.head.next;
        this.size--;
        return node;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void print() {
        System.out.println("Queue: ");
        Node node = this.head;
        while (node != null) {
            node.printData();
            node = node.next;
        }
    }
}
