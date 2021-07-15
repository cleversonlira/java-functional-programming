package combinatorpattern;

import java.time.LocalDate;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer("Alice", "alice@mail", "11982428106", LocalDate.of(2011, 1, 1));
		CustomerValidatorService validatorService = new CustomerValidatorService();
		System.out.println(validatorService.isValid(customer));
		
		//Using combinator Pattern
		
		System.out.println(
			CustomerRegistrationValidator
			.isEmailValid()
			.and(CustomerRegistrationValidator.isEmailValid())
			.and(CustomerRegistrationValidator.isPhoneNumberValid())
			.and(CustomerRegistrationValidator.isAdult())
			.apply(customer)
		);
		
		ValidationResult result = CustomerRegistrationValidator
				.isEmailValid()
				.and(CustomerRegistrationValidator.isEmailValid())
				.and(CustomerRegistrationValidator.isPhoneNumberValid())
				.and(CustomerRegistrationValidator.isAdult())
				.apply(customer);
		
		System.out.println();
		
	}

}
