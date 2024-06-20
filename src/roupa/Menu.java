package roupa;

import java.util.Scanner;
import roupa.model.Roupa;
import roupa.model.Top;
import roupa.model.Short;

public class Menu {

	private static void adicionarRoupa(Scanner sc, Top top, Short roupaShort) {

		System.out.println("Qual opção deseja adquirir: 1 -  Top ou 2 - Short");

		int opcaoRoupa = sc.nextInt();

		while (opcaoRoupa != 2 || opcaoRoupa != 1) {
			if (opcaoRoupa == 1) {
				System.out.println("Insira as características da sua roupa: código, cor, tamanho e tipo");
				int codigo = sc.nextInt();
				String cor = sc.nextLine();
				String tamanho = sc.nextLine();
				String tipo = sc.nextLine();

				Top novoTop = new Top(codigo, cor, tamanho, tipo);
				top.novoPedido(novoTop);

			} else if (opcaoRoupa == 2) {
				System.out.println("Insira as características da sua roupa: código, cor, tamanho, estilo e tipo");
				int codigo = sc.nextInt();
				String cor = sc.nextLine();
				String tamanho = sc.nextLine();
				String estilo = sc.nextLine();
				String tipo = sc.nextLine();

				Short novoShort = new Short(codigo, cor, tamanho, estilo, tipo);
				roupaShort.novoPedido(novoShort);

			} else {
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void atualizarRoupa(Scanner sc, Top top, Short roupaShort) {

		System.out.println("Qual opção deseja atualizar: 1 -  Top ou 2 - Short");

		int opcaoRoupa = sc.nextInt();

		while (opcaoRoupa != 2 || opcaoRoupa != 1) {
			if (opcaoRoupa == 1) {
				System.out.println("Insira as características da sua roupa: código, cor, tamanho e tipo");
				int codigo = sc.nextInt();
				String cor = sc.nextLine();
				String tamanho = sc.nextLine();
				String tipo = sc.nextLine();

				Top novoTop = new Top(codigo, cor, tamanho, tipo);
				top.editarPedido(codigo, novoTop);

			} else if (opcaoRoupa == 2) {
				System.out.println("Insira as características da sua roupa: código, cor, tamanho, estilo e tipo");
				int codigo = sc.nextInt();
				String cor = sc.nextLine();
				String tamanho = sc.nextLine();
				String estilo = sc.nextLine();
				String tipo = sc.nextLine();

				Short novoShort = new Short(codigo, cor, tamanho, estilo, tipo);
				roupaShort.editarPedido(codigo, novoShort);

			} else {
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void cancelarRoupa(Scanner sc, Top top, Short roupaShort) {

		System.out.println("Qual opção deseja cancelar: 1 -  Top ou 2 - Short");

		int opcaoRoupa = sc.nextInt();

		while (opcaoRoupa != 2 || opcaoRoupa != 1) {
			if (opcaoRoupa == 1) {
				System.out.println("Insira o código do top");
				int codigo = sc.nextInt();
				top.cancelarPedido(codigo);

			} else if (opcaoRoupa == 2) {
				System.out.println("Insira o código do short");
				int codigo = sc.nextInt();
				roupaShort.cancelarPedido(codigo);

			} else {
				System.out.println("Opção inválida!");
			}
		}
	}
	
	private static void procurarRoupa(Scanner sc, Top top, Short roupaShort) {

		System.out.println("Qual opção deseja buscar: 1 -  Top ou 2 - Short");

		int opcaoRoupa = sc.nextInt();

		while (opcaoRoupa != 2 || opcaoRoupa != 1) {
			if (opcaoRoupa == 1) {
				System.out.println("Insira o código do top");
				int codigo = sc.nextInt();
				top.procurarPedido(codigo);

			} else if (opcaoRoupa == 2) {
				System.out.println("Insira o código do short");
				int codigo = sc.nextInt();
				roupaShort.procurarPedido(codigo);

			} else {
				System.out.println("Opção inválida!");
			}
		}
	}

	public static void main(String[] args) {

		// Teste da Classe Roupa
		Roupa top1 = new Top(1, "Azul", "M", "Top Lyn");
		top1.exibirDetalhes();
		Roupa short1 = new Short(2, "Preto", "G", "sunguete", "Short Bella");
		short1.exibirDetalhes();

		Scanner sc = new Scanner(System.in);

		int opcao;
		Top topPrincipal = new Top();
		Short shortPrincipal = new Short();

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
				adicionarRoupa(sc, topPrincipal, shortPrincipal);
				break;
			case 2:
				atualizarRoupa(sc, topPrincipal, shortPrincipal);
				break;
			case 3:
				procurarRoupa(sc, topPrincipal, shortPrincipal);

				break;
			case 4:
				cancelarRoupa(sc, topPrincipal, shortPrincipal);

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
}