package atividades;

import java.util.Scanner;

public class Atvd02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = 1;
		int contador = 0;
		while (n != -1) {
			n = sc.nextInt();
			contador += n;

		}
		System.out.println("TOTAL: " + contador);
	}

}
