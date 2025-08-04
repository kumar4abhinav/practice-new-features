package practice.maps;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapThirdExample {

	public static void main(String[] args) {		

        //linkedListStructure structure consisting of LinkedList of LinkedList             
		List<List<Integer>> linkedListStructure = new LinkedList<List<Integer>>();
		linkedListStructure.add(new LinkedList<Integer>(Arrays.asList(101, 103)));
		linkedListStructure.add(new LinkedList<Integer>(Arrays.asList(201, 212)));
		linkedListStructure.add(new LinkedList<Integer>(Arrays.asList(307, 350))); 		
	
		// arrayListStructure structure consisting of ArayList of ArayList
		List<List<Integer>> arrayListStructure = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(7, 17),
				Arrays.asList(31, 37));

        
		List<List<List<Integer>>> dataListStructure = new LinkedList<List<List<Integer>>>();
		dataListStructure.add(linkedListStructure);
		dataListStructure.add(arrayListStructure);		
		
	      // Use flatMap to flatten the list of lists into a single list of integers
		List<List<Integer>> flattenedDataListStructure = dataListStructure.stream()
                                                  .flatMap(List::stream) 
                                                  .collect(Collectors.toList());
		
		System.out.println(flattenedDataListStructure);
		
		
        
        /**
         * Example of Double invocation of flatMap
         */
	      // Use flatMap to flatten the list of lists into a single list of integers
		List<Integer> flattenedDataListStructure2 = dataListStructure.stream()
                                                .flatMap(List::stream)
                                                .flatMap(List::stream)
                                                .collect(Collectors.toList());
		
		System.out.println(flattenedDataListStructure2);

	}

}
