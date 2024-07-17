package com.Encapsulation.Grade;
import java.util.Scanner;

public class GradeCalculator {
	
	public void calGrade(int a) {
		
		
		if (a>=90 &&a<=100)
			System.out.println("Your Grade is A");
		else if(a>=80 && a<=89)
			System.out.println("Your Grade is B");
		else if(a>=70 && a<=79)
			System.out.println("Your Grade is C");
		else if(a>=60 && a <=69)
			System.out.println("Your Grade is D");
		else
			System.out.println("Your Grade is F");
			
			}
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter your Score : ");
		Scanner sc= new Scanner(System.in); 
		int a = sc.nextInt();
		
		GradeCalculator gc = new GradeCalculator();
		gc.calGrade(a);
		
		
		
		
	}

}
