package practice.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapBeginnerExample {	
	

	public static void main(String[] args) {
		
	    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
	    List<Integer> nameLengths = names.stream()
	                                     .map(String::length)
	                                     .collect(Collectors.toList());
	    
	    System.out.println(nameLengths.toString());
	    // nameLengths will be [5, 3, 7]
	    
	    
	    List<List<Integer>> nestedLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
	    List<Integer> flattenedList = nestedLists.stream()
	                                             .flatMap(Collection::stream)
	                                             .collect(Collectors.toList());
	    
	    System.out.println(flattenedList.toString());
	    // flattenedList will be [1, 2, 3, 4, 5]

	}

}
