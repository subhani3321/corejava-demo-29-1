package com.subbu;

public class StringNull {
	String s2;
	public static void main(String[] args) {
		String s="su";
		System.out.println();
		if(s.length()!=0) {
			System.out.println(s);
		}
		if (s==null) {
			System.out.println("rabbani");
		}
		else s="subhani";
		System.out.println(s);
		System.out.println(s.length());
		StringNull sss = new StringNull();
		
		if(sss.s2==null) {
			System.out.println("s2 subhani");
		}

	}

}
