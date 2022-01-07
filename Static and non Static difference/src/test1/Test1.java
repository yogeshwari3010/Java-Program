package test1;

public class Test1 {
	void m1() {
		System.out.println(" In m1 Method");
	}
	static void m2() {
		System.out.println(" In m2 Method");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1();
		m2();
	}

}
