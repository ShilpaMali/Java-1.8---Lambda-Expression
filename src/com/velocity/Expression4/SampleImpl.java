package com.velocity.Expression4;

public class SampleImpl {
	public static void main(String[] args) {

		Sample sample = (b) -> {
			return "java";
		};

		// how to call method
		String s = sample.getSample(25);
		System.out.println(s);
	}

}
