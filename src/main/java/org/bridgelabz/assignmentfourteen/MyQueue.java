package org.bridgelabz.assignmentfourteen;

public class MyQueue {
    MyLinkedList myLinkedList;
    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void add(MyNode myNode) {
        myLinkedList.add(myNode);

    }

    public void append(MyNode myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }
}
