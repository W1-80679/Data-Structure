package com.sunbeam;

public class SinglyLinkedList 

{
    private class Node 
    
    {
        int data;
       
        Node next;

        Node(int value) 
        {
            data = value;
            
            next = null;
        }
    }

    private Node head;
    
    private Node tail;

    public SinglyLinkedList() 
    {
        
    	head = tail = null;
    
    }

    public boolean isEmpty() 
    {
      
    	return head == null;
    
    }

    public void addFirst(int value) 
    {
    
    	Node newNode = new Node(value);
        
    	if (isEmpty()) 
    	{
            head = tail = newNode;
        } 
    	else 
    	
    	{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int value) 
    {
    
    	Node newNode = new Node(value);
        
    	if (isEmpty()) 
    	
    	{
            head = tail = newNode;
        }
    	else 
    	
    	{
            tail.next = newNode;
        
            tail = newNode;
        }
    }

    public void insertAfterNode(int existingValue, int newValue) 
    {
        Node newNode = new Node(newValue);
    
        Node current = head;

        while (current != null && current.data != existingValue) 
        {
            current = current.next;
        }

        if (current != null) 
        {
            newNode.next = current.next;
            current.next = newNode;

            if (current == tail) 
            {
                tail = newNode;
            }
        } 
        else 
        
        {
            System.out.println("Node with value " + existingValue + " not found.");
        }
    }

    public void insertBeforeNode(int existingValue, int newValue) 
    
    {
        Node newNode = new Node(newValue);

        if (!isEmpty()) 
        {
            if (head.data == existingValue) 
            {
                newNode.next = head;
                head = newNode;
            }
            else 
            
            {
                Node current = head;

                while (current != null && current.next != null && current.next.data != existingValue) {
                    current = current.next;
                }

                if (current.next != null) 
                
                {
                    newNode.next = current.next;
                
                    current.next = newNode;
                } 
                else 
                {
                    System.out.println("Node with value " + existingValue + " not found.");
                }
            }
        } 
        else 
        
        {
            System.out.println("List is empty.");
        }
    }

    public void display() 
    {
        Node current = head;
        System.out.print("List: ");
        while (current != null) 
        
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    
    {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.addFirst(40);
        linkedList.addFirst(30);
        linkedList.addFirst(20);
        linkedList.addFirst(10);

        linkedList.addLast(50);
        linkedList.addLast(60);

        linkedList.display();

        linkedList.insertAfterNode(30, 35);
        linkedList.insertBeforeNode(40, 45);

        linkedList.display();
    }
}
