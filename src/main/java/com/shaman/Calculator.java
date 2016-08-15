package com.shaman;

public class Calculator {
	private int a = 0, b = 0;
	
	public void setA ( int a1) {
		a = a1;
	} 
	public void setB ( int b1) {
		b = b1;
	}
	public int getSum () {
		return a + b;
	}
	public int getDiff () {
		return a - b;
	}
	public long getMult () {
		return a * b;
	}
	public float getDiv () {
		return a / b;
	}
	
}
