package com.spring.spring4;

public class Calculator {
	private Adder adder;

	public Calculator(Adder adder) {
		this.adder = adder;
	}

	public int add(int a, int b) {
		return adder.add(a, b);
	}
}
