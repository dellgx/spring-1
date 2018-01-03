package com.guigu.beans.autowire;

public class Car {
	private String brand;
	private String corp;
	private double price;
	private int maxspeed;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCorp() {
		return corp;
	}
	public void setCorp(String corp) {
		this.corp = corp;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxspeed=" + maxspeed + "]";
	}

	public Car() {
		System.out.println("Car's Constructor ...");
	
	}

}
