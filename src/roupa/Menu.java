package roupa;

import java.util.Scanner;

import roupa.controller.RoupaController;
import roupa.model.Top;
import roupa.model.Short;


public class Menu {

	private static void adicionarRoupa(Scanner sc, RoupaController roupaController) {

		int opcaoRoupa = 0;

		while (opcaoRoupa != 2 || opcaoRoupa != 1) {
			
			System.out.println("Qual opção deseja adicionar: 1 - Top, 2 - Short ou 3 - Sair");
			opcaoRoupa = sc.nextInt();
			
			if (opcaoRoupa == 1) {
				System.out.println("Insira as características da sua roupa: código, cor, tamanho e tipo");
				int codigo = sc.nextInt();
				String cor = sc.nextLine();
				String tamanho = sc.nextLine();
				String tipo = sc.nextLine();
				sc.nextLine();

				Top novoTop = new Top(codigo, cor, tamanho, tipo);
				roupaController.novoPedido(novoTop);

			} else if (opcaoRoupa == 2) {
				System.out.println("Insira as características da sua roupa: código, cor, tamanho, estilo e tipo");
				int codigo = sc.nextInt();
				String cor = sc.nextLine();
				String tamanho = sc.nextLine();
				String estilo = sc.nextLine();
				String tipo = sc.nextLine();
				sc.nextLine();

				Short novoShort = new Short(codigo, cor, tamanho, estilo, tipo);
				roupaController.novoPedido(novoShort);

			}else if (opcaoRoupa == 3) {
				break;
			} else {
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void atualizarRoupa(Scanner sc, RoupaController roupaController) {


		int opcaoRoupa = 0;

		while (opcaoRoupa != 2 || opcaoRoupa != 1) {
			
			System.out.println("Qual opção deseja atualizar: 1 -  Top, 2 - Short ou 3 - Sair");
			opcaoRoupa = sc.nextInt();
			
			if (opcaoRoupa == 1) {
				System.out.println("Insira as características da sua roupa: código, cor, tamanho e tipo");
				int codigo = sc.nextInt();
				String cor = sc.nextLine();
				String tamanho = sc.nextLine();
				String tipo = sc.nextLine();
				sc.nextLine();

				Top novoTop = new Top(codigo, cor, tamanho, tipo);
				roupaController.editarPedido(codigo, novoTop);

			} else if (opcaoRoupa == 2) {
				System.out.println("Insira as características da sua roupa: código, cor, tamanho, estilo e tipo");
				int codigo = sc.nextInt();
				String cor = sc.nextLine();
				String tamanho = sc.nextLine();
				String estilo = sc.nextLine();
				String tipo = sc.nextLine();
				sc.nextLine();

				Short novoShort = new Short(codigo, cor, tamanho, estilo, tipo);
				roupaController.editarPedido(codigo, novoShort);

			}else if (opcaoRoupa == 3) {
				break;
				
			} else {
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void cancelarRoupa(Scanner sc, RoupaController roupaController) {

		int opcaoRoupa = 0;

		while (opcaoRoupa != 2 || opcaoRoupa != 1) {
			
			System.out.println("Qual opção deseja cancelar: 1 -  Top, 2 - Short ou 3 - Sair");
			opcaoRoupa = sc.nextInt();
			
			if (opcaoRoupa == 1) {
				System.out.println("Insira o código do top");
				int codigo = sc.nextInt();
				roupaController.cancelarPedido(codigo);

			} else if (opcaoRoupa == 2) {
				System.out.println("Insira o código do short");
				int codigo = sc.nextInt();
				roupaController.cancelarPedido(codigo);

			} else if (opcaoRoupa == 3) {
				break;
			} else {
				System.out.println("Opção inválida!");
			}
		}
	}
	
	private static void procurarRoupa(Scanner sc, RoupaController roupaController) {


		int opcaoRoupa = 0;

		while (opcaoRoupa != 2 || opcaoRoupa != 1) {
			
			System.out.println("Qual opção deseja buscar: 1 -  Top, 2 - Short ou 3 - Sair");
			opcaoRoupa = sc.nextInt();
			if (opcaoRoupa == 1) {
				System.out.println("Insira o código do top");
				int codigo = sc.nextInt();
				roupaController.procurarPedido(codigo);

			} else if (opcaoRoupa == 2) {
				System.out.println("Insira o código do short");
				int codigo = sc.nextInt();
				roupaController.procurarPedido(codigo);

			} else if (opcaoRoupa == 3) {
				break;
			} else {
				System.out.println("Opção inválida!");
			}
		}
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int opcao;
		RoupaController roupaController = new RoupaController();

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
				adicionarRoupa(sc, roupaController);
				break;
			case 2:
				atualizarRoupa(sc, roupaController);
				break;
			case 3:
				procurarRoupa(sc, roupaController);

				break;
			case 4:
				cancelarRoupa(sc, roupaController);

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
}