package atividades;

import java.util.Scanner;

public class Atvd04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 1;
		int numeros = 0;
		int media = 0;
		int cont = 0;

		while (n != 0) {

			System.out.print("Digite um numero par: ");
			numeros = sc.nextInt();
			n = numeros;

			if (numeros % 2 == 0 && numeros != 0) {
				media += numeros;
				cont += 1;

			} else if (numeros % 2 > 0) {
				System.out.println("Esse numero não é par!!!!!");
			}

		}

		System.out.println("Media dos números pares digitados: " + media / cont);

	}

}
