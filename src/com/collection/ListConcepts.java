package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListConcepts {
	     
	public static void main(String[] args) {
		 
		 List <Object> li = new Vector<>();
		 
		 li.add(23);
		 li.add(3.3);
		 li.add("hello");
		 li.add("s");
		 li.add(23);
		// li.add(3);
		 
		 System.out.println(li);
		 
		 int a = li.size();
		 System.out.println(a);
		 
		 Object b = li.get(2);
		 System.out.println(b);
         
		 li.set(4, 33);
		 System.out.println(li);
		 
		 li.remove(2);
		 System.out.println(li);
		 
		 int c = li.indexOf(3.3);
		 System.out.println(c);
		 
		 boolean d = li.contains("s");
		 System.out.println(d);
		 
	//	 li.clear();
	//	 System.out.println(li);
		 
		 
		 List <Object> li1 = new ArrayList();
		 
		 li1.add(23);
		 li1.add(90);
		 li1.add("q");
		 
		 System.out.println(li1);
		 
//	 li.addAll(li1);
     System.out.println(li);
		 
//	 li.retainAll(li1);
		 System.out.println(li);
		 
		 
		 li.removeAll(li1);
		 System.out.println(li);
		 
		  
	}

}
