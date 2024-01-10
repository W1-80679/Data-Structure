package com.sunbeam;

public class SinglyLinearLinkedlist

{
    public class Node 
    
    {
        private int data;
        private Node next;

        public Node(int value) 
        
        {
            data = value;
            next = null;
        }
    }

    private Node head;
    
    private Node tail;

    public SinglyLinearLinkedlist() 
    {
        head = null;
        tail = null;
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
            head = newNode;
            tail = newNode;
        } else 
        
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
            head = newNode;
            tail = newNode;
        
        } 
        
        else 
        
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delFirst() 
    
    {
        if (!isEmpty()) 
        
        {
            if (head == tail) 
            
            {
                head = null;
                tail = null;
            }
            else 
            
            {
                head = head.next;
            }
        }
    }

    public void delLast() 
    {
        if (!isEmpty()) 
        
        {
            if (head == tail) 
            
            {
                head = null;
                tail = null;
            
            } 
            else 
            
            {
                Node current = head;
                while (current.next != tail) 
                
                {
                    current = current.next;
                
                }
                current.next = null;
                tail = current;
            }
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
    	SinglyLinearLinkedlist linkedList = new SinglyLinearLinkedlist();

        linkedList.addFirst(40);
        linkedList.addFirst(30);
        linkedList.addFirst(20);
        linkedList.addFirst(10);

        linkedList.addLast(50);
        linkedList.addLast(60);

        linkedList.display();

        linkedList.delFirst();
        linkedList.delLast();

        linkedList.display();
    }
}
