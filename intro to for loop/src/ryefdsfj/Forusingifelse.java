package ryefdsfj;

import java.util.Scanner;

public class Forusingifelse {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int i ,n;
		System.out.println("Enter the range :-");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
		 
		if(i==n) {	
			System.out.printf("%d ",i );
		}
		else {
			
			System.out.printf("%d + ",i );
		}
		}s.close();
		
		
	}

}
