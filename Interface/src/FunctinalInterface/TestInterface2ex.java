package FunctinalInterface;

public class TestInterface2ex {

	public static void main(String[] args) {
       IamInterface m = (int x)->{return x*x;};
       System.out.println(m.Square(10));     
	}

}
