package roupa.repository;

import roupa.model.Roupa;

public interface RoupaRepository {
	void novoPedido(Roupa roupa);

    Roupa procurarPedido(String codigo);

    void editarPedido(String codigo, Roupa roupa);

    void cancelarPedido(String codigo);
}
