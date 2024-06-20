package roupa.model;

import java.util.Collection;

import roupa.repository.RoupaRepository;

public abstract class Roupa implements RoupaRepository{
	
	private int codigo;
	private String tamanho;
	private String cor;
	private String tipo;
	protected Collection<Roupa> roupas;
	
	public Roupa () {}
	
	public Roupa(int codigo, String tamanho, String cor, String tipo) {
		this.codigo = codigo;
		this.tamanho = tamanho;
		this.cor = cor;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public abstract void exibirDetalhes();
	
	protected abstract void exibirDetalhes(Roupa roupa);
	
	public abstract void novoPedido(Roupa roupa);

	public abstract void procurarPedido(int codigo);

	public abstract void editarPedido(int codigo, Roupa roupa);

	public abstract void cancelarPedido(int codigo);
	
}
