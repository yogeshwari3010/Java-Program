package evenodd;

import java.util.Scanner;

public class Anothermethod {
	 public static void main(String[] args) {
		   Scanner sc=new Scanner (System.in);
		   int x;
		   System.out.println("Enter the num:- ");
		   x=sc.nextInt();
		   if(x%2!=0) {
			   System.out.println("number is odd");
			   
		   }else {
			   System.out.println("number is even");
		   }
	   }
}
