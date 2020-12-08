package main.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
	public static void main(String[] args) {
		Set<Double> studentGrades = new HashSet<>();
		studentGrades.add(5.8);
		studentGrades.add(9.3);
		studentGrades.add(6.5);
		studentGrades.add(10.0);
		studentGrades.add(5.4);
		studentGrades.add(7.3);
		studentGrades.add(3.8);
		studentGrades.add(4.0);
		System.out.println("List of grades = "+ studentGrades);
		System.out.println("amount of list itens = "+ studentGrades.size());
		
		studentGrades.remove(3.8);
		System.out.println("List of grades after remove 3.8 = "+ studentGrades);		
		System.out.println("amount of list itens after remove 3.8 = "+ studentGrades.size());
		
		Iterator<Double> iterator = studentGrades.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("List of grades after iterated = "+ iterator.next());
		}
		
		for(Double studentGrade: studentGrades) {
			System.out.println("List of grades with for each = "+ studentGrade);
		}
		
		System.out.println("List of grades before clear isEmpty? "+ studentGrades.isEmpty());
		studentGrades.clear();
		System.out.println("List of grades after clear = "+ studentGrades);
		System.out.println("List of grades after clear isEmpty? "+ studentGrades.isEmpty());
		
	}
}
