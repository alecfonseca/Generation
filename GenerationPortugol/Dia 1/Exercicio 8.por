programa
{
	
	funcao inicio()
	{
		inteiro precoDistri, precoFabri, precoCons, distribuidor, consumidor
          real distr, imposto

          escreva("Preço de fabrica:")
          leia(precoFabri)
         
          imposto = 0.45
          distr = 0.28
		precoDistri = (precoFabri * distr)
		distribuidor = (precoDistri+precoFabri)
		precoCons = (distribuidor*imposto)
		consumidor = (precoCons+distribuidor)

		escreva("\nPreço de distribuidor:"+distribuidor)
		escreva("\nPreco para consumidor:"+consumidor)
		


		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */