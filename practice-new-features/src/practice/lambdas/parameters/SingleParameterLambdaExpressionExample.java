package practice.lambdas.parameters;


  
public class SingleParameterLambdaExpressionExample{

	@FunctionalInterface
	interface Sayable {
		public String say(String name);
	}

	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Sayable s1 = (String name) -> {
			
			String dex = "dexter2";
			return "Hello, " + name + dex;
		};
		System.out.println(s1.say("Sonoo"));

		// You can omit function parentheses
		Sayable s2 = name -> {
			
			String dex = "dexter";
			return "Hello, " + name + dex;
		};
		System.out.println(s2.say("Sonoo"));
	}
}  
