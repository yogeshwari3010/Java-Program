package areaofsquare;

import java.util.Scanner;

public class Areaofsquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  a, area;
		System.out.println("Enter value a= ");
		a=sc.nextDouble();
		area=a*a;
		System.out.println("Area of square  = "+area);
		sc.close();
		
}
}
