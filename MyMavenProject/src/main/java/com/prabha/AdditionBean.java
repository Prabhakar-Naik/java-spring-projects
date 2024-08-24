package com.prabha;

public class AdditionBean {

	private int num1;
	private int num2;
	
	//PDC+PSM+PGM+Business Method()
	
	public AdditionBean() {
		super();
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void printadd() {
		System.out.println("The Addition of two nubers "+(num1+num2));
	}
	public void printsub() {
		System.out.println("The substraction of two numbers "+(num1-num2));
	}
	
	
}
