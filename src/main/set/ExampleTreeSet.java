package main.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeCapitals = new TreeSet<>();
		treeCapitals.add("Porto Alegre");
		treeCapitals.add("Florianópolis");
		treeCapitals.add("Curitiba");
		treeCapitals.add("São Paulo");
		treeCapitals.add("Rio de Janeiro");
		treeCapitals.add("Belo Horizonte");
		treeCapitals.add("Manaus");
		treeCapitals.add("Vitória");
		System.out.println("tree of capitals = "+ treeCapitals);
		System.out.println("amount of itens in tree = "+ treeCapitals.size());
				
		System.out.println("First capital of tree = "+ treeCapitals.first());
		
		System.out.println("Last capital of tree = "+ treeCapitals.last());
		
		System.out.println("Capital index lower then Florianópolis = "+ treeCapitals.lower("Florianópolis"));
		
		System.out.println("Capital index higher then Florianópolis = "+ treeCapitals.higher("Florianópolis"));
		
		System.out.println("tree of capitals before pooling = "+ treeCapitals);		
		System.out.println("Remove with pollFirst the first capital = "+ treeCapitals.pollFirst());
		System.out.println("Remove with pollLast the last capital = "+ treeCapitals.pollLast());
		System.out.println("tree of capitals after pooling = "+ treeCapitals);
	}
}
