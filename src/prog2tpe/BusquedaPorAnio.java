package prog2tpe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
 * Recibe un año inicial y un año final.
 * Devuelve la lista de películas que se hayan estrenado entre esos años, ordenadas por año (ascendente).
 */
public class BusquedaPorAnio implements BusquedaStrategy {
	private int anioInicio;
	private int anioFin;

	public BusquedaPorAnio(int anioInicio, int anioFin) {
		this.anioInicio = anioInicio;
		this.anioFin = anioFin;
	}
	@Override
	public List<Pelicula> buscar(List<Pelicula> peliculas) {
		List<Pelicula> salida = new ArrayList<Pelicula>();
		Iterator<Pelicula> peliculasIterator = peliculas.iterator();
		while (peliculasIterator.hasNext()) {
			Pelicula pelicula = peliculasIterator.next();
			if (pelicula.getAnio() >= anioInicio && pelicula.getAnio() <= anioFin)
				salida.add(pelicula);
		}
		Collections.sort(salida, new ComparadorAnio());
		return salida;
	}
}