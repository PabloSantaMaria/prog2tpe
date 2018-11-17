package prog2tpe;

import java.util.ArrayList;
import java.util.List;
/**
 * Objeto Hoja
 * Pueden o no pertenecer a uno o más objetos Compuestos en un Grupo
 */

public class Usuario extends Cliente {
	private int edad;
	private List<Pelicula> peliculasVistas;
	private List<Genero> generosPreferidos;

	public Usuario (String nombre) {
		super(nombre);
		this.peliculasVistas = new ArrayList<Pelicula>();
		this.generosPreferidos = new ArrayList<Genero>();
	}
	/*
	 * Getters
	 */
	public int getEdad() { return edad; }
	
	public List<Pelicula> getPeliculasVistas() {
		return new ArrayList<Pelicula>(peliculasVistas);
	}
	public List<Genero> getGenerosPreferidos() {
		return new ArrayList<Genero>(generosPreferidos);
	}
	/*
	 * Setters
	 */
	public void setEdad(int edad) { this.edad = edad; }
	
	/**
	 * Agrega una película a la lista de películas vistas del Usuario
	 * Incrementa +1 la popularidad de la película
	 * Chequea repetidos
	 * @param pelicula:	objeto Pelicula
	 */
	public void verPelicula(Pelicula pelicula) {
		if (!peliculasVistas.contains(pelicula)) {
			peliculasVistas.add(pelicula);
			pelicula.aumentarPopularidad();
		}
	}
	/**
	 * Agrega un género a la lista de géneros preferidos del usuario
	 * Chequea repetidos
	 * @param genero:	objeto Genero
	 */
	public void addGeneroPreferido(Genero genero) {
		if (!generosPreferidos.contains(genero))
			generosPreferidos.add(genero);
	}
}