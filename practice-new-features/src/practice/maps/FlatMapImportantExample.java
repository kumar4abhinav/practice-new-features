package practice.maps;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapImportantExample {

	public static void main(String[] args) {		

        //linkedListStructure structure consisting of LinkedList of LinkedList             
		List<List<Integer>> linkedListStructure = new LinkedList<List<Integer>>();
		linkedListStructure.add(new LinkedList<Integer>(Arrays.asList(101, 103)));
		linkedListStructure.add(new LinkedList<Integer>(Arrays.asList(201, 212)));
		linkedListStructure.add(new LinkedList<Integer>(Arrays.asList(307, 350))); 		
	
		// arrayListStructure structure consisting of ArayList of ArayList
		List<List<Integer>> arrayListStructure = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(7, 17),
				Arrays.asList(31, 37));

		//linkedListStructure structure consisting of List of List of List
		List<List<List<Integer>>> dataListStructure = new LinkedList<List<List<Integer>>>();
		dataListStructure.add(linkedListStructure);
		dataListStructure.add(arrayListStructure);	    
		
		 
		/**
         * Example of Single invocation of flatMap
         */
		List<List<Integer>> flattenedDataListStructure1 = dataListStructure.stream()
                                                  .flatMap(List::stream) 
                                                  .collect(Collectors.toList());		
		System.out.println("flattenedDataListStructure1");
		System.out.println(flattenedDataListStructure1);
		System.out.println();
		
		
        
        /**
         * Example of Double invocation of flatMap
         */
		List<Integer> flattenedDataListStructure2 = dataListStructure.stream()
                                                .flatMap(List::stream)
                                                .flatMap(List::stream)
                                                .collect(Collectors.toList());		

/**
		/**
		 * flatMap flattens 2 nested streams into 1 stream
		 * 
		 */
		//Transformation steps explained
		//List<List<List<Integer>>>  -> stream() ->  Stream<List<List<Integer>>>   -> flatMap(List::stream)  Stream<List<Integer>>  
		//-> flatMap(List::stream) -> Stream <Integer>
		
		
		System.out.println("flattenedDataListStructure2");
		System.out.println(flattenedDataListStructure2);
		System.out.println();
		
		//Using toList instead of collect(Collectors.toList())
		
		List<Integer> flattenedDataListStructure3 = dataListStructure.stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .toList();	
		
		System.out.println("flattenedDataListStructure3");
		System.out.println(flattenedDataListStructure3);
		System.out.println();
		
		 /**
         * Example of map invocation
         */
		List<Stream<List<Integer>>> mapStructure = dataListStructure.stream()
                                                .map(List::stream) 
                                                .collect(Collectors.toList());		
		System.out.println("mapStructure");
		System.out.println(mapStructure);
	}

}
