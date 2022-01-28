package application;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte 
 * e escreva quantos valores maiores que 10 ela possui.*/

public class programEx03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		int cont = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Entre com o valor [" + i + "] [" + j + "]: ");
				matriz[i][j] = leia.nextInt();

				if (matriz[i][j] > 10) {
					cont++;
				}
			}

		}
		System.out.println(cont + " Quantidade de valores maiores que 10. ");

		leia.close();
	}

}
