package org.bridgelabz.assignmentfourteen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Queue;

public class MyQueueTest {
    public static final Logger LOG = LogManager.getLogger(MyLinkedListTest.class);
    @Test
    void given3NumbersWhenAddedShouldHaveFirstAddedNode() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56 );
        MyNode<Integer> mySecondNode = new MyNode<>(30 );
        MyNode<Integer> myThirdNode = new MyNode<>(70 );
        myQueue.add(myFirstNode);
        myQueue.append(mySecondNode);
        myQueue.append(myThirdNode);
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode, myQueue.peak());
        LOG.debug( "Debugging");
        LOG.info("Info");
        LOG.warn("Warning");
        LOG.error("Error");
        LOG.fatal("Fatal");

    }
}