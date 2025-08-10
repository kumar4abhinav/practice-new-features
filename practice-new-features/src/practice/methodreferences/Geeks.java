package practice.methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Person {
	
			private String name;
			private Integer age;
		
			// Constructor
			public Person(String name, int age) {
				// This keyword refers to current instance itself
				this.name = name;
				this.age = age;
			}
		
			// Getter-setters
			public Integer getAge() {
				return age;
			}
		
			public String getName() {
				return name;
			}
}

//Driver class
public class Geeks {
		
			// Static method to compare with name
			public static int compareByName(Person a, Person b) {
				return a.getName().compareTo(b.getName());
			}
		
			// Static method to compare with age
			public static int compareByAge(Person a, Person b) {
				return a.getAge().compareTo(b.getAge());
			}

	
	// Main driver method
	public static void main(String[] args) {
	
			// Creating an empty ArrayList of user-defined type
			// List of person
			List<Person> personList = new ArrayList<>();
	
			// Adding elements to above List
			// using add() method
			personList.add(new Person("Vicky", 24));
			personList.add(new Person("Poonam", 25));
			personList.add(new Person("Sachin", 19));
	
			// Using static method reference to
			// sort array by name
			Collections.sort(personList, Geeks::compareByName);
	
			// Display message only
			System.out.println("Sort by Name :");
	
			// Using streams over above object of Person type
			personList.stream().map(x -> x.getName()).forEach(System.out::println);
	
			System.out.println();
	
			// Now using static method reference
			// to sort array by age
			
			// Explicit typecast to Comparator Object, method signature of Person class
			// should match to compare method of Comparator ;
			Collections.sort(personList, (Comparator<Person>)Geeks::compareByAge); 
	
			// Display message only
			System.out.println("Sort by Age :");
	
			// Using streams over above object of Person type
			personList.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}