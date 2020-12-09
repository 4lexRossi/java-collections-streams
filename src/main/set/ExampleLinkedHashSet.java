package main.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> numberSequences = new LinkedHashSet<>();
		numberSequences.add(1);
		numberSequences.add(2);
		numberSequences.add(4);
		numberSequences.add(8);
		numberSequences.add(16);
		numberSequences.add(11);
		numberSequences.add(9);
		numberSequences.add(21);
		System.out.println("List of numbers = "+ numberSequences);
		System.out.println("amount of itens in list = "+ numberSequences.size());
		
		numberSequences.remove(4);
		System.out.println("List of grades after remove 4 = "+ numberSequences);		
		System.out.println("amount of itens in list after remove 4 = "+ numberSequences.size());		
		
		Iterator<Integer> iterator = numberSequences.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("List of numbers after iterated = "+ iterator.next());
		}
		
		for(Integer numberSequence: numberSequences) {
			System.out.println("List of numbers with for each = "+ numberSequence);
		}
		
		System.out.println("List of numbers before clear isEmpty? "+ numberSequences.isEmpty());
		numberSequences.clear();
		System.out.println("List of numbers after clear = "+ numberSequences);
		System.out.println("List of numbers after clear isEmpty? "+ numberSequences.isEmpty());		
	}
}
