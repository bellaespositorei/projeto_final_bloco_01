package roupa.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;

import roupa.model.Roupa;
import roupa.model.Top;
import roupa.repository.RoupaRepository;

public class RoupaController implements RoupaRepository {

	ArrayList<Roupa> roupas = new ArrayList<Roupa>();

	public ArrayList<Roupa> getRoupas() {
		return roupas;
	}

	public void setRoupas(ArrayList<Roupa> roupas) {
		this.roupas = roupas;
	}

	public void novoPedido(Roupa roupa) {
		this.roupas.add(roupa);
		System.out.println("A roupa foi adicionada com sucesso!");

	}

	public void procurarPedido(int codigo) {
		for (Roupa roupa : this.roupas) {
			int codigoAtual = roupa.getCodigo();

			if (codigoAtual == codigo) {

				roupa.exibirDetalhes(roupa);
				return;
			}
		}
		throw new InputMismatchException("A roupa não existe ou não foi encontrado!");
	}

	public void editarPedido(int codigo, Roupa roupa) {
		for (Roupa roupaDaLista : this.roupas) {
			int codigoAtual = roupa.getCodigo();

			if (codigoAtual == codigo) {
				
				this.roupas.remove(roupaDaLista);
				this.roupas.add(roupa);
				
				String tipoDaRoupa = roupaDaLista instanceof Top ? "O top com o código " : "O short com o código ";
				
				System.out.println(tipoDaRoupa + codigo + " foi atualizado com sucesso!");
				return;
			}
		}
		throw new InputMismatchException("Não foi possível atualizar a roupa, pois ela não foi encontrado!");


	}

	public void cancelarPedido(int codigo) {
		for (Roupa roupa : this.roupas) {
			int codigoAtual = roupa.getCodigo();

			if (codigoAtual == codigo) {

				this.roupas.remove(roupa);
				
				String tipoDaRoupa = roupa instanceof Top ? "O top com o código " : "O short com o código ";
				
				System.out.println(tipoDaRoupa + codigo + " foi cancelado com sucesso!");
				return;
			}
		}
		throw new InputMismatchException("Não foi possível cancelar a roupa, pois ela não foi encontrado!");

	}
	
	
}
