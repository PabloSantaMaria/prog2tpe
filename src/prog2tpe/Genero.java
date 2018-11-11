package prog2tpe;

import java.util.ArrayList;
import java.util.List;

public class Genero {
	private String nombre;
	private List<Pelicula> peliculas;

	public Genero(String nombre) {
		this.nombre = nombre;
		this.peliculas = new ArrayList<Pelicula>();
	}
	
	public String getNombre() { return nombre; }

	public void setNombre(String nombre) { this.nombre = nombre; }

	public List<Pelicula> getPeliculas() { return peliculas; }

	public void addPelicula(Pelicula p) {
		if (!peliculas.contains(p)) {
			peliculas.add(p);
			p.addGenero(this);
		}
	}
}
