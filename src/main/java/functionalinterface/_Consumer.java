package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
				
		//Normal Java function
		Customer maria = new Customer("Maria", "99999");
		greetCustomer(maria);
		
		//Functional Interface (Consumer)
		greetCustomer.accept(maria);
		
	}
	
	static Consumer<Customer> greetCustomer = customer -> System.out.println("Hello " + customer.name + 
			"\nthanks for registering phone number: " + customer.phoneNumer);
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.name + 
				"\nthanks for registering phone number: " + customer.phoneNumer);
	}

	static class Customer {
		private final String name;
		private final String phoneNumer;
		
		public Customer(String name, String phoneNumber) {
			this.name = name;
			this.phoneNumer = phoneNumber;
		}
		
	}
	
}
