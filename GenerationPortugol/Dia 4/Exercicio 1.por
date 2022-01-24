programa
{
	// Faça um programa que chore um vetor por leitura com 5 valores de 
	//pontuação de uma atividade e o escreva em seguida. Encontre após
	//a maior avaliação e apresentação.
	
	funcao inicio()
	{
		inteiro vec[5], maiorNumero=0

		para(inteiro i=0;i<5;i++){
			escreva("\nEntre valores numéricos: ")
			leia(vec[i])
		}

		para(inteiro i=0;i<5;i++){
			se(vec[i] > maiorNumero){
				maiorNumero = vec[i]
			}
		}

		escreva("\nO maior numero é: " + maiorNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorNumero, 9, 18, 11}-{vec, 9, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */