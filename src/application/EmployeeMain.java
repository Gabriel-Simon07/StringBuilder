package application;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		System.out.println("Enter the number of employees: ");
		
		scanner.close();
	}

}
