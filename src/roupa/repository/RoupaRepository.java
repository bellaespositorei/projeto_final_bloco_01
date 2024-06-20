package roupa.repository;

import roupa.model.Roupa;

public interface RoupaRepository {
	public abstract void novoPedido(Roupa roupa);

    public abstract void procurarPedido(int codigo);

    public abstract void editarPedido(int codigo, Roupa roupa);

    public abstract void cancelarPedido(int codigo);
}
