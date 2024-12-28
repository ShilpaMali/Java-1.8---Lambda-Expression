package com.velocity.Expression5;

public class DemoImpl {
	public static void main(String[] args) {

		Demo demo = (x) -> {
			return x;
		};

		//scanner class
		int result = demo.getDemo(50);
		System.out.println(result);
	}

}
