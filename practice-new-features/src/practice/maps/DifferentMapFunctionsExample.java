package practice.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferentMapFunctionsExample {
    
	public static void main(String[] args) {

        // Example where map() creates a nested structure:
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(-1, -2), Arrays.asList(11, 13), Arrays.asList(23, 71));
        List<Stream<Integer>> streamOfStreams = nestedList.stream()
                                                         .map(List::stream)
                                                         .collect(Collectors.toList());
        // This 'streamOfStreams' is a List containing two Stream<Integer> objects,
        // it's not a single flat stream of integers.
        System.out.println(streamOfStreams); // Output might look like: [java.util.stream.ReferencePipeline$Head@..., java.util.stream.ReferencePipeline$Head@...]
        
        
        // Use flatMap to flatten the list of lists into a single list of integers
        List<Integer> flattenedList = nestedList.stream()
                                                  .flatMap(List::stream) // Each List is mapped to a Stream<Integer>, and then all are flattened
                                                  .collect(Collectors.toList());
        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
        
    }
}