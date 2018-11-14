package prog2tpe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		return salida;
	}
}