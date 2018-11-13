package prog2tpe;

import java.util.Comparator;

public class ComparadorPopularidad implements Comparator<Pelicula> {

	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		if (p1.getPopularidad() < p2.getPopularidad()) return 1;
		else if (p1.getPopularidad() > p2.getPopularidad()) return -1;
		else return 0;
	}
}