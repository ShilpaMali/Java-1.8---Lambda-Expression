package com.velocity.Expression2;

public class ExampleImpl {
	public static void main(String[] args) {

		//Example is interface name
		//example is lambda name
		//-> lambda expression
		//; its mandatory
		Example example = () -> {
			System.out.println("This is getData() method");
		};

		example.getData(); //lambdaname.methodname
	}

}
