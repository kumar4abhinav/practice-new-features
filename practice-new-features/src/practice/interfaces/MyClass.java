package practice.interfaces;

interface InterfaceA {

	default void doSomething() {
		System.out.println("Inside doSomething default method of InterfaceA");
	}
}

interface InterfaceB {

	default void doSomething() {
		System.out.println("Inside doSomething default method of InterfaceB");
	}
}

public class MyClass implements InterfaceA, InterfaceB {

	@Override
	public void doSomething() {
		// Option 1: Provide own implementation
		System.out.println("Inside doSomething method of MyClass");

		// Option 2: Call a specific default method
		System.out.println("Invoking doSomething method of InterfaceA");
		InterfaceA.super.doSomething();
		
		System.out.println("Invoking doSomething method of InterfaceB");
		InterfaceB.super.doSomething();
	}

	public static void main(String[] args) {

		new MyClass().doSomething();

	}
}