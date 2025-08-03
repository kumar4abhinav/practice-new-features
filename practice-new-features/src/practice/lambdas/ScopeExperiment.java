package practice.lambdas;

public class ScopeExperiment {
	
	private String value = "Enclosing scope value";
	
	interface Foo {
		String method(String string);
	}
	
	public String scopeMethod() {
	    Foo fooIC = new Foo() {
	        String value = "Inner class value";

	        @Override
	        public String method(String string) {
	            return this.value;
	        }
	    };
	    String resultIC = fooIC.method("");

	    Foo fooLambda = parameter -> {
	        
	    	@SuppressWarnings("unused")
			String value = "Lambda value";
	    	
	        return this.value;
	    };
	    String resultLambda = fooLambda.method("");

	    return "Results: resultIC = " + resultIC + 
	      ", resultLambda = " + resultLambda;
	}
	
	
	public static void main(String[] args) {
		
		String s = new ScopeExperiment().scopeMethod();
		System.out.println(s);
	}
	
}
