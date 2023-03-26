package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double heigth) {
		super(color);
		this.width = width;
		this.height = heigth;
	}
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return height;
	}

	public void setHeigth(Double heigth) {
		this.height = heigth;
	}

	@Override
	public double area() {
		return width * height;
	}
}
