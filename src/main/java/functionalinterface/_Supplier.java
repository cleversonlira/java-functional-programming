package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		System.out.println(getDBConnectionUrl());
		System.out.println(getDBConnectionUrl.get());
	}

	
	static Supplier<List<String>> getDBConnectionUrl = () -> (
		List.of("jdbc://localhodst:3346/users")		
	); 
	
	static String getDBConnectionUrl() {
		return "jdbc://localhodst:3346/users";
	}
	
}
