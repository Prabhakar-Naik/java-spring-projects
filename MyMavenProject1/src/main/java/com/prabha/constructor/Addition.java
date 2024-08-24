package com.prabha.constructor;

public class Addition {

	private int num1;
	private int num2;
	
	
	//PDC+tostring()
	
	public Addition() {
		super();
	}
	
	public Addition(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Addition [num1=" + num1 + ", num2=" + num2 + "]";
	}

	public void add() {
		System.out.println("Addition of two numbers: "+(num1+num2));
	}

	
}
