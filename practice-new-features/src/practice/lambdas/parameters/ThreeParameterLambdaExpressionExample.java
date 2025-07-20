package practice.lambdas.parameters;

public class ThreeParameterLambdaExpressionExample {

	@FunctionalInterface
	interface ThreeParametersFunctionalInterface {  
	    double calculateAverage(double a, double b, double c);  
	}
	
	
	public static void main(String[] args) {  
        
		// Using lambda expression to implement the calculateAverage method  
        ThreeParametersFunctionalInterface myLambda = (a, b, c) -> {  
            // Code to be executed with the parameters
            return (a + b + c) / 3.0;  
        };  
        
        // Invoking the method defined in the lambda expression  
        double average = myLambda.calculateAverage(5, 16, 34);  
        System.out.println("Average: " + average);
        
        
		// Using lambda expression to implement the calculateAverage method without return statement
        ThreeParametersFunctionalInterface myLambda2 = (a, b, c) -> (a + b + c) / 11.0;
        
        // Invoking the method defined in the lambda expression  
        double average2 = myLambda2.calculateAverage(5, 16, 34);  
        System.out.println("Average: " + average2);
    }  
}
