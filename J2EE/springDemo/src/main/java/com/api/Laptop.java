package com.api;

public class Laptop {

	private int id;
	private String name;
	private String brand;
	private int ram;
	private int ssd;
	private double price;
	public Laptop(int id, String name, String brand, int ram, int ssd, double price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.ssd = ssd;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", brand=" + brand + ", ram=" + ram + ", ssd=" + ssd + ", price="
				+ price + "]";
	}
	
	
	
}
