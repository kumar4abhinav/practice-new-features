package practice.lambdas.parameters;


public class NoParameterLambdaExpressionExample{
	
	interface Sayable{  
	    public String say();
	}	
	
	public static void main(String[] args) {  
	    Sayable s=()->{
	    	String val="JOHN";
	    	
	        return "I have nothing to say Dear "+val;  
	    };
	    
	    System.out.println(s.say());  
	}
	
}  