package atividades;

public class Atvd05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;
		int c = 4;

		if (a == b && a == c) {
			System.out.println("Triangulo Equilátero");
		} else if (a == b || a == c || b == c) {
			System.out.println("Triangulo isóceles");
		} else {
			System.out.println("Triangulo Escaleno");
		}

	}

}
