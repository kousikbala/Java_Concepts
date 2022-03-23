package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcepts {

	
	public static void main(String[] args) {
		
		
		Map<Object,Object> m = new HashMap<Object,Object>();
		
		m.put(1, 'm');
		m.put("hello", 23);
		m.put(2, 3.3);
		m.put(1, "hi");
		m.put("z", "hi");
		m.put(null, 90);
		m.put(4, null);
		m.put(5, null);
		m.put(3.3, 4.0);
		
		System.out.println(m);
		
		Object b = m.get(3.3);
		System.out.println(b);
		
		int c = m.size();
		System.out.println(c);
		
		Set<Object> d = m.keySet();
		System.out.println(d);
		
		Collection<Object> e = m.values();
		System.out.println(e);
		
		boolean f = m.containsKey(4);
		System.out.println(f);
		
		boolean g = m.containsValue("hi");
		System.out.println(g);
		
		Set<Entry<Object, Object>> h = m.entrySet();
		System.out.println(h);
		
	    
		for (Entry<Object, Object> k : h) {
			System.out.println(k);
			
		}
			
		}
		
		
	}
	
