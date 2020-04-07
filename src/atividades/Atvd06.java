package atividades;

public class Atvd06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// x = horas trabalhadas
		// y = valor da hr

		double x = 70;
		double y = 5.50;

		double total = x * y;

		if (x <= 40) {
			System.out.println("Salario: " + total);

		} else if (x > 40 && x <= 60) {

			System.out.println("Salario: " + total);
			System.out.println("Bonus: " + total * 0.5);
			System.out.println("Total: " + ((total * 0.5) + (total)));
		} else if (x > 60) {

			System.out.println("Salario: " + total);
			System.out.println("Bonus: " + total);
			System.out.println("Total: " + total * 2);
		}

	}

}
