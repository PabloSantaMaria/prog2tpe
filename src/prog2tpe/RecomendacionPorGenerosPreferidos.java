package prog2tpe;

import java.util.Iterator;
/**
 * Define un comportamiento para recomendar una pel�cula al usuario o grupo si contiene todos los g�neros preferidos
 * Los g�neros preferidos de un grupo son todos los g�neros de los integrantes sin repetidos
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
	 * Recive una pel�cula
	 * @return:	true si contiene todos los g�neros preferidos del cliente
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