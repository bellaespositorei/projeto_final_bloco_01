package roupa.model;

public class Top extends Roupa{
	
	    private String tipo;

	    public Top(int codigo, String cor, String tamanho, String tipo) {
	        super(codigo, cor, tamanho);
	        this.tipo = tipo;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Top - Código: " + getCodigo() +
	                           ", Cor: " + getCor() +
	                           ", Tamanho: " + getTamanho() +
	                           ", Tipo: " + tipo);
	    }
	}
