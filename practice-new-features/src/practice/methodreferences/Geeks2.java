package practice.methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Geeks2 
{
 public static void main(String[] args)
 {
     // Creating an empty ArrayList of user defined type
     // List of person
     List<Employee> employeeList = new ArrayList<>();

     // Adding elements to above object of List
     // using add() method
     employeeList.add(new Employee("Vicky"));
     employeeList.add(new Employee("Poonam"));
     employeeList.add(new Employee("Sachin"));
     employeeList.add(new Employee("Kumar"));

     // Method reference to String type
     Collections.sort(employeeList, Employee::compareByName);

     // Printing the elements(names) on console
     employeeList.forEach(System.out::println);
     
     // List of person
     List<String> stringList = new ArrayList<>();

     // Adding elements to above object of List
     // using add() method
     stringList.add("Vicky");
     stringList.add("Poonam");
     stringList.add("Sachin");
     stringList.add("Kumar");
     
     // Method reference to String type
     Collections.sort(stringList, String::compareToIgnoreCase);
     
     stringList.forEach(System.out::println);
     
 }
}

class Employee{

	private String name;
	
	// Constructor
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int compareByName(Employee emp) {
		return this.getName().compareTo(emp.getName());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}