package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class ShapesMain {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shapesList = new ArrayList<>();
		System.out.println("Enter the number of shapes: ");
		int numberShapes = sc.nextInt();

		for (int i = 1; i <= numberShapes; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.println("Rectangle or Circle (r/c)");
			char shape = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED) :");
			Color color = Color.valueOf(sc.next());
			
			if(shape == 'r') {
				System.out.println("Width:");
				double width = sc.nextDouble();
				System.out.println("Height:");
				double height = sc.nextDouble();
				shapesList.add(new Rectangle(width, height, color));
			} else {
				System.out.println("Radius:");
				double radius = sc.nextDouble();
				shapesList.add(new Circle(radius));
			}
		}
			System.out.println("\nSHAPES AREAS:\n");
			for(Shape shapes : shapesList) {
				System.out.println(String.format("%.2f", shapes.area()));
			}
		sc.close();
	}
}
