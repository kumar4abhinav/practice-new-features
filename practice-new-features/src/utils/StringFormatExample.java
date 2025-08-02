package utils;

public class StringFormatExample {
	
	public static void main(String[] args) {
		
		String name = "Alice";
		int age = 30;

		// Example 1: Basic string argument and newline
		String formattedString1 = String.format("Hello, %s!%n", name);
		System.out.println(formattedString1);

		// Example 2: Multiple arguments and newline
		String formattedString2 = String.format("Name: %s, Age: %d%n", name, age);
		System.out.println(formattedString2);

		// Example 3: String argument with width specifier and newline
		String product = "Laptop";
		double price = 1200.123456709;
		String formattedString3 = String.format("Product: %-10s Price: %.7f%n", product, price);
		System.out.println(formattedString3);
	}
}