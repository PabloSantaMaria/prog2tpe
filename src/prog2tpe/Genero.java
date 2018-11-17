package prog2tpe;

import java.util.ArrayList;
import java.util.List;
/*
 * Agrupa películas en un género definido
 */
public class Genero {
	private String nombre;
	private List<Pelicula> peliculas;

	public Genero(String nombre) {
		this.nombre = nombre;
		this.peliculas = new ArrayList<Pelicula>();
	}
	
	public String getNombre() { return nombre; }

	public void setNombre(String nombre) { this.nombre = nombre; }

	public List<Pelicula> getPeliculas() { return new ArrayList<Pelicula>(peliculas); }

	public void addPelicula(Pelicula pelicula) {
		if (!peliculas.contains(pelicula)) {
			peliculas.add(pelicula);
			pelicula.addGenero(this);
		}
	}
	/*
	 * Define la igualdad del objeto Genero por su nombre.
	 */
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Genero g = (Genero) o;
		return this.getNombre().equalsIgnoreCase(g.getNombre());
	}
	public String toString() {
		return this.nombre;
	}
}
