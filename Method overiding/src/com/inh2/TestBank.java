package com.inh2;

public class TestBank {
    public static void main(String[] args) {
    	ICICBank ib=new ICICBank();
    	ib.SecurityAccess();
    	HDFCBank hb=new HDFCBank();
    	hb.SecurityAccess();
    	//System.out.println("hii");
    	}
}
