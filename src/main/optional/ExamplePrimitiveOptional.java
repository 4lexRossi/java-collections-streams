package main.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExamplePrimitiveOptional {
	public static void main(String[] args) {
	
		System.out.println("Integer Optional");
	OptionalInt.of(12).ifPresent(System.out::println);
	
	System.out.println("Decimal Optional");
	OptionalDouble.of(55.0).ifPresent(System.out::println);
	
	System.out.println("Long Optional");
	OptionalLong.of(25L).ifPresent(System.out::println);
	}
}
