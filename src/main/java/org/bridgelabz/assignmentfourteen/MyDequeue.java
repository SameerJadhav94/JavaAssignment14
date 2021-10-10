package org.bridgelabz.assignmentfourteen;

public class MyDequeue {
    MyLinkedList myLinkedList;

    public MyDequeue() {
        this.myLinkedList = new MyLinkedList();
    }
    public void add(MyNode myNode) {
        myLinkedList.add(myNode);

    }

    public void append(MyNode myNode) {
        myLinkedList.append(myNode);
    }

    public void printDeQueue() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
}

    public INode pop() {
        return myLinkedList.pop();

    }

    }
