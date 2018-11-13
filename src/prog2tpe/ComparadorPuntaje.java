package prog2tpe;

import java.util.Comparator;

public class ComparadorPuntaje implements Comparator<Pelicula> {

	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		if (p1.getPuntaje() < p2.getPuntaje()) return 1;
		else if (p1.getPuntaje() > p2.getPuntaje()) return -1;
		else return 0;
	}
}