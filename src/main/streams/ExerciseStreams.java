package main.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import main.comparators.Student;

public class ExerciseStreams {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Davi", 11));
		students.add(new Student("Teste", 45));		
		students.add(new Student("Estevão", 8));
		students.add(new Student("Alexsander", 34));
		students.add(new Student("Elis", 31));
		System.out.println("List with ArrayList = "+ students);
		
		System.out.println("Number of elements = " + students.size());	
		
	}
}
