package com.abstract_class;


public class AmazonPractice extends AbstractClass {

	@Override
	public void password() {

		System.out.println("1234");
		
	}

	@Override
	public void username(String name) {
	
		super.username(name);
	}


		public static void main(String[] args) {
			
			AmazonPractice obj = new AmazonPractice();
			 obj.password();
			 obj.username("subash123");
			 
		
		}
	}
	