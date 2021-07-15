package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static streams._Stream.Gender.MALE;
import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.PREFER_NOT_TO_SAY;
import imperative.Main.Gender;
import imperative.Main.Person;

public class _Stream {

	public static void main(String[] args) {

		List<Person> people = List.of(
				new Person("Jhon", MALE), 
				new Person("Maria", FEMALE),
				new Person("Aisha", FEMALE), 
				new Person("Alex", MALE), 
				new Person("Alice", FEMALE),
				new Person("Bob", Gender.PREFER_NOT_TO_SAY),
				new Person("Marley", Gender.PREFER_NOT_TO_SAY)
		);
		
		people.stream()
		.map(person -> person.name)
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		people.stream()
		.map(Person::getName)
		.mapToInt(String::length)
		.forEach(System.out::println);
		
		
		Function<Person, String> personStringFunction = person -> person.name;
		ToIntFunction<String> length = String::length;
		IntConsumer println = System.out::println;
		
		people.stream()
		.map(personStringFunction)
		.mapToInt(length)
		.forEach(println);

	}

	public static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}
		
		public String getName() {
			return this.name;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	public enum Gender {
		MALE, FEMALE, PREFER_NOT_TO_SAY;
	}

}
