package org.bridgelabz.assignmentfourteen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class MyLinkedListTest {

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);

        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    public static final Logger LOG = LogManager.getLogger(MyLinkedListTest.class);
        @Test
        public void given3NumbersWhenAppendedShouldBeAddedToLast(){
            MyNode<Integer> myFirstNode = new MyNode<>(56 );
            MyNode<Integer> mySecondNode = new MyNode<>(30 );
            MyNode<Integer> myThirdNode = new MyNode<>(70 );
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.append(mySecondNode);
            myLinkedList.append(myThirdNode);
            boolean result = myLinkedList.head.equals(myFirstNode) &&
                             myLinkedList.head.getNext().equals(mySecondNode) &&
                             myLinkedList.tail.equals(myThirdNode);

            LOG.debug("Debugging");
            LOG.info("Info");
            LOG.warn("Warning");
            LOG.error("Error");
            LOG.fatal("Fatal");
            myLinkedList.printMyNodes();
        }





    }

