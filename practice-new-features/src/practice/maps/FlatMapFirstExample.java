package practice.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapFirstExample {
    
	public static void main(String[] args) {

		List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8)
        );

        listOfLists.stream();
        
        // Use flatMap to flatten the list of lists into a single list of integers
        List<Integer> flattenedList = listOfLists.stream()
                                                  .flatMap(List::stream) // Each List is mapped to a Stream<Integer>, and then all are flattened
                                                  .collect(Collectors.toList());
        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8]

    }
}