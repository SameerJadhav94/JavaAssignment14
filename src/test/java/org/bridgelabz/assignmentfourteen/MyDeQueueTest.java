package org.bridgelabz.assignmentfourteen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyDeQueueTest {
    public static final Logger LOG = LogManager.getLogger(MyLinkedListTest.class);
    @Test
    void givenFirstElementWhenDeletedShouldPassDeQueueTest() {
        MyDequeue myDequeue = new MyDequeue();
        MyNode<Integer> myFirstNode = new MyNode<>(56 );
        MyNode<Integer> mySecondNode = new MyNode<>(30 );
        MyNode<Integer> myThirdNode = new MyNode<>(70 );
        myDequeue.add(myFirstNode);
        myDequeue.append(mySecondNode);
        myDequeue.append(myThirdNode);
        INode pop = myDequeue.pop();
        myDequeue.printDeQueue();
        Assert.assertEquals(myFirstNode, pop);

        LOG.debug( "Debugging");
        LOG.info("Info");
        LOG.warn("Warning");
        LOG.error("Error");
        LOG.fatal("Fatal");

    }
}
