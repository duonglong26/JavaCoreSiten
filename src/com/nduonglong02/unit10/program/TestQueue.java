package com.nduonglong02.unit10.program;

import com.nduonglong02.unit10.entity.Node;
import com.nduonglong02.unit10.entity.QueueLinkedList;

public class TestQueue {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(new Node(100));
        queue.enqueue(new Node(200));
        queue.enqueue(new Node(300));
        queue.print();
        queue.enqueue(new Node(400));

        Node node = queue.dequeue();
        queue.dequeue();

        if (node != null) {
            System.out.println("Dequeue");
            node.printData();
        }

        queue.enqueue(new Node(400));
        queue.print();
    }
}
