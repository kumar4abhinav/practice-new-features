package practice.lambdas;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

interface Processor {
    String process(Callable<String> c) throws Exception;
    String process(Supplier<String> s);
}

//Example of Lambda expression with overloading issues

public class LambdaOverloadingIssues implements Processor {
    @Override
    public String process(Callable<String> c) throws Exception {
       return c.call();
    }

    @Override
    public String process(Supplier<String> s) {
    	return s.get();
    }
    
    
	public static void main(String[] args) {
		String result = new LambdaOverloadingIssues()
				.process((Supplier<String>) () -> String.valueOf((Integer) new Object().hashCode())); // Explicit
																										// typecasting
																										// done for an
																										// Object of
																										// Supplier
																										// Functional
																										// Interface to
																										// remove SAM
																										// (single
																										// abstract
																										// method)
																										// ambiguity

    	System.out.println(result);
    }
}