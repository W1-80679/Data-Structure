package com.sunbeam;

import java.util.Scanner;

public class CircularQueue 

{
	
	private int maxSize;
    private int[] queue;
    private int front;
    private int rear;
    private int counter;

    public CircularQueue(int size) 
    {
        maxSize = size;
        queue = new int[maxSize];
        
        front = -1;
        
        rear = -1;
        
        counter = 0;
    
    }

    public void enqueue(int value) {
        if (counter == maxSize) 
        
        {
         
        	System.out.println("Queue Overflow - Cannot enqueue, queue is full.");
        
        } 
        else 
        {
            if (front == -1) 
            {
               
                front = 0;
                rear = 0;
            } else {
               
                rear = (rear + 1) % maxSize;
            }
            
            queue[rear] = value;
            counter++;
            System.out.println("Enqueued: " + value);
        }
    }

    public void dequeue() 
    
    {
       
    	if (counter == 0) 
    	
    	{
            System.out.println("Queue Underflow - Cannot dequeue, queue is empty.");
        }
    	else 
    	
    	{
            int dequeuedValue = queue[front];
            if (front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else 
            
            {
                
                front = (front + 1) % maxSize;
            }
            counter--;
            System.out.println("Dequeued: " + dequeuedValue);
        }
    }

    public void display() 
    
    {
        if (counter == 0)
        	
        {
            System.out.println("Queue is empty.");
        } 
        
        else 
        	
        {
            System.out.print("Queue: ");
            
            int i = front;
            
            int count = 0;
            
            while (count < counter) 
            {
                System.out.print(queue[i] + " ");
                i = (i + 1) % maxSize;
                count++;
            }
            System.out.println();
        }
    }
}


	
	

