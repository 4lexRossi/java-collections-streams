package main.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Davi", 11));
		students.add(new Student("Teste", 45));		
		students.add(new Student("Estevão", 8));
		students.add(new Student("Alex", 34));
		students.add(new Student("Elis", 31));
		System.out.println("List with ArrayList = "+ students);
		
		students.sort((first, second) -> first.getAge() - second.getAge());
		System.out.println("List after sort by age = "+ students);
		students.sort((first, second) -> second.getAge() - first.getAge());
		System.out.println("List after reverse sort by age = "+ students);
		
		students.sort(Comparator.comparingInt(Student::getAge));
		System.out.println("List after order by comparator = "+ students);
		students.sort(Comparator.comparingInt(Student::getAge).reversed());
		System.out.println("List after reverse order by comparator = "+ students);
		
		Collections.sort(students);
		System.out.println("List after ordered by Collection implementation of Students class = "+students);
		Collections.sort(students, new StudentReverseOrdemByAge());
		System.out.println("List after reverse ordered by Collection implementation of Students class = "+ students);
	}
}
