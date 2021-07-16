package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

	public static void main(String[] args) {

		Function<String, String> upperCase = name -> name.toUpperCase();
		
		BiFunction<String, Integer, String> upperCaseAndPrintAge = (name, age) -> {
			System.out.println(age);
			return name.toUpperCase();
		};
		
		System.out.println(upperCase.apply("Jhon"));
		System.out.println(upperCaseAndPrintAge.apply("Jhon", 30));
		
	}

}
