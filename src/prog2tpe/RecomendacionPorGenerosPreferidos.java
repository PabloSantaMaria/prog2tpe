package prog2tpe;

import java.util.Iterator;
/**
 * Define un comportamiento para recomendar una película al usuario o grupo si contiene todos los géneros preferidos
 * Los géneros preferidos de un grupo son todos los géneros de los integrantes sin repetidos
 */
public class RecomendacionPorGenerosPreferidos implements RecomendacionStrategy {
	private Cliente cliente;
	
	public RecomendacionPorGenerosPreferidos() {
		this.cliente = null;
	}
	
	@Override
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * Recive una película
	 * @return:	true si contiene todos los géneros preferidos del cliente
	 */
	@Override
	public boolean cumpleCriterio(Pelicula pelicula) {
		boolean contieneTodos = true;
		Iterator<Genero> generosPreferidos = cliente.getGenerosIterator();
		while (generosPreferidos.hasNext() && contieneTodos) {
			Genero generoCliente = generosPreferidos.next();
			if (!pelicula.getGeneros().contains(generoCliente))
				contieneTodos = false;
		}
		return contieneTodos;
	}
}