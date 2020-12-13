package main.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExampleStreamAPI {
	public static void main(String[] args) {
		List<String> students = new ArrayList<>();
		students.add("Estevão");
		students.add("Davi");
		students.add("Elis");
		students.add("Alexsander");
		students.add("Testea");		
		System.out.println("Counting list with ArrayList = "+ students.stream().count());
		
		Optional<String> biggestName = students.stream().max(Comparator.comparingInt(String::length));		
		System.out.println("Name With most letters = "+ biggestName);
		Optional<String> smallestName = students.stream().min(Comparator.comparingInt(String::length));
		System.out.println("Name With less letters = "+ smallestName);
		
		System.out.println("list with 'a' in ArrayList = "+ students.stream().filter((student) ->
			student.toLowerCase().contains("a")).collect(Collectors.toList()));
		
		System.out.println("New Collection with sum of letters = "+ students.stream().map(student ->
			student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()));
		
		System.out.println("First tre elements = "+ students.stream().limit(3).collect(Collectors.toList()));
		
		System.out.println("Return elements with peek = "+ students.stream().peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println("Return elements with for each in row");
		students.stream().forEach(System.out::println);
		
		System.out.println("all elements have letter 'E' with allMatch = "+ students.stream().allMatch((element) -> element.contains("E")));		
		System.out.println("any element have letter 'e' with anyMatch = "+ students.stream().anyMatch((element) -> element.contains("e")));
		System.out.println("any element have letter 'w' with noneMatch = "+ students.stream().noneMatch((element) -> element.contains("w")));
		
		System.out.print("Return first element with findFirst ");
		students.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("Chained Operation ");
		System.out.println(students.stream()
				.peek(System.out::println)
				.map(student ->
						student.concat(" - ").concat(String.valueOf(student.length())))
				.peek(System.out::println)
				.filter((student) ->
						student.toLowerCase().contains("e"))
//				.collect(Collectors.toList()));
//				.collect(Collectors.joining(", ")));
//				.collect(Collectors.toSet()));
				.collect(Collectors.groupingBy(student -> student.substring(student.indexOf("-") +1 ))));		
	}

}
