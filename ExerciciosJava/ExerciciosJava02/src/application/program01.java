package application;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class program01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n = 0, maior = 0;

		for (int x = 0; x < 3; x++) {
			System.out.println("Entre com um n�mero; ");
			n = leia.nextInt();

			if (n > maior) {
				maior = n;
			}

		}

		System.out.println("Maior numero �: " + maior);

		leia.close();
	}

}
