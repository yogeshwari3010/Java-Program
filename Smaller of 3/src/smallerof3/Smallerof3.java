package smallerof3;

import java.util.Scanner;

public class Smallerof3 {
   
public static void main(String[] args) { 
	Scanner sc=new Scanner (System.in);
	int a, b, c, smallest, temp;
	System.out.println("Enter ist number:-");
	a=sc.nextInt();
	System.out.println("Enter ist number:-");
	b=sc.nextInt();
	System.out.println("Enter ist number:-");
	c=sc.nextInt();
	temp=a<b?a:b;  
	//comparing the temp variable with c and storing the result in the variable  
	smallest=c<temp?c:temp;  
	//prints the largest number  
	System.out.println("The smallest number is: "+smallest);  
}
}

