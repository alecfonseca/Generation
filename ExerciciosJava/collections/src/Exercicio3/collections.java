package Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class collections {
	public static void main(String[] args) {

		int op;
		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList<String>();

		do {
			System.out.println("\n----------------------------------------------------------");
			System.out.println("\n1 - adicionar um produto no estoque?");
			System.out.println("\n2 - remover um produto do estoque?");
			System.out.println("\n3 - atualizar um produto no estoque?");
			System.out.println("\n4 - mostrar todos os produtos do estoque");
			System.out.println("\n0 - Deseja encerrar o programa?");
			System.out.println("\n----------------------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nAdicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nRemover do estoque: ");
				String produtor = leia.nextLine();
				if (estoque.contains(produtor)) {
					estoque.remove(produtor);
				} else {
					System.out.println("\nProduto sem estoque !");
				}
					System.out.println(estoque);
				break;

			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o produto que entrará no lugar do(a) " + verifica + " : ");
				String novo = leia.nextLine();

				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nProduto sem estoque !");
				}
				System.out.println(estoque);
				break;

			case 4:
				System.out.println("\nOs produtos que temos no estoque são: ");
				System.out.println(estoque);
				break;

			default:
				if (op == 0) {
					System.out.println("\n\t\tOBRIGADO");
				} else {
					System.out.println("\nOpção invalida, por favor digite uma opção...");
				}
			}

		} while (op != 0);
	}

}
