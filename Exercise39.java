/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution, Exercise 39
 *  Copyright 2021 Mayank Goyal
 */

import java.util.TreeMap;
import java.util.Scanner;
import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
		
        Employee emp = new Employee("John","Johnson","Manager", "2016-12-31");
        emp.employees.put(1,emp);
        
        emp = new Employee("Tou","Xiong","Software Engineer", "2016-10-05");
        emp.employees.put(2,emp);
        
        emp = new Employee("Michaela","Michaelson","District Manager", "2015-12-19");
        emp.employees.put(3,emp);
        
        emp = new Employee("Jake","Jacobson","Programmer", "");
        emp.employees.put(5,emp);
        
        emp = new Employee("Jacquelyn","Jackson","DBA", "");
        emp.employees.put(4,emp);
        
        emp = new Employee("Sally","Webber","Web Developer", "2015-12-18");
        emp.employees.put(6,emp);
        
        emp.SortEmployees();
	}
}
