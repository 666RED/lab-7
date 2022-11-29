package com.hongchen.exercise2;

public class Laptop {

	private String cpu;
	private double ram;
	private double ssd;
	
	// no-argument constructor
	public Laptop() {
		this.cpu = "Intel Core";
		this.ram = 8;
		this.ssd = 512;
	}
	
	// parameterized constructor
	public Laptop(String cpu, double ram, double ssd) {
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	public String getCPU() {
		return this.cpu;
	}
	
	public double getRAM() {
		return this.ram;
	}
	
	public double getSSD() {
		return this.ssd;
	}
	
	
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop(); // no-argument 
		Laptop laptop2 = new Laptop("AMD", 4, 256); // parameterized
		
		System.out.println("\nLaptop 1");
		System.out.println("CPU: " + laptop1.getCPU());
		System.out.println("RAM: " + laptop1.getRAM() + " GB");
		System.out.println("SSD: " + laptop1.getSSD() + " GB");
		
		System.out.println("\nLaptop 2");
		System.out.println("CPU: " + laptop2.getCPU());
		System.out.println("RAM: " + laptop2.getRAM() + " GB");
		System.out.println("SSD: " + laptop2.getSSD() + " GB");
	}

}
