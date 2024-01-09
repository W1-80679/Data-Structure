package com.sunbeam;

import java.util.Scanner;

public class LinearQueue

{
	
	    private int maxSize;
	    private int[] queue;
	    private int front;
	    private int rear;

	    public LinearQueue(int size) 

	    {
	        maxSize = size;
	        queue = new int[maxSize];
	        front = -1;
	        rear = -1;
	    }

	    public void enqueue(int value) 
	    
	    {
	        if (rear == maxSize - 1) 
	        
	        {
	            System.out.println("Queue Overflow - Cannot enqueue, queue is full.");
	        
	        } 
	        else 
	        
	        {
	            if (front == -1) 
	            
	            {
	               
	                front = 0;
	            }
	            
	            queue[++rear] = value;
	            
	            System.out.println("Enqueued: " + value);
	        }
	    }

	    public void dequeue() 
	    
	    {
	        if (front == -1 || front > rear) {
	    
	        	System.out.println("Queue Underflow - Cannot dequeue, queue is empty.");
	        
	        } 
	        
	        else 
	        
	        {
	            int dequeuedValue = queue[front++];
	            System.out.println("Dequeued: " + dequeuedValue);
	            if (front > rear) 
	            
	            {
	               
	                front = -1;
	                rear = -1;
	            }
	        }
	    }

	    public void display() 
	    {
	        if (front == -1) 
	        
	        {
	            System.out.println("Queue is empty.");
	        
	        } 
	        
	        else 
	        
	        {
	            System.out.print("Queue: ");
	            for (int i = front; i <= rear; i++) 
	            
	            {
	                System.out.print(queue[i] + " ");
	        
	            }
	            System.out.println();
	        }
	    }
	}

	
	