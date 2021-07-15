package combinatorpattern;

import java.time.LocalDate;

public class Customer {

	private final String nome;
	private final String email;
	private final String phoneNumber;
	private final LocalDate dob;
	
	public Customer(String nome, String email, String phoneNumber, LocalDate dob) {
		super();
		this.nome = nome;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public LocalDate getDob() {
		return dob;
	}

}
