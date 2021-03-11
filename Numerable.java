package com.lgs.lab.interface1;

public interface Numerable extends Plus, Minus, Multiply, Devide {

	@Override
	default void devide() {
		System.out.println("I can devide");

	}

	@Override
	default void multiply() {
		System.out.println("I can multiply");

	}

	@Override
	default void minus() {
		System.out.println("I can reduce");

	}

	@Override
	default void plus() {
		System.out.println("I can add");

	}

}
