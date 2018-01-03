package com.atguigu.beans.cycle;

public class Car {
	private String brand;
	
	public Car() {
		System.out.println("Car's Constructor...");
		
		
	}

	public void setBrand(String brand) {
		System.out.println("setBrand ...");
		this.brand = brand;
	}
	
	public void init2() {
		System.out.println("init2...");
	}

	public void destroy() {
		System.out.println("destroy...");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	

	
}
