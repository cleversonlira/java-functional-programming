package optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		
		
		Object value = Optional.ofNullable("Hello")
		//.orElseGet(() -> "default value");
		.orElseThrow(() -> new IllegalArgumentException("exception"));		
		System.out.println(value);
		
		Optional.ofNullable("Hello").ifPresent(System.out::println);
		Optional.ofNullable(null).ifPresentOrElse(System.out::println, () -> {System.out.println("Não há");});
		
		
	}

}
