package roupa;

import java.util.Scanner;
import roupa.model.Roupa;
import roupa.model.Top;
import roupa.model.Short;


public class Menu {
	public static void main(String[] args) {
		
		//Teste da Classe Roupa
		Roupa top1 = new Top(1, "Azul", "M", "Top Lyn");
		top1.exibirDetalhes();
        Roupa short1 = new Short(2, "Preto", "G", "Short Bella");
        short1.exibirDetalhes();

		Scanner sc = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                      KON FITWEAR                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Novo Pedido                          ");
			System.out.println("            2 - Editar Pedido                        ");
			System.out.println("            3 - Procurar Pedido                      ");
			System.out.println("            4 - Cancelar Pedido                      ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = sc.nextInt();

			if (opcao == 5) {
				System.out.println("\nKON Fitwear agradece sua visita!");
                 sc.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Novo Pedido\n\n");

					break;
				case 2:
					System.out.println("Editar Pedido\n\n");

					break;
				case 3:
					System.out.println("Procurar Pedido\n\n");

					break;
				case 4:
					System.out.println("Cancelar Pedido\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
}