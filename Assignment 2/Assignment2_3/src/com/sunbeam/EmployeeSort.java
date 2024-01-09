
package com.sunbeam;

import java.util.Arrays;

import java.util.Comparator;

import java.util.Scanner;

public class EmployeeSort 
	
	{
	    public static void main(String[] args) 
	    
	    {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the number of employees: ");
	       
	        int numEmployees = scanner.nextInt();

	        Employee[] employees = new Employee[numEmployees];

	      
	        for (int i = 0; i < numEmployees; i++) 
	        
	        {
	            System.out.println("Enter details for Employee " + (i + 1) + ":");
	            
	            System.out.print("Name: ");
	            
	            String name = scanner.next();
	            
	            System.out.print("Salary: ");
	            
	            double salary = scanner.nextDouble();

	            employees[i] = new Employee(name, salary);
	        
	        }

	        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed());

	        System.out.println("\nSorted employees by salary (descending order):");
	        
	        for (Employee employee : employees) 
	        {
	            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
	        }

	     
	        scanner.close();
	    }
	}


