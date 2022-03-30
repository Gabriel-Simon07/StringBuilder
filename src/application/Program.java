package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		
		System.out.println("Name: ");
		String name = scanner.next();
		
		System.out.println("Email: ");
		String email = scanner.next();
		
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(scanner.next());
				
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(scanner.next()); 
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order: ");
		int quantity = scanner.nextInt();
		
		for(int i=1 ; i <= quantity; i++) {

			System.out.println("Enter #" +  i + " item data:");
			System.out.println("Product name: ");
			String productName = scanner.next();
		
			System.out.println("Product price: ");
			double productPrice = scanner.nextDouble();

			System.out.println("Quantity: ");
			int quantityProduct = scanner.nextInt();
			
			Product product = new Product(productName, productPrice);
		
			OrderItem item = new OrderItem(quantityProduct, productPrice, product);
		
			order.addItem(item);
		}
		
		System.out.println(order);
		
		scanner.close();
	}

}
