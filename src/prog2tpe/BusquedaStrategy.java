package prog2tpe;

import java.util.List;
/*
 * Interface que implementan todas las b�squedas.
 * Define el m�todo buscar.
 */
public interface BusquedaStrategy {
	public List<Pelicula> buscar(List<Pelicula> peliculas);
}