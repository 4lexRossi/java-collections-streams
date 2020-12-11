package main.optional;

import java.util.Optional;

public class ExampleOptional {
	public static void main(String[] args) {
		
	Optional<String> optionalString = Optional.of("Optional Value"); 
	
	System.out.println("Is present? "+ optionalString.isPresent());
	System.out.println("Is empty? "+ optionalString.isEmpty());
	
	optionalString.ifPresent(System.out::println);
	
	optionalString.ifPresentOrElse(System.out::println,
			() -> System.out.println("Value is not present"));
	if (optionalString.isPresent()) {
		String valor = optionalString.get();
		System.out.println(valor);
	}
	optionalString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
	
	System.out.println("print Value before empty = "+ optionalString.orElseThrow(IllegalStateException::new));
	optionalString = Optional.empty();
	System.out.println(optionalString.orElseThrow(IllegalStateException::new));
	}
}
