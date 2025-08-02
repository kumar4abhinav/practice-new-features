package utils;

public class JavaVersionExample {

	public static void main(String[] args) {
		
		String version = System.getProperty("java.version");
		System.out.println("java.version=" + version);		
		
		System.out.println(String.format("%s %n", "All System Properties"));
		
		System.getProperties().forEach((obj1, obj2) -> {
			System.out.println(obj1 + " :: " + obj2);
		});

	}

}
