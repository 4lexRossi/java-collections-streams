package main.optional;

import java.util.Optional;

public class ExampleOptionalStates {
	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Value is present");
		System.out.println("Optional value is present?");
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Its not present"));
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		System.out.println("Optional value is present?");
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("null = Its not present"));
		
		Optional<String> optionalEmpty = Optional.empty();
		System.out.println("Optional value is present?");
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Its not present"));
		
		System.out.println("Optional value is present, if not NullPointerException");
		Optional<String> optionalNullError = Optional.of(null);
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("error = Its not present"));
	}
}
