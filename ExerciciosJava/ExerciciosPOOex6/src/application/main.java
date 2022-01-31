package application;

import Entities.conta;

public class main {
	public static void main(String[] args) {
		conta contaAle = new conta("Alessandro Castro", "Santander", 600);
		
		System.out.println(contaAle.getSaldo());
		
		contaAle.deposito(200.00);
		
		System.out.println(contaAle.getSaldo());
		
		//contaAle.saque(700);
		
		System.out.println("Foi sacado " + contaAle.saque(700) + " e o total em conta agora é :" + contaAle.getSaldo());
	}
}

