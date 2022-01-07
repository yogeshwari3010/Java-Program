package perimeterofrectangle;

import java.util.Scanner;

public class Perimeterofrectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  l, w, perimeter;
		System.out.println("Enter value l= ");
		l=sc.nextDouble();
		System.out.println("Enter value w= ");
		w=sc.nextDouble();
		
		perimeter=2*(l+w);
		System.out.println(" Perimeter of rectangle = "+perimeter);
		
	}
}
