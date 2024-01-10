package com.sunbeam;

public class LinkedList 

{

	    private static class Node 
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

	    public LinkedList() 
	    {
	        head = null;
	    }

	    public void insertSorted(int value) 
	    {
	        Node newNode = new Node(value);

	        if (head == null || value <= head.data) 
	        {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node current = head;

	        while (current.next != null && current.next.data < value) 
	        {
	            current = current.next;
	        }

	        newNode.next = current.next;
	        current.next = newNode;
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
	        LinkedList sortedList = new LinkedList();

	        sortedList.insertSorted(30);
	        sortedList.insertSorted(10);
	        sortedList.insertSorted(40);
	        sortedList.insertSorted(20);

	        sortedList.display();
	    }
	}

