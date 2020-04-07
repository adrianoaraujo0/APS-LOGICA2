package atividades;

import java.util.Scanner;

public class Atvd01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("QUAL OPERAÇÃO VC QUER REALIZAR? (+,-,*,/): ");
		char simbolo = sc.next().charAt(0);
		System.out.print("DIGITE DOIS NUMEROS: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int resultado = 0;

		switch (simbolo) {

		case '+':
			resultado = n1 + n2;
			break;
		case '-':
			resultado = n1 - n2;
			break;
		case '*':
			resultado = n1 * n2;
			break;
		case '/':
			resultado = n1 / n2;
			break;

		}

		System.out.println("resultado: " +  resultado);

	}

}
