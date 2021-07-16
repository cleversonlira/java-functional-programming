package finalsection;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		hello("Jhon", null, value -> {
			System.out.println("No lastName provided for " + value);
		});

		hello2("Jhon", null, () -> {
			System.out.println("No lastName provided");
		});

	}

	static void hello(String name, String lastName, Consumer<String> callBack) {
		System.out.println(name);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callBack.accept(name);
		}
	}

	static void hello2(String name, String lastName, Runnable callBack) {
		System.out.println(name);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callBack.run();
		}
	}

//	function hello(name, lastName, callBack()) {
//		console.log(name);
//		if(lastName) {
//			console.log(lastName);
//		} else {
//			callBack();
//		}
//	}

}
