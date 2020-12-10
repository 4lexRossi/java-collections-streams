package main.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
	public static void main(String[] args) {
		TreeMap<String, String> treeMapCapitals = new TreeMap<>();
		treeMapCapitals.put("RS", "Porto Alegre");
		treeMapCapitals.put("SC", "Florianópolis");
		treeMapCapitals.put("PR", "Curitiba");
		treeMapCapitals.put("SP", "São Paulo");
		treeMapCapitals.put("RJ", "Rio de Janeiro");
		treeMapCapitals.put("MG", "Belo Horizonte");
		treeMapCapitals.put("AM", "Manaus");
		treeMapCapitals.put("ES", "Vitória");
		System.out.println("treeMapMap of capitals = "+ treeMapCapitals);
		
		System.out.println("amount of itens in treeMap = "+ treeMapCapitals.size());
		
		System.out.println("First Key capital of treeMap = "+ treeMapCapitals.firstKey());		
		System.out.println("Last Key capital of treeMap = "+ treeMapCapitals.lastKey());	
		
		System.out.println("Capital Key index lower then Florianópolis = "+ treeMapCapitals.lowerKey("Florianópolis"));		
		System.out.println("Capital Key index higher then Florianópolis = "+ treeMapCapitals.higherKey("Florianópolis"));
		
		System.out.println("First Key and value capital of treeMap = "+ treeMapCapitals.firstEntry().getKey()+ " - "+ treeMapCapitals.firstEntry().getValue());
		System.out.println("First Key and value capital of treeMap = "+ treeMapCapitals.lastEntry().getKey()+ " - "+ treeMapCapitals.lastEntry().getValue());
		
		System.out.println("First key and value lower then SC in treeMap = "+ treeMapCapitals.lowerEntry("SC").getKey()+ " - "+ treeMapCapitals.lowerEntry("SC").getValue());
		System.out.println("First key and value higher then SC in treeMap = "+ treeMapCapitals.higherEntry("SC").getKey()+ " - "+ treeMapCapitals.higherEntry("SC").getValue());
		
		System.out.println("treeMap of capitals before pooling = "+ treeMapCapitals);
		
		System.out.println("Remove with pollFirst the first capital = "+ treeMapCapitals.pollFirstEntry());
		System.out.println("treeMap of capitals after pooling first entry = "+ treeMapCapitals);
		System.out.println("Remove with pollLast the last capital = "+ treeMapCapitals.pollLastEntry());
		System.out.println("treeMap of capitals after pooling last entry = "+ treeMapCapitals);
		
		Iterator<String> iterator = treeMapCapitals.keySet().iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("treeMap of capitals displayed with while = "+ key +" - "+treeMapCapitals.get(key));;
		}
		
		for (String capital: treeMapCapitals.keySet()) {			
			System.out.println("treeMap of capitals displayed with for = "+ capital +" -- "+treeMapCapitals.get(capital));
		}
		
		for (Map.Entry<String, String> capital: treeMapCapitals.entrySet()) {			
			System.out.println("treeMap of capitals displayed with for and map = "+ capital.getKey() +" --- "+capital.getValue());
		}
	}
}
