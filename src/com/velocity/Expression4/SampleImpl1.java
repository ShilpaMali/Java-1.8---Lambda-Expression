package com.velocity.Expression4;

public class SampleImpl1 {
	public static void main(String[] args) {

		Sample sample = (a) -> "java";
		String s = sample.getSample(10);
		System.out.println(s);
	}

}
