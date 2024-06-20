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

		@Override
		public void novoPedido(Roupa roupa) {
			this.roupas.add(roupa);
			System.out.println("O short foi salvo com sucesso!");
			
		}

		@Override
		public void procurarPedido(int codigo) {
			for (Roupa roupa : this.roupas) {
				int codigoAtual = roupa.getCodigo();
				
				if (codigoAtual == codigo) {
					
					this.exibirDetalhes(roupa);
					return;
				}
			}
			
			System.out.println("O short não existe ou não foi encontrado!");
		}

		@Override
		public void editarPedido(int codigo, Roupa roupa) {
			for (Roupa roupaDaLista : this.roupas) {
				int codigoAtual = roupa.getCodigo();
				
				if (codigoAtual == codigo) {
					
					this.roupas.remove(roupaDaLista);
					this.roupas.add(roupa);
					System.out.println("O short com o código" + codigo + " foi atualizado com sucesso!");
					return;
				}
			}
			
			System.out.println("Não foi possível atualizar o short, pois ele não foi encontrado!");
			
		}

		@Override
		public void cancelarPedido(int codigo) {
			for (Roupa roupa : this.roupas) {
				int codigoAtual = roupa.getCodigo();
				
				if (codigoAtual == codigo) {
					
					this.roupas.remove(roupa);
					System.out.println("O short com o código" + codigo + " foi cancelado com sucesso!");
					return;
				}
			}
			
			System.out.println("Não foi possível cancelar o short, pois ele não foi encontrado!");
			
		}
	}
