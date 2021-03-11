package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	int a;
	int b;
	int c;
	private double devide;
	private int multiply;
	private int minus;
	private int plus;

	public MyCalculator(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void devide() {
		Numerable.super.devide();
		devide = a / b;
		System.out.println(a + " / " + b + " = " + devide);
	}

	@Override
	public void multiply() {
		Numerable.super.multiply();
		multiply = a * c;
		System.out.println(a + " * " + c + " = " + multiply);
	}

	@Override
	public void minus() {
		Numerable.super.minus();
		minus = c - b;
		System.out.println(c + " - " + b + " = " + minus);
	}

	@Override
	public void plus() {
		Numerable.super.plus();
		plus = a + b;
		System.out.println(a + " + " + b + " = " + plus);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double getDevide() {
		return devide;
	}

	public void setDevide(double devide) {
		this.devide = devide;
	}

	public int getMultiply() {
		return multiply;
	}

	public void setMultiply(int multiply) {
		this.multiply = multiply;
	}

	public int getMinus() {
		return minus;
	}

	public void setMinus(int minus) {
		this.minus = minus;
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}

}
