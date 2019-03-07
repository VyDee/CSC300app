package com.example.admin.csc300basketballplayer;

public class LinkedList
{
    private Node head;
    private Node tail;
    private int count;

    public LinkedList()
    {
        this.head = null;
        this.count = 0;
    }

    public void addFront(int value)
    {
        Node n = new Node(value);
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            n.setNextNode(head);
            head = n;
        }
        count ++;

    }

    public void addEnd(int value)
    {
        Node n = new Node(value);
        if(this.head == null)
        {
            this.head = n;
            this.tail = n;
        }
        else
        {
            this.tail.setNextNode(n);
            this.tail = n;
        }
        count ++;
    }

    public void display()
    {
        String answer = "********* ";
        Node currNode = head;
        for (int i = 0; i < this.count; i++)
        {
            answer = answer +currNode.getPayLoad() + " ->";
            currNode = currNode.getNextNode();
        }

        System.out.println(answer);
    }
}
