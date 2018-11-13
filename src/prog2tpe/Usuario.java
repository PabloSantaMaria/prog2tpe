package prog2tpe;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Cliente {
	private int edad;
	private List<Pelicula> peliculasVistas;
	private List<Genero> generosPreferidos;

	public Usuario (String nombre) {
		super(nombre);
		this.peliculasVistas = new ArrayList<Pelicula>();
		this.generosPreferidos = new ArrayList<Genero>();
	}

	public int getEdad() { return edad; }
	public void setEdad(int edad) { this.edad = edad; }
	public List<Pelicula> getPeliculasVistas() {
		return peliculasVistas;
	}
	public List<Genero> getGenerosPreferidos() {
		return generosPreferidos;
	}

	public void verPelicula(Pelicula pelicula) {
		if (!peliculasVistas.contains(pelicula)) {
			peliculasVistas.add(pelicula);
			pelicula.aumentarPopularidad();
		}
	}
	
	public void addGeneroPreferido(Genero genero) {
		if (!generosPreferidos.contains(genero))
			generosPreferidos.add(genero);
	}
}