package perimeterofsquare;

import java.util.Scanner;

public class Perimeterofsquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  a, perimeter;
		System.out.println("Enter value a= ");
		a=sc.nextDouble();
		perimeter=4*a;
		System.out.println("Perimeter of Square = "+perimeter);
		sc.close();
		
}

}
