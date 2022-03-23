package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetConcepts {
	
	public static void main(String[] args) {
		
		
		Set <Object> s =new HashSet<>();
		
		s.add(23);
		s.add(23);
		s.add(3.3);
		s.add(null);
		
		System.out.println(s);
		
		int a = s.size();
		System.out.println(a);
		
		boolean b  = s.contains(3.3);
		System.out.println(b);
		
	//	s.clear();
	//	System.out.println(s);
		
		 
		Set <Object> s1 = new LinkedHashSet <>();
		
		s1.add(23);
		s1.add(5.5);
		s1.add("hi");
		
		System.out.println(s1);
		
	//	s.addAll(s1);
	//	System.out.println(s);
		
	//	s.retainAll(s1);
	//	System.out.println(s);
		
		s.removeAll(s1);
		System.out.println(s); 
		
		
		
	}

}
