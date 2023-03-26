package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Shape> listShapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int numberShapes = scan.nextInt();
		
		for (int i=0; i<numberShapes; i++) {
			System.out.println("Shape #"+ (i+1) + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = scan.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = scan.nextDouble();
				System.out.print("Height: ");
				double height = scan.nextDouble();
				listShapes.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = scan.nextDouble();
				listShapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println("\nSHAPE AREAS: ");
		for (Shape shape: listShapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		scan.close();
	}

}
