package test;

public class Test {
	public static void myline() {
		for (int i=0; i<80; i++) {
			System.out.println(" - ");
			System.out.println();
		}
	}
		
		public static void myline(char x) {
			for (int i=0; i<80; i++) {
				System.out.println(x);
				System.out.println();
			}
		}
			
			public static void myline(char x ,int len) {
				for (int i=0; i<len; i++) {
					System.out.println(x);
					System.out.println();
	}
			}
     public static void main(String[] args) {
    	 myline('#',40);
    	 myline('*',80);
    	 myline();
    	 myline('$');
     }
		
			
	}


