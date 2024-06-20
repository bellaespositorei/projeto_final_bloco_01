package roupa.model;

public abstract class Roupa {
	
	private int codigo;
	private String tamanho;
	private String cor;
	
	public Roupa(int codigo, String tamanho, String cor) {
		this.codigo = codigo;
		this.tamanho = tamanho;
		this.cor = cor;
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
	
	public abstract void exibirDetalhes();
	
}
