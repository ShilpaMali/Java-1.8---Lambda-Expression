package com.velocity.Expression3;

public class ExampleImpl {
	public static void main(String[] args) {

		//Test is interface name
		//test is lambda name
		//-> lambda expression
		// ; mandatory to complete statement
		Example example = (b) -> { //10 value will be stored into number
			int a = b * 10; //10*10 =100
			System.out.println(a); //100
		};

		example.getTest(10);
	}

}
