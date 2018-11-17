package prog2tpe;

import java.util.List;
/*
 * Interface que implementan todas las búsquedas.
 * Define el método buscar.
 */
public interface BusquedaStrategy {
	public List<Pelicula> buscar(List<Pelicula> peliculas);
}