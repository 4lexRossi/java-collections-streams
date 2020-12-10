package main.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
		public static void main(String[] args) {
			Map<String, Integer> fifaWorldChampion = new HashMap<>();
			fifaWorldChampion.put("Brazil", 5);
			fifaWorldChampion.put("Germain", 4);
			fifaWorldChampion.put("Italy", 4);
			fifaWorldChampion.put("Uruguai", 2);
			fifaWorldChampion.put("Argentina", 2);
			fifaWorldChampion.put("France", 2);
			fifaWorldChampion.put("England", 1);
			fifaWorldChampion.put("Espain", 1);
			System.out.println(fifaWorldChampion);
			
			fifaWorldChampion.put("Brazil", 6);
			System.out.println("After Changed Brazil to 6 = "+fifaWorldChampion);
			
			System.out.println("Get to show England value = "+fifaWorldChampion.get("England"));
			
			System.out.println("France key exists in HasMap? "+fifaWorldChampion.containsKey("France"));
			fifaWorldChampion.remove("France");
			System.out.println("France key exists in HasMap after remove it? = "+fifaWorldChampion.containsKey("France"));
			
			System.out.println("Exists value 6 on HashMap? = "+fifaWorldChampion.containsValue(6));			
			System.out.println("How many items on HashMap? = "+fifaWorldChampion.size());
			
			for (Map.Entry<String, Integer> entry: fifaWorldChampion.entrySet()) {
				System.out.println(entry.getKey() + "--" + entry.getValue());
			}
			
			System.out.println("How many items on HashMap before clear? = "+fifaWorldChampion.size());
			fifaWorldChampion.clear();
			System.out.println("How many items on HashMap after clear? = "+fifaWorldChampion.size());
		}
}
