package areaofrombus;

import java.util.Scanner;

public class Areaofrombus {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  p, q, area;
		System.out.println("Enter value p= ");
		p=sc.nextDouble();
		System.out.println("Enter value q= ");
		q=sc.nextDouble();
		area=(p*q)/2;
		System.out.println("Area of Rombus = "+area);
		
	}
}
