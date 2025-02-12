package practice.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ParallelismAndConcurrencyLambdaExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		
		// Without Lambda Expression
		int sumWithoutLambda = numbers.parallelStream().reduce(0, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer x, Integer y) {
				return x + y;
			}
		});

		System.out.println(sumWithoutLambda);

		// With Lambda Expression
		int sumWithLambda = numbers.parallelStream().reduce(0, (x, y) -> x + y);

		System.out.println(sumWithLambda);

	}

}
