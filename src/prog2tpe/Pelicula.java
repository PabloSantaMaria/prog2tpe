package prog2tpe;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
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

	public String getTitulo() { return titulo; }
	public int getAnio() { return anio; }
	public int getDuracion() { return duracion; }
	public String getSinopsis() { return sinopsis; }
	public int getPopularidad() { return popularidad; }
	public int getCantVotos() { return cantVotos; }
	public double getPuntaje() { return (double)totalValoraciones / cantVotos; }

	public void setTitulo(String titulo) { this.titulo = titulo; }
	public void setDuracion(int duracion) { this.duracion = duracion; }
	public void setAnio(int anio) { this.anio = anio; }
	public void setSinopsis(String sinopsis) { this.sinopsis = sinopsis; }

	public void addGenero(Genero genero) {
		if (!generos.contains(genero)) {
			generos.add(genero);
			genero.addPelicula(this);
		}
	}
	public void addActor (String actor) {
		if (!actores.contains(actor))
			actores.add(actor);	
	}
	public void addDirector (String director) {
		if (!actores.contains(director))
			actores.add(director);
	}

	public void aumentarPopularidad() {
		this.popularidad++;
	}
	public void valorar(int valoracion) {
		totalValoraciones += valoracion;
		cantVotos++;
	}

	public boolean equals(Object o) {
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Pelicula p = (Pelicula) o;
		return this.getTitulo().toLowerCase() == p.getTitulo().toLowerCase() && this.getAnio() == p.getAnio();
	}
	public String toString() {
		return titulo + " (" + anio + ")";
	}

	
	public List<String> getActores() {
		return actores;
	}
	
	public List<Genero> getGeneros() {
		return generos;
	}
	
	public List<String> getDirectores() {
		return directores;
	}

	public boolean cumple(CondicionStrategy condicion) {
		return condicion.cumpleCriterio(this);
	}
}