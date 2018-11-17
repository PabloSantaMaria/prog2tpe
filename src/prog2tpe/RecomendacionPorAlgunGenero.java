package prog2tpe;

import java.util.Iterator;
/**
 * Define un comportamiento para recomendar una pel�cula al usuario o grupo si contiene alg�n g�nero preferido
 * Los g�neros preferidos de un grupo son todos los g�neros de los integrantes sin repetidos
 */
public class RecomendacionPorAlgunGenero implements RecomendacionStrategy {
	private Cliente cliente;
	
	public RecomendacionPorAlgunGenero() {
		this.cliente = null;
	}
	
	@Override
	public Cliente getCliente() {
		return cliente;
	}
	
	@Override
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * Recive una pel�cula
	 * @return:	true si contiene algun g�nero preferido del cliente
	 */
	@Override
	public boolean cumpleCriterio(Pelicula pelicula) {
		boolean contieneAlguno = false;
		Iterator<Genero> generosCliente = cliente.getGenerosPreferidos().iterator();
		while (generosCliente.hasNext() && !contieneAlguno) {
			Genero generoCliente = generosCliente.next();
			if (pelicula.getGeneros().contains(generoCliente))
				contieneAlguno = true;
		}
		return contieneAlguno;
	}
}