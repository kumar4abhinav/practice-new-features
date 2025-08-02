package practice.interfaces;

interface InterfaceA {
    
	default void doSomething() {
        System.out.println("From InterfaceA");
    }
}

interface InterfaceB {

	default void doSomething() {
        System.out.println("From InterfaceB");
    }
}

public class MyClass implements InterfaceA, InterfaceB {
    
	@Override
    public void doSomething() {
        // Option 1: Provide own implementation
        System.out.println("From MyClass");

        // Option 2: Call a specific default method
         InterfaceA.super.doSomething();
         InterfaceB.super.doSomething();
    }
	
	public static void main(String[] args) {
		
		new MyClass().doSomething();
		
	}
}