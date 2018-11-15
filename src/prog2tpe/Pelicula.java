package prog2tpe;

import java.util.ArrayList;
import java.util.List;

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
	public String getSinopsis() { return sinopsis; }
	public int getDuracion() { return duracion; }
	public List<String> getActores() { return new ArrayList<String>(actores); }
	public List<String> getDirectores() { return new ArrayList<String>(directores); }
	public List<Genero> getGeneros() { return new ArrayList<Genero>(generos); }
	public int getPopularidad() { return popularidad; }
	public int getCantVotos() { return cantVotos; }
	public double getPuntaje() {
		if (cantVotos == 0)
			return 0;
		else return (double)totalValoraciones / cantVotos;
	}

	public void setTitulo(String titulo) { this.titulo = titulo; }
	public void setDuracion(int duracion) { this.duracion = duracion; }
	public void setAnio(int anio) { this.anio = anio; }
	public void setSinopsis(String sinopsis) { this.sinopsis = sinopsis; }

	public void addActor (String actor) {
		if (!actores.contains(actor))
			actores.add(actor);	
	}
	public void addDirector (String director) {
		if (!actores.contains(director))
			directores.add(director);
	}
	public void addGenero(Genero genero) {
		if (!generos.contains(genero)) {
			generos.add(genero);
			genero.addPelicula(this);
		}
	}
	
	public void aumentarPopularidad() {
		this.popularidad++;
	}
	public void valorar(int valoracion) {
		totalValoraciones += valoracion;
		cantVotos++;
	}
	public boolean cumple(RecomendacionStrategy condicion) {
		return condicion.cumpleCriterio(this);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Pelicula p = (Pelicula) o;
		return this.getTitulo().equalsIgnoreCase(p.getTitulo()) && this.getAnio() == p.getAnio();
	}
	@Override
	public String toString() {
		return titulo + " (" + anio + ")";
	}
	@Override
	public int compareTo(Pelicula otra) {
		return this.getTitulo().compareTo(otra.getTitulo());
	}
}