package javaDemo;

import org.apache.poi.util.SystemOutLogger;

public class Array_HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks = {60,65,70,78,80,86,90,92,95};
		
		System.out.println(marks[3]);
		
		System.out.println("_____________________________");
		
		System.out.println(marks.length);
		
		System.out.println("_____________________________");
		
		for(int i=0; i<9; i++) {
			
			System.out.println(marks[i]);
			
		}
		
		System.out.println("_____________________________");
		
		String[] employee = {"David", "Smith", "Erika", "Priscila", "Regina", "Tammy", "Paul", "Garcia"};
		
		System.out.println(employee[3]);
		
		System.out.println("_____________________________");
	
		System.out.println(employee.length);
		
		System.out.println("_____________________________");
		
		for(int i=0; i<employee.length; i++) {
			
			System.out.println(employee[i]);
		}
	
		
	}

}
