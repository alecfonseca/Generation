programa
{
	
	funcao inicio()
	{
		inteiro numero, cont, total, media
		numero = 1
		cont = 0
		total = 0
		media = 0
		
		enquanto(numero!=0){
			escreva("\nEntre um valor numerico: ")
			leia(numero)

			se(numero>0){
				cont++

				total += numero
			}
		}
		
		media = total/cont
		
		escreva("\nO total de números informados: " + cont)
		escreva("\nMídia: " + media)
		escreva("\nTotal: " + total)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */