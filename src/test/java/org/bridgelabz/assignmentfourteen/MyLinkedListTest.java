package org.bridgelabz.assignmentfourteen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static final Logger LOG = LogManager.getLogger(MyLinkedListTest.class);
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop(){
        MyNode<Integer> myFirstNode = new MyNode<>(70 );
        MyNode<Integer> mySecondNode = new MyNode<>(30 );
        MyNode<Integer> myThirdNode = new MyNode<>(56 );
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);

        boolean result = myLinkedList.head.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);

        LOG.debug("Debugging");
        LOG.info("Info");
        LOG.warn("Warning");
        LOG.error("Error");
        LOG.fatal("Fatal");
        myLinkedList.printMyNodes();



    }
}
