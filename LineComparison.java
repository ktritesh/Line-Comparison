package com.bridgelabz.linecomparison;
import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Co-Oridinates for 1st Line");
		System.out.println("Enter X1 Value : ");
		int X1=sc.nextInt();
		System.out.println("Enter Y1 Value : ");
		int Y1=sc.nextInt();
		System.out.println("Enter X2 Value : ");
		int X2=sc.nextInt();
		System.out.println("Enter Y2 Value : ");
		int Y2=sc.nextInt();
		
		double l1= Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		
		System.out.println("Enter Co-Oridinates for 2nd Line");
		System.out.println("Enter a1 Value : ");
		int a1=sc.nextInt();
		System.out.println("Enter b1 Value : ");
		int b1=sc.nextInt();
		System.out.println("Enter a2 Value : ");
		int a2=sc.nextInt();
		System.out.println("Enter b2 Value : ");
		int b2=sc.nextInt();
		
		double l2= Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		
		if (l1 == l2)
			System.out.println("Lines are equal");
		else
			System.out.println("Lines are not equal");
	}

}
