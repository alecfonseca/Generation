package application;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int totalSegundos, horas, minutos, segundos;
		
		System.out.print("Entre com total de segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos /  3600 ; 
		
		minutos = (totalSegundos %  3600 ) /  60 ;
		
        segundos = (totalSegundos %  3600 ) %  60 ;
		
		
        System.out.println( " O evento durou: " + horas + " hora " );
		System.out.println( " O evento durou: " + minutos + " minutos " );
		System.out.println( " O evento durou: " + segundos + " segundos " );
		
		leia.close();
	}
}
