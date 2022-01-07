package ryefdsfj;

import java.util.Scanner;

public class squarerange {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int i ,n;
		System.out.println("Enter the range :-");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println(i*i );
			
		}
		s.close();
	}
}
	

