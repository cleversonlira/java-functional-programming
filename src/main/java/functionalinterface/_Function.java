package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {
		int increment = incrementByOneFunction(2);
		System.out.println(increment);

		int increment2 = incrementByOneFunction.apply(2);
		System.out.println(increment2);
		

		int multiply = multiplyBy10(10);
		System.out.println(multiply);
		
		int multiply2 = multiplyBy10.apply(10);
		System.out.println(multiply2);
		
		int incrementAndMultiply = multiplyBy10(incrementByOneFunction(9));
		System.out.println("Both: " + incrementAndMultiply);
		
		int incrementAndMultiply2 = incrementOneAndMultiplyBy10.apply(9);
		System.out.println("Both: " + incrementAndMultiply2);
		
		
		double sumAndMultiply = _Function.sumAndMultiply.apply(10, 3);
		System.out.println("Both: " + sumAndMultiply);
		
		double sumAndMultiply2 = sumAndMultiply(10, 3);
		System.out.println("Both: " + sumAndMultiply2);
		
	}

	//
	static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

	static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
	
	static Function<Integer, Integer> incrementOneAndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);
	
	static BiFunction<Integer, Integer, Double> sumAndMultiply = (firstNumber, secondNumber) -> (firstNumber + secondNumber) * 1.5;

	static int incrementByOneFunction(int number) {
		return ++number;
	}

	static int multiplyBy10(int number) {
		return number * 10;
	}
	
	static Double sumAndMultiply(int firstNumber, int secondNumber) {
		return (firstNumber + secondNumber) * 1.5;
	}
	
}
