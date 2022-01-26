package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
      
		double nota1, nota2, nota3, media;
     
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a nota1:");
		nota1 = leia.nextDouble();
		
		System.out.println("Entre com a nota2:");
		nota2 = leia.nextDouble();
		
		System.out.println("Entre com a nota3:");
		nota3 = leia.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5)) / 10;
		
		
		System.out.println("A média ponderada: "+media);
	}

}
