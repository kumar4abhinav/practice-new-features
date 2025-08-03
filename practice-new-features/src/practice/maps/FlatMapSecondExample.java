package practice.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapSecondExample {

	public static void main(String[] args) {    

        
        List<String> sentences = Arrays.asList("Hello world", "Java streams are powerful");

        // Use flatMap to get all individual words from a list of sentences
        List<String> words = sentences.stream()
                                      .flatMap((String sentence) -> Arrays.stream(sentence.split(" "))) // Each sentence is split into words (an array), then converted to a stream, then flattened
                                      .collect(Collectors.toList());

        System.out.println(words); // Output: [Hello, world, Java, streams, are, powerful]

	}

}
