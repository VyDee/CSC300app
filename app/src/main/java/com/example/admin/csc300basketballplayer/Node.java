package com.example.admin.csc300basketballplayer;

public class Node
{
    private int payLoad;
    private Node nextNode;

    public Node (int payload)
    {
        this.payLoad = payload;
        this.nextNode = null;
    }

    public void setNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }

    public int getPayLoad()
    {
        return payLoad;
    }
    public Node getNextNode()
    {
        return nextNode;
    }
}
