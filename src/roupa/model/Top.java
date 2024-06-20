package roupa.model;

public class Top extends Roupa {
	
	    private String tipo;
	    
	    public Top() {}

	    public Top(int codigo, String cor, String tamanho, String tipo) {
	        super(codigo, cor, tamanho, tipo);
	        this.tipo = tipo;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Top - Código: " + getCodigo() +
	                           ", Cor: " + getCor() +
	                           ", Tamanho: " + getTamanho() +
	                           ", Tipo: " + tipo);
	    }
	    
	    @Override
	    public void exibirDetalhes(Roupa roupa) {
	        System.out.println("Top - Código: " + roupa.getCodigo() +
	                           ", Cor: " + roupa.getCor() +
	                           ", Tamanho: " + roupa.getTamanho() +
	                           ", Tipo: " + roupa.getTipo());
	    }

		
	}
