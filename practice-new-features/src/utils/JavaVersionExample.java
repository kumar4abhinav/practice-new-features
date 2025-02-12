package utils;

public class JavaVersionExample {

	public static void main(String[] args) {

		System.out.println("inside main method");
		String version = System.getProperty("java.version");
		System.out.println("version=" + version);

	}

}
