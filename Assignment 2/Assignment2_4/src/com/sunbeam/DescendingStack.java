
package com.sunbeam;
import java.util.Scanner;

class DescendingStack {
    private int SIZE;
    private int[] stack;
    private int top;

    public DescendingStack(int size) {
        SIZE = size;
        stack = new int[SIZE];
        top = SIZE; 
    }

    public void push(int value) {
        if (top > 0) {
            top--;
            stack[top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow - Cannot push, stack is full.");
        }
    }

    public void pop() {
        if (top < SIZE) {
            System.out.println("Popped: " + stack[top]);
            top++;
        } else {
            System.out.println("Stack Underflow - Cannot pop, stack is empty.");
        }
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = top; i < SIZE; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

