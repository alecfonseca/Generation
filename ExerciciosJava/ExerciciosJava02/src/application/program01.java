package application;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

public class program01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n = 0, maior = 0;

		for (int x = 0; x < 3; x++) {
			System.out.println("Entre com um número; ");
			n = leia.nextInt();

			if (n > maior) {
				maior = n;
			}

		}

		System.out.println("Maior numero é: " + maior);

		leia.close();
	}

}
