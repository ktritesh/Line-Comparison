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
		
		Double line1 = new Double(l1);
		Double line2 = new Double(l2);
		boolean ifEqual = line1.equals(line2);
		if (ifEqual)
			System.out.println("Both Lines are Equal");
		else {
			int compare = line1.compareTo(line2);
			if (compare > 0)
				System.out.println("Line 1 is larger");
			else
				System.out.println("Line 2 is larger");
		}
	}

}
