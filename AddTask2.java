package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class AddTask2 {

	public static void main(String[] args) {

		Numerable c = new MyCalculator(15, 5, 7);
		
		c.devide();
		c.multiply();
		c.minus();
		c.plus();
		
	}

}
