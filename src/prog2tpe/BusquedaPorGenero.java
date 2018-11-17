package prog2tpe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
 * Recibe un género y devuelve la lista de películas que pertenecen a ese género.
 */
public class BusquedaPorGenero implements BusquedaStrategy {
	private Genero genero;

	public BusquedaPorGenero(Genero genero) {
		this.genero = genero;
	}
	@Override
	public List<Pelicula> buscar(List<Pelicula> peliculas) {
		List<Pelicula> salida = new ArrayList<Pelicula>();
		Iterator<Pelicula> peliculasIterator = peliculas.iterator();
		while (peliculasIterator.hasNext()) {
			Pelicula pelicula = peliculasIterator.next();
			if (pelicula.getGeneros().contains(genero))
				salida.add(pelicula);
		}
		Collections.sort(salida);
		return salida;
	}
}