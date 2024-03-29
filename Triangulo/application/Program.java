package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		double areaX, areaY;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os valores do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b= sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Área do triangulo X: %.4f%n", areaX);
		System.out.printf("Área do triangulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior área: X");
		}else {
			System.out.println("Maior área: Y");
		}
		
		
		sc.close();
	}

}
