package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
	
	public static void main(String[] args) {
		
		
	Set <Integer> ts = new TreeSet<Integer>();
		
		ts.add(68);
		ts.add(95);
		ts.add(25);
		ts.add(42);
		ts.add(25);
		
		System.out.println(ts);
		
		 int a = ts.size();
		 System.out.println(a);
		 
		 boolean b = ts.contains(68);
		 System.out.println(b);
		 
	//	 ts.clear();
	//	 System.out.println(ts);
		 
		 Set<Integer> ts1 = new TreeSet<Integer>();
		 
		 ts1.add(29);
		 ts1.add(81);
		 ts1.add(33);
		 ts1.add(68);
		 
		 System.out.println(ts1);
		 
	//	 ts.addAll(ts1);
	//	 System.out.println(ts);
		 
		 
	//	 ts.retainAll(ts1);
	//	 System.out.println(ts);
		 
		 
		 ts.removeAll(ts1);
		 System.out.println(ts);
		 
		 
		 
		 
		 
	}

}
