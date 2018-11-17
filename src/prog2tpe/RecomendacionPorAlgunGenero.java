package prog2tpe;

import java.util.Iterator;
/**
 * Define un comportamiento para recomendar una película al usuario o grupo si contiene algún género preferido
 * Los géneros preferidos de un grupo son todos los géneros de los integrantes sin repetidos
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
	 * Recive una película
	 * @return:	true si contiene algun género preferido del cliente
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