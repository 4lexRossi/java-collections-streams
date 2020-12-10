package main.map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {
	public static void main(String[] args) {
		Hashtable<String, Integer> students = new Hashtable<>();
		students.put("Alex", 34);
		students.put("Elis", 30);
		students.put("Davi", 11);
		students.put("Estevão", 8);
		students.put("OutSider", 20);
		
		System.out.println(students);
		
		students.put("OutSiderTwo", 22);
		System.out.println("Show list after add element "+ students);
		
		students.remove("OutSiderTwo");
		System.out.println("Show list after remove element "+ students);
		
		int studentAge = students.get("Elis");
		System.out.println("Show age with key = Elis "+ studentAge);
		
		System.out.println("Size of list "+ students.size());
		
		for (String key: students.keySet()) {
			System.out.println("treeMap of capitals displayed with for = "+key + "-" + students.get(key));
		}
		
		for (Map.Entry<String, Integer> entry: students.entrySet()) {
			System.out.println("treeMap of capitals displayed with for and map = "+entry.getKey() + "-" + entry.getValue());
		}
		
		System.out.println("Size of list before clear "+ students.size());
		students.clear();
		System.out.println("Size of list after clear "+ students.size());
	}

}
