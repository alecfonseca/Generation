/*2) Elabore um sistema que leia as variáveis C e N, respectivamente 
 * código e número de horas trabalhadas de um operário. 
 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na 
 * variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
 * No final do processamento imprimir o salário total e o salário excedente.
*/


programa
{
	
	funcao inicio()
	{      
	       real N, E, salarioTotal, salarioEx
	       cadeia C

	       escreva("Qual o nome do funcionário:")
	       leia(C)
	       
	       escreva("Quantas horas o funcionario trabalho:")
	       leia(N)

	       se (N > 50) {
	       	E = N - 50
	       	salarioEx = (E * 20.0)
	       	salarioTotal = (50 * 10.0) + (E * 20.0)

	       	escreva("Seu salário excedente é de: R$" + salarioEx +
	       	"\nSeu salario total é de: R$" + salarioTotal)
	       		       	
	       } senao se (N <= 50 e N > 0){

	       	salarioTotal = N * 10
	       	escreva("Seu salário é de: R$" + salarioTotal)
	       	
	       } senao se (N <= 0) {

	       	escreva(C+ "Voce nao trabalhou !!")
	       	
	       	
	       }

	     

	       
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */