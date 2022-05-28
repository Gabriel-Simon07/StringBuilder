package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import employee.Employee;
import employee.OutsourcedEmployee;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employees: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.println("Outsourced (y/n)?");
			char ch = scanner.next().charAt(0);
			System.out.println("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Hours: ");
			int hours = scanner.nextInt();
			System.out.print("Value per hour: ");
			double value = scanner.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				 double additional = scanner.nextDouble();
				 list.add(new OutsourcedEmployee(name, hours, value, additional));
			} else {
				list.add(new Employee(name, hours, value));			
			}
		}
		
		System.out.println();
		System.out.print("PAYMENTS\n");
		for(Employee emp : list) {		
			System.out.println(emp);
		}
		scanner.close();
	}

}
