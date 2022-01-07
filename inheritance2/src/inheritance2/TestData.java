package inheritance2;
//Object Slicing:- whenever u assign the superclass object to subclass object & u have some 
//extra memory in subclass is called as Object slicing...
public class TestData {
	public static void main(String[] args) {
		 Data d1=new MyData();
		  
		  Data d2=new Data();
		  d2.setI(300);
		  d2.setJ(678);
		 // d2.setK(7484);
		//  d2.setM(8765);
		  
		  System.out.println(d2.getI());
		  System.out.println(d2.getJ());
		 // System.out.println(d2.getK());
		//  System.out.println(d2.getM());
		  
	  }
}
