package main.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ExampleVector {
	public static void main(String[] args) {
		List<String> sports = new Vector<>();
		
		sports.add("Soccer");
		sports.add("Basketball");
		sports.add("Football");
		sports.add("Tennis");
		System.out.println("List with Vector = "+ sports);
		
		sports.set(2, "Ping Pong");
		System.out.println("Change index 2 to Ping Pong = "+ sports);
		
		sports.remove(2);
		sports.remove("Tennis");
		System.out.println("Remove index 2 and Tennis in Vector = "+ sports);
		
		System.out.println("Showing index 0 in Vector = "+ sports.get(0));
		
		for (String sport: sports) {
			System.out.println("Showing for each in Vector = "+ sport);
		}
		
		Iterator<String> iteratorSports = sports.iterator();
		while (iteratorSports.hasNext()) {
			System.out.println("Showing Iterator in Vector sports = " + iteratorSports.next());
		}
		
		List<String> sportsBack = new Vector<>();
		sportsBack.add("Football");
		sportsBack.add("Tennis");
		
		Iterator<String> iteratorSportsBack = sportsBack.iterator();
		while (iteratorSportsBack.hasNext()) {
			System.out.println("Showing Iterator in Vector sportsBack = " + iteratorSportsBack.next());
		}
		
		List<String> originalVector = new Vector<>();
				
		originalVector.addAll(sports);
		originalVector.addAll(sportsBack);
		System.out.println("Showing sports and sportsBack concat Vector = " + originalVector);
		
		Collections.sort(originalVector);
		System.out.println("Sort, concat and show sports and sportsBack in Vector = " + originalVector);
		
		List<Integer> numbers = new Vector<>();
		numbers.add(2);
		numbers.add(1);
		numbers.add(5);
		System.out.println("Showing itens in numbers Vector = " + numbers);
		
		List<Integer> numbers2 = new Vector<>();
		numbers2.add(3);
		numbers2.add(0);
		numbers2.add(4);
		System.out.println("Showing itens in numbers2 Vector = " + numbers2);
		
		List<Integer> concatNumbers = new Vector<>();
		
		concatNumbers.addAll(numbers);
		concatNumbers.addAll(numbers2);
		System.out.println("Concat and Show numbers and numbers2 in Vector = " + concatNumbers);
		
		Collections.sort(concatNumbers);
		System.out.println("Sort, concat and show numbers and numbers2 in Vector = " + concatNumbers);
	}
}	
