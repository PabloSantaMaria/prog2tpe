package prog2tpe;

import java.util.ArrayList;
import java.util.List;
/*
 * Objeto Pelicula
 * Las recomendaciones a los clientes del Sistema contienen uno o más objetos Pelicula
 */
public class Pelicula implements Comparable<Pelicula> {
	private String titulo;
	private int anio;
	private String sinopsis;
	private int duracion;
	private List<String> actores;
	private List<String> directores;
	private List<Genero> generos;
	private int popularidad;
	private int cantVotos;
	private int totalValoraciones;

	/**
	 * Constructor
	 * @param titulo:	título de la película
	 * @param anio:	año de estreno
	 */
	public Pelicula(String titulo, int anio) {
		this.titulo = titulo;
		this.anio = anio;
		this.actores = new ArrayList<String>();
		this.directores = new ArrayList<String>();
		this.generos = new ArrayList<Genero>();
		this.popularidad = 0;
		this.cantVotos = 0;
		this.totalValoraciones = 0;
	}
	/*
	 * Getters
	 */
	public String getTitulo() { return titulo; }
	public int getAnio() { return anio; }
	public String getSinopsis() { return sinopsis; }
	public int getDuracion() { return duracion; }
	public List<String> getActores() { return new ArrayList<String>(actores); }
	public List<String> getDirectores() { return new ArrayList<String>(directores); }
	public List<Genero> getGeneros() { return new ArrayList<Genero>(generos); }
	public int getPopularidad() { return popularidad; }
	public int getCantVotos() { return cantVotos; }
	/*
	 * Setters
	 */
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public void setDuracion(int duracion) { this.duracion = duracion; }
	public void setAnio(int anio) { this.anio = anio; }
	public void setSinopsis(String sinopsis) { this.sinopsis = sinopsis; }
	/*
	 * Agrega un actor a la lista de actores, sin repetidos
	 */
	public void addActor (String actor) {
		if (!actores.contains(actor))
			actores.add(actor);	
	}
	/*
	 * Agrega un director a la lista de directores, sin repetidos
	 */
	public void addDirector (String director) {
		if (!actores.contains(director))
			directores.add(director);
	}
	/*
	 * Agrega un género a la lista
	 * Al mismo tiempo agrega esta película a la lista de películas del objeto género
	 */
	public void addGenero(Genero genero) {
		if (!generos.contains(genero)) {
			generos.add(genero);
			genero.addPelicula(this);
		}
	}
	/**
	 * Calcula el puntaje de una película, que es igual a la suma de las valoraciones
	 * de los usuarios dividido la cantidad de veces que fue valorada
	 * @return:	double puntaje
	 */
	public double getPuntaje() {
		if (cantVotos == 0)
			return 0;
		else return (double)totalValoraciones / cantVotos;
	}
	/*
	 * Incrementa +1 la popularidad
	 * Un usuario llama al método cada vez que ve la película
	 */
	public void aumentarPopularidad() {
		this.popularidad++;
	}
	/*
	 * Suma al total de valoraciones el valor dado por un usuario
	 */
	public void valorar(int valoracion) {
		totalValoraciones += valoracion;
		cantVotos++;
	}
	/**
	 * Chequea si la película cumple con un criterio de recomendación
	 * @param condicion: criterio de recomendación
	 * @return	boolean true si cumple con el criterio
	 */
	public boolean cumple(RecomendacionStrategy condicion) {
		return condicion.cumpleCriterio(this);
	}
	/**
	 * Define si un objeto Pelicula es igual a otro
	 * Una película es igual a otra si tienen el mismo nombre y se estrenó el mismo año
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Pelicula p = (Pelicula) o;
		return this.getTitulo().equalsIgnoreCase(p.getTitulo()) && this.getAnio() == p.getAnio();
	}
	/**
	 * Ordenamiento por defecto de películas
	 * Se ordenan alfabéticamente
	 */
	@Override
	public int compareTo(Pelicula otra) {
		return this.getTitulo().compareTo(otra.getTitulo());
	}
	@Override
	public String toString() {
		return titulo + " (" + anio + ")";
	}
}