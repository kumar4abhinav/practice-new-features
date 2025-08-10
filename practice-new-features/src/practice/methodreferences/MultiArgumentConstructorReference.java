package practice.methodreferences;

import java.util.function.BiFunction;

class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class MultiArgumentConstructorReference {
    
	public static void main(String[] args) {
        
		// Functional interface that takes an Integer and a String, returning a Student
        BiFunction<Integer, String, Student> studentCreator = Student::new;

        // Use the constructor reference to create a Student object
        Student student = studentCreator.apply(101, "Bob");
        System.out.println("Created student: ID=" + student.getId() + ", Name=" + student.getName());
    }
}