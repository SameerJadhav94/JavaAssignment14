package org.bridgelabz.assignmentfourteen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode(){
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70 );
        MyNode<Integer> mySecondNode = new MyNode<>(30 );
        MyNode<Integer> myThirdNode = new MyNode<>(56 );
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode myNode = myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, myNode);

    }
    public static final Logger LOG = LogManager.getLogger(MyLinkedListTest.class);
    @Test
    public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70 );
        MyNode<Integer> mySecondNode = new MyNode<>(30 );
        MyNode<Integer> myThirdNode = new MyNode<>(56 );
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, pop);
        LOG.debug(pop + "Debugging");
        LOG.info(pop + "Info");
        LOG.warn(pop + "Warning");
        LOG.error(pop + "Error");
        LOG.fatal(pop + "Fatal");
    }
}
