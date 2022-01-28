package application;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		
		int numero=0, numero2=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(numero < 3) { //enquanto
			System.out.println("Olá Mundo ");
			numero++;
			
		}
		do {
			numero2++;
			System.out.println("Testando o meu faça enquanto");
			
		}while(numero2<2);
		
		//para(inicio, condição, contador)
		//for = para
		for(int num = 0; num <= 10; num++) {
			System.out.println("O numero 5 X "+num+" = "+ num*5);
			
		}

	}

}
