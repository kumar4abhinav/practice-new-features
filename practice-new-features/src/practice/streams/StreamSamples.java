package practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSamples {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		String[] arr = new String[]{"a", "b", "c","d","b","a"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(list::add);
				
		list.parallelStream().forEach(System.out::println);
		
		long count = list.stream().distinct().count();
		System.out.println("count is "+count);
		
		boolean isExist = list.stream().anyMatch((String element) -> {
			return element.contains("k");
		});
		System.out.println(isExist);

	}

}
