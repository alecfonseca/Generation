programa
{
	
	funcao inicio()
	{
		inteiro anos, dias, meses, media

		escreva("Quantos anos voce tem:")
		leia(anos)
		escreva("Quantos meses voce tem:")
		leia(meses)
		escreva("Quantos dias voce tem:")
		leia(dias)

		media = ((anos*360) + (meses*30) + dias)

		escreva("Sua idade em dias:" + media)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */