package prog2tpe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
 * Busca por actor y devuelve una lista de películas ordenadas por orden alfabético
 */
public class BusquedaPorActor implements BusquedaStrategy {
	private String actor;

	public BusquedaPorActor(String actor) {
		this.actor = actor;
	}
	@Override
	public List<Pelicula> buscar(List<Pelicula> peliculas) {
		List<Pelicula> salida = new ArrayList<Pelicula>();
		Iterator<Pelicula> peliculasIterator = peliculas.iterator();
		while (peliculasIterator.hasNext()) {
			Pelicula pelicula = peliculasIterator.next();
			if (pelicula.getActores().contains(actor))
				salida.add(pelicula);
		}
		Collections.sort(salida);
		return salida;
	}
}