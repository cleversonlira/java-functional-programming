package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {

		System.out.println("Without Predicate");
		System.out.println(isPhoneNumberValid("11123456789"));
		System.out.println(isPhoneNumberValid("1112345678"));
		System.out.println(isPhoneNumberValid("112345678"));
		
		System.out.println("\nWith Predicate");
		System.out.println(isPhoneNumberValid.test("11123456789"));
		System.out.println(isPhoneNumberValid.test("1112345678"));
		System.out.println(isPhoneNumberValid.test("112345678"));
		
		System.out.println("\nContains number Three? " + containsNumber3.test("112345678"));
		System.out.println("Contains number Three? " + containsNumber3.test("112845678"));
		System.out.println("\nIs number valid and contains number Three? " + isPhoneNumberValid.and(containsNumber3).test("112845678"));
		System.out.println("Is number valid and contains number Three? " + isPhoneNumberValid.or(containsNumber3).test("1132845678"));
		System.out.println("Is number valid and contains number Three? " + isPhoneNumberValid.and(containsNumber3).test("11123456789"));
		
		
	}
	
	//Normal Java Function
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.length() == 11 && phoneNumber.startsWith("11");
	}
	
	//Predicate Java Function
	static Predicate<String> isPhoneNumberValid = (phoneNumber) -> phoneNumber.length() == 11 && phoneNumber.startsWith("11");

	static Predicate<String> containsNumber3 = phoneNumer -> phoneNumer.contains("3");
	
}
