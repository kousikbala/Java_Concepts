package com.abstract_interface;



public class  Person implements Mobile, Restaurant, Theatre {

	@Override
	public void movie() {
		
		System.out.println("spiderman");
		
	}

	@Override
	public void show_time() {
	  
		System.out.println("eveing");
	}

	@Override
	public void menucard() {
	
		System.out.println("dinner");
	}

	@Override
	public void bill() {
	
		System.out.println(457);
	}

	@Override
	public void camera() {
		
		System.out.println("photos");
	}

	@Override
	public void maps() {
	
		System.out.println("location");
	}
	
	public static void main(String[] args) {
		
		Person obj = new Person();
		
		obj.movie();
		
		obj.show_time();
		
		obj.menucard();
		
		obj.bill();
		
		obj.camera();
		
		obj.maps();
		
	}
	

}
