package com.sunbeam;

import java.util.Scanner;

public class MaxStack 

{
	
	    private static final int MAX_SIZE = 5;
	    private int[] stack;
	    private int top;
	    private int maxElement;

	    public MaxStack() {
	        stack = new int[MAX_SIZE];
	        top = -1;
	        maxElement = Integer.MIN_VALUE;
	    }

	    public void push(int value) {
	        if (top < MAX_SIZE - 1) {
	            stack[++top] = value;
	            maxElement = Math.max(maxElement, value);
	            System.out.println("Pushed: " + value);
	        } else {
	            System.out.println("Stack Overflow - Cannot push, stack is full.");
	        }
	    }

	    public void pop() {
	        if (top >= 0) {
	            int poppedValue = stack[top--];
	            if (poppedValue == maxElement) {
	                
	                maxElement = findMaxInStack();
	            }
	            System.out.println("Popped: " + poppedValue);
	        } else {
	            System.out.println("Stack Underflow - Cannot pop, stack is empty.");
	        }
	    }

	    public int getMaxElement() {
	        return maxElement;
	    }

	    
	    private int findMaxInStack() {
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i <= top; i++) {
	            max = Math.max(max, stack[i]);
	        }
	        return max;
	    }
	}
