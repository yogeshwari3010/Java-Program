package sumofno;

import java.util.Scanner;

public class Sumofno {
  static int getsum(int n) {
	  int sum = 0;
	  while(n !=0) {
		  sum=sum+n%10;
		  n=n/10;
	  }
	  return sum;
  }
	
	
	
	public static void main(String[] args) {
	  //Scanner sc=new Scanner (System.in);
	  
	  int n=5678;
	
	  
	  System.out.println("your nunber is :- "+n);
	 // n=sc.nextInt();
	  System.out.println(getsum(n));
	  
	  
  }
}
