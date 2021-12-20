package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;
import exceptions.ColorNotFoundException;
import exceptions.ShapeNotFoundException;

public class Program_2 {

	public static void main(String[] args) throws ShapeNotFoundException, ColorNotFoundException   {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		List<Shape> list = new ArrayList();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of shapes:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Shape #" + i + "data:");
			System.out.print("Rectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK = b/WHITE = w/RED = r):");
			Color colors = Color.getEnumByCodigo(sc.next());

			if (ch == 'r') {

				System.out.print("Enter Width:");
				double width = sc.nextDouble();
				System.out.print("Enter Height:");
				double height = sc.nextDouble();
				list.add(new Rectangle(colors, width, height));
				
			} else if (ch == 'c') {
				System.out.print("Enter Radius:");
				double radius = sc.nextDouble();
				list.add(new Circle(colors, radius));
			} else {
			 throw new ShapeNotFoundException(ch);
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS");
		for( Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();
	}
}