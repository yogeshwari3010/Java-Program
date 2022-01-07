package perimeterofeqilateraltriangle;

import java.util.Scanner;

public class Perimeterofeqilateraltriangle {
   
 public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	double  a,  perimeter;
	System.out.println("Enter value a= ");
	a=sc.nextDouble();
	
	
	perimeter=3*a;
	System.out.println("Perimeter of Eqilateral Triangle = "+perimeter);
	
}
}

