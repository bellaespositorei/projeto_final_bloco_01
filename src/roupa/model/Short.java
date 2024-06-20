package roupa.model;

public class Short extends Roupa {
	
	    private String estilo;

	    public Short(int codigo, String cor, String tamanho, String estilo) {
	        super(codigo, cor, tamanho);
	        this.estilo = estilo;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Short - Código: " + getCodigo() +
	                           ", Cor: " + getCor() +
	                           ", Tamanho: " + getTamanho() +
	                           ", Estilo: " + estilo);
	    }
	
}
