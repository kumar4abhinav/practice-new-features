package practice.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

//Object need to be sorted
class Record {
	private String name;
	private Integer age;

	// Constructor
	public Record() {
		Random ran = new Random();

		// Assigning a random value
		// to name
		this.name = ran.ints(97, 122 + 1).limit(7)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}
	
	
	public Record(int a, int b) {
		
		Random ran = new Random();

		this.name = ran.ints(a, b + 1).limit(7)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	public Record(int a, int b, int c) {
		
		Random ran = new Random();
		this.name = ran.ints(a, b + c).limit(7)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

public class Geeks3 {

	// Get List of objects of given
	// length and Supplier
	public static <T> List<T> getObjectList(int length, Supplier<T> objectSupply) {
		List<T> list = new ArrayList<>();

		for (int i = 0; i < length; i++)
			list.add(objectSupply.get());
		return list;
	}

	public static void main(String[] args) {

		// Get 10 person by supplying
		// person supplier, Supplier is
		// created by person constructor
		// reference
		List<Record> recordList = getObjectList(5, Record::new);

		// Print names of personList
		recordList.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}