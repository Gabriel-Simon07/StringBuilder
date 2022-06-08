package entities;

import enums.Color;

public class Rectangle extends Shape {

	private double width;
	private double height;
	private Color color;
	
	public Rectangle() {}

	public Rectangle(double width, double height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public double area() {
		return height * width;
	}
}
