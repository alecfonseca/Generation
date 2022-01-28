package application;

/*1- Faça um programa que possua um vetor denominado 
 * A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples)
 a soma entre os valores das posições A[0], A[1] e A[5] do vetor 
 e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

public class programEx01 {

	public static void main(String[] args) {
		
		int [] v = new int[6];
		
		v[0] = 1;
		v[1] = 0;
		v[2] = 5;
		v[3] = -2;
		v[4] = -5;
		v[5] = 7;
		
		int soma = v[0] + v[1]+ v[5];
		System.out.println("A soma das posições 1, 2 e 5 è: " +soma);
		
		v[3] = 100;
		
		for(int i=0; i<v.length; i++) {
			System.out.println("O valor da posição " + (i+1) + " è: "+v[i]);
		}
	}

}
