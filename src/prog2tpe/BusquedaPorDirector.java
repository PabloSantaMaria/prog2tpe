package prog2tpe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BusquedaPorDirector implements BusquedaStrategy {
	private String director;

	public BusquedaPorDirector(String director) {
		this.director = director;
	}
	@Override
	public List<Pelicula> buscar(List<Pelicula> peliculas) {
		List<Pelicula> salida = new ArrayList<Pelicula>();
		Iterator<Pelicula> peliculasIterator = peliculas.iterator();
		while (peliculasIterator.hasNext()) {
			Pelicula pelicula = peliculasIterator.next();
			if (pelicula.getDirectores().contains(director))
				salida.add(pelicula);
		}
		return salida;
	}
}