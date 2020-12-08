package main.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {
	public static void main(String[] args) {
		Queue<String> bankRow = new LinkedList<>();
		
		bankRow.add("Estevão");
		bankRow.add("Davi");
		bankRow.add("Elis");
		bankRow.add("Alex");
		bankRow.add("Teste");
		System.out.println("List with Queue and LinkedList = "+ bankRow);
		
		String callClientInLine = bankRow.poll();
		System.out.println("poll display item = "+ callClientInLine);
		System.out.println("Showing list after poll = "+ bankRow);
		
		String firstClientPeek = bankRow.peek();
		System.out.println("peek display item = "+ firstClientPeek);
		System.out.println("Showing list after peek = "+ bankRow);

		String callClientInLineOrException = bankRow.element();
		System.out.println("element display item = "+ callClientInLineOrException);
		System.out.println("Showing list after element = "+ bankRow);
		
		for (String client: bankRow) {
			System.out.println("Display client with for each = "+ client);
		}
		
		Iterator<String> iteratorClient = bankRow.iterator();
		while (iteratorClient.hasNext()) {
			System.out.println("Display client with iterator = "+iteratorClient.next());
		}
		
		bankRow.add("Wesley");
		System.out.println("list with Wesley at the last position? "+ bankRow);
		
		boolean getClientIfExists = bankRow.contains("Alex");
		System.out.println("Alex exist in list? "+ getClientIfExists);
		getClientIfExists = bankRow.contains("Jack");
		System.out.println("Jack exist in list? "+ getClientIfExists);
		
		bankRow.clear();		
		callClientInLine = bankRow.poll();
		firstClientPeek = bankRow.peek();
		
		System.out.println("this list is empty? "+ bankRow.isEmpty());		
		System.out.println("Showing list after clear() = "+ bankRow);
		System.out.println("poll display item after clear() = "+ callClientInLine);
		System.out.println("peek display item after clear() = "+ firstClientPeek);
		
		getClientIfExists = bankRow.contains("Alex");
		System.out.println("Alex exist in list after clear? "+ getClientIfExists);		
		
		callClientInLineOrException = bankRow.element();
		System.out.println("element display item after clear() = "+ callClientInLineOrException);
	}
}
