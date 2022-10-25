package com.bridgelab.LineComparison;

import java.util.Scanner;

public class UC4_TwoLinesAndPointsEquals {
	int x1, x2, y1, y2;
	public double lenghtOfLine() {
		Scanner sc = new Scanner(System.in);
		// for first line
		System.out.println("enter x1 point");

		x1 = sc.nextInt();

		System.out.println("enter y1 point");

		y1 = sc.nextInt();

		System.out.println("enter x2point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();
		return lenghtCalculator( x1, y1, x2, y2);

		

	}
	public static void compareOfLenght(double lenght1, double lenght2) {
		String str1=String.valueOf(lenght1);
		String str2=String.valueOf(lenght2);

		if (str1.compareTo(str2)== 0) {
			System.out.println("Two lines are of equal lenght");
		}
		else if (str1.compareTo(str2)>0) {
			System.out.println("lenght of First line is greater than second lenght of second line");
		}
		else {
			System.out.println("lenght of First line is smaller than second lenght of second line");
		}
		
	}
	public static void equalityOfLine(double lenght1, double lenght2) {
		String str1=String.valueOf(lenght1);
		String str2=String.valueOf(lenght2);

		if (str1.equals(str2)) {
			System.out.println("Two lines are of equal lenght");
		}
		
		else {
			System.out.println("Two lines are of not equal lenght");
		}
		
	}
	public static double lenghtCalculator(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
		public static void main(String arg[]) {
			
			UC4_TwoLinesAndPointsEquals obj1=new UC4_TwoLinesAndPointsEquals();
			UC4_TwoLinesAndPointsEquals obj2=new UC4_TwoLinesAndPointsEquals();
			System.out.println("Enter the first line detail");
			
		double lenght1 =obj1.lenghtOfLine();
		System.out.println("Enter the second line detail");
		double lenght2 =obj2.lenghtOfLine();
		equalityOfLine(lenght1, lenght2);
		compareOfLenght(lenght1,lenght2);
			
}
}