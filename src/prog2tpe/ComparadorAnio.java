package prog2tpe;

import java.util.Comparator;
/*
 * Compara películas por año en orden ascendente.
 */
public class ComparadorAnio implements Comparator<Pelicula> {

	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		if (p1.getAnio() > p2.getAnio()) return 1;
		else if (p1.getAnio() < p2.getAnio()) return -1;
		else return 0;
	}
}