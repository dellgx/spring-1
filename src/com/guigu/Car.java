package com.guigu;

public class Car {

	private String brand;
	private String corp;
	private double price;
	private int maxspeed;


	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public Car(String brand, String corp, double price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	//第2个构造器，重载的构造器
	public Car(String brand, String corp, int maxspeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxspeed = maxspeed;
	}
	
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxspeed=" + maxspeed + "]";
	}

	
	
}
