package com.sunbeam;

import java.util.Scanner;

import java.util.Stack;

public class MultiDigitNumbers 

{
	

	    // Postfix Evaluation
	    public static int postfixEvaluate(String expression) 
	    
	    {
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < expression.length(); i++) 
	        
	        {
	            char ch = expression.charAt(i);

	            if (Character.isDigit(ch)) 
	            
	            {
	                int num = 0;
	                while (Character.isDigit(expression.charAt(i))) 
	                {
	                    num = num * 10 + Character.getNumericValue(expression.charAt(i));
	                    i++;
	                }
	                stack.push(num);
	                i--;  // Adjust the index after the loop
	            }
	            else if (ch != ' ') 
	            
	            {
	                int operand2 = stack.pop();
	                int operand1 = stack.pop();
	                int result;

	                switch (ch) 
	                
	                {
	                    case '+':
	                        result = operand1 + operand2;
	                        break;
	                    case '-':
	                        result = operand1 - operand2;
	                        break;
	                    case '*':
	                        result = operand1 * operand2;
	                        break;
	                    case '/':
	                        result = operand1 / operand2;
	                        break;
	                    default:
	                        throw new IllegalArgumentException("Invalid operator: " + ch);
	                }

	                stack.push(result);
	            }
	        }

	        return stack.pop();
	    }

	    // Prefix Evaluation
	    public static int prefixEvaluate(String expression) 
	    
	    {
	        Stack<Integer> stack = new Stack<>();

	        for (int i = expression.length() - 1; i >= 0; i--) 
	        
	        {
	            char ch = expression.charAt(i);

	            if (Character.isDigit(ch)) 
	            
	            {
	                int num = 0;
	                while (Character.isDigit(expression.charAt(i))) 
	                
	                {
	                    num = num * 10 + Character.getNumericValue(expression.charAt(i));
	                    i--;
	                }
	                
	                stack.push(num);
	                i++;  
	            }
	            else if (ch != ' ') 
	            {
	                int operand1 = stack.pop();
	                int operand2 = stack.pop();
	                int result;

	                switch (ch) {
	                    case '+':
	                        result = operand1 + operand2;
	                        break;
	                    case '-':
	                        result = operand1 - operand2;
	                        break;
	                    case '*':
	                        result = operand1 * operand2;
	                        break;
	                    case '/':
	                        result = operand1 / operand2;
	                        break;
	                    default:
	                        throw new IllegalArgumentException("Invalid operator: " + ch);
	                }

	                stack.push(result);
	            }
	        }

	        return stack.pop();
	    }

	    public static void main(String[] args) 
	    
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Input for postfix evaluation
	    
	        System.out.print("Enter postfix expression: ");
	        
	        String postfixExpression = scanner.nextLine();
	        
	        int postfixResult = postfixEvaluate(postfixExpression);
	        
	        System.out.println("Postfix Evaluation Result: " + postfixResult);

	        // Input for prefix evaluation
	        
	        System.out.print("Enter prefix expression: ");
	        
	        String prefixExpression = scanner.nextLine();
	        
	        int prefixResult = prefixEvaluate(prefixExpression);
	        
	        System.out.println("Prefix Evaluation Result: " + prefixResult);

	        scanner.close();
	    }
	}


