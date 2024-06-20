package roupa.model;

public class Short extends Roupa {
	
	    private String estilo;
	    
	    public Short() {}
	    
	    public Short(int codigo, String cor, String tamanho, String estilo, String tipo) {
	        super(codigo, cor, tamanho, tipo);
	        this.estilo = estilo;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Short - Código: " + getCodigo() +
	                           ", Cor: " + getCor() +
	                           ", Tamanho: " + getTamanho() +
	                           ", Estilo: " + this.estilo);
	    }

	    @Override
	    public void exibirDetalhes(Roupa roupa) {
	        System.out.println("Short - Código: " + roupa.getCodigo() +
	                           ", Cor: " + roupa.getCor() +
	                           ", Tamanho: " + roupa.getTamanho() +
	                           ", Tipo: " + roupa.getTipo());
	    }
	}
