programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][3], somaNumeros=0, somaDiagonal=0, linha, coluna

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um valor: ")
				leia(numeros[linha][coluna])
				somaNumeros += numeros[linha][coluna]

                    se(linha == coluna)
                    {
                    	somaDiagonal += numeros[linha][coluna]
                    }
				
			}
			escreva("\nSomatório dos valores da matriz: "+ somaNumeros)
			escreva("\nSomatório dos valores diagonal: "+ somaDiagonal)
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */