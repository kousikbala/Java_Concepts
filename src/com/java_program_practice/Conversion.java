package com.java_program_practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Conversion {
	
	public static void main(String[] args) {
		
	
	   // 1). int to String
	
	int i = 100;
	
	//ing sring format mathod
	
	String s = String.format("%d",i);
	
System.out.println(s);
//-------------------------------------------------------------------------------------------------------------------------

//2)String to int
//parseint method

String s1 ="101";

int j= Integer.parseInt(s1);

System.out.println(s1);
//----------------------------------------------------------------------------------

// double to int
// We can convert double to int in java using intValue() method

Double d = 10.5;

Double d1=new Double(10.5);  
int i1=d1.intValue();  
System.out.println(i1);

//-------------------------------------------------------------------------------------------------

//double to string 
//string format method


double e= 36.98d;
String s11 = String.format("%f", e);
System.out.println(s11); //36.980000

//------------------------------------------------------------
//list to set

java.util.List n= new ArrayList();
n.add("Good");
n.add("Morning");
n.add("Morning");
Set r= new HashSet(n);
System.out.println(r);

//--------------------------------------------------------------------------------------
//list to map


Map<Integer, String> myMap = new HashMap<>();
myMap.put(1, "Java");
myMap.put(2, "JavaFX");
myMap.put(3, "CoffeeScript");
myMap.put(4, "TypeScript");

ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
ArrayList<String> valueList = new ArrayList<String>(myMap.values());

System.out.println("contents of the list holding keys the map ::"+keyList);
System.out.println("contents of the list holding values of the map ::"+valueList);


	}
}
	
	


