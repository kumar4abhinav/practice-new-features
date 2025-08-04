package practice.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeginnerFlatMapExample {	
	

	public static void main(String[] args) {
		
	    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
	    List<Integer> nameLengths = names.stream()
	                                     .map(String::length)
	                                     .collect(Collectors.toList());
	    
	    System.out.println(nameLengths.toString());
	    // nameLengths will be [5, 3, 7]

	    
        List<String> words = Arrays.asList("hello", "world", "java");
        // Use map to transform each word to its uppercase version
        List<String> upperCaseWords = words.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());

        System.out.println(upperCaseWords); // Output: [HELLO, WORLD, JAVA]

	}

}
