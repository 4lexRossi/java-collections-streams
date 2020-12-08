package main.list.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Estevão");
		names.add("Davi");
		names.add("Elis");
		names.add("Alex");
		names.add("Teste");		
		System.out.println("List with ArrayList = "+ names);
		
		names.set(2, "TesteDois");
		System.out.println(names);
		
		Collections.sort(names);
		
		names.set(2, "testeTres");		
		System.out.println(names);
			
		names.remove("TesteDois");
		System.out.println(names);
		names.add("TesteDois");
		System.out.println(names);
		names.set(4, "Estevão");	
		System.out.println(names);
		
		names.set(2, "Elis");		
		System.out.println(names);
		
		String name = names.get(2);
		System.out.println("Meu amor "+ name);
		
		int position = names.indexOf("Alex");
		System.out.println("Alex is in Array position = " +position);
		
		int arraySize = names.size();
		System.out.println("Array Size = " + arraySize);
		
		boolean hasName = names.contains("Teste2");		
		System.out.println("There is a Teste2 on Array List? Anwser: " + hasName);
		
		boolean isListEmpty = names.isEmpty();
		System.out.println("Before Clear = " + isListEmpty);
		
		for (String itemName: names) {
			System.out.println("Showing for each items = " + itemName);
		}
		
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println("Showing Iterator items = " + iterator.next());
		}
		
		names.clear();
		isListEmpty = names.isEmpty();
		System.out.println("Showing Array after clear = " + names);
		System.out.println("After Clear = " + isListEmpty);
	}
}
