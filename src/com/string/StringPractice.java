package com.string;

public class StringPractice {
	
	public static void main(String[] args) {
		
		String s = ("i am coming from Chennai and i work in bangalore");
		
	//	int a = s.length();
	//	System.out.println(a);
		
		 int a = s.length();
		System.out.println(a);
		
	   String s1 = ("i am coming from chennai and i work in bangalore");         
	    
	    
	    boolean b = s.equals(s1);            //"c" small letter
		System.out.println(b);
		
		boolean c = s.equalsIgnoreCase(s1);
		System.out.println(c);
		
		String d = s.toUpperCase();
		System.out.println(d);
		
		String e = s.toLowerCase();
		System.out.println(e);
		
		boolean f = s.startsWith("i am");
		System.out.println(f);
		
		boolean g = s.endsWith("lore");
		System.out.println(g);
		
		boolean h = s.contains("z");
		System.out.println(h);
		
		int i = s.indexOf("f");
		System.out.println(i);
		
		int j = s.lastIndexOf("i");
		System.out.println(j);
		
		char k = s.charAt(10);
		System.out.println(k);
		
	    String l = String.valueOf("F");
	    System.out.println(l);
	    
	}

}
