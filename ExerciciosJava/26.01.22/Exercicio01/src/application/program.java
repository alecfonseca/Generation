package application;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Entre com a idade: ");
		double anos = leia.nextDouble();
		
		System.out.print("Entre com os meses: ");
		double meses = leia.nextDouble();
		
		System.out.print("Entre com os dias: ");
	    double dias = leia.nextDouble();
	    
	    double total = 0;
	    		total += dias;
	    		total += (meses * 30);
	    		total += (anos * 365);
	    		
	    		System.out.printf("O total em dias é: %.2f", total);
	    		
		
		
		
		
		
		
		leia.close();
	
	}

}
