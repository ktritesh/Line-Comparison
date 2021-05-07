package com.bridgelabz.linecomparison;
import java.util.Scanner;

public class LineComparison {
	
	public static void comparelength() {
		
		//creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking value from users using scanner class for first line
		System.out.println("Enter Co-Oridinates for 1st Line");
		System.out.println("Enter X1 Value : ");
		int X1=sc.nextInt();
		System.out.println("Enter Y1 Value : ");
		int Y1=sc.nextInt();
		System.out.println("Enter X2 Value : ");
		int X2=sc.nextInt();
		System.out.println("Enter Y2 Value : ");
		int Y2=sc.nextInt();
		
		//Computation
		double l1= Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		
		//taking value from users using scanner class for second line
		System.out.println("Enter Co-Oridinates for 2nd Line");
		System.out.println("Enter a1 Value : ");
		int a1=sc.nextInt();
		System.out.println("Enter b1 Value : ");
		int b1=sc.nextInt();
		System.out.println("Enter a2 Value : ");
		int a2=sc.nextInt();
		System.out.println("Enter b2 Value : ");
		int b2=sc.nextInt();
		
		//Computation
		double l2= Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		
		if (l1 == l2)
			System.out.println("Both Lines are equal");
		else if (l1 > l2)
			System.out.println("First line is greater than second");
		else
			System.out.println("First line is smaller than second");
	}

	public static void main(String[] args) {
		comparelength();

	}

}
