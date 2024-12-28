package com.velocity.Expression1;

public class ExampleImpl implements Example {

	@Override
	public void getData() {
		System.out.println("ExampleImpl::getData() method");
	}

	public static void main(String[] args) {
		ExampleImpl exampleImpl = new ExampleImpl();
		exampleImpl.getData();
	}
}
