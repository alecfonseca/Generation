programa
{

    funcao inicio()
    {
        inteiro i, x=20, nFilhos, totalFilhos=0, mediaFilhos=0
        real salario, totalSalario=0.0, mediaSalario=0.0, maiorSalario=0.0

        para(i=0;i<x;i++){
            escreva("\nEntre com salário: ")
            leia(salario)

            escreva("\nEntre com numero de filhos: ")
            leia(nFilhos)

            totalSalario += salario
            mediaSalario = totalSalario / x

            totalFilhos += nFilhos
            mediaFilhos = totalFilhos / x
        }
           escreva(totalSalario)
           escreva(mediaFilhos)

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */