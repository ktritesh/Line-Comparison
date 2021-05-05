package com.bridgelabz.linecomparison;
import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X1 Value : ");
		int X1=sc.nextInt();
		System.out.println("Enter Y1 Value : ");
		int Y1=sc.nextInt();
		System.out.println("Enter X2 Value : ");
		int X2=sc.nextInt();
		System.out.println("Enter Y2 Value : ");
		int Y2=sc.nextInt();
		
		double length=Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		
		System.out.println("Distance betweent the two point is : " +length);
	}

}
