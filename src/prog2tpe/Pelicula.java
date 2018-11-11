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


	public Pelicula(String titulo, int anio, int duracion) {
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
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
	public void agregarActor (String actor) {
		if (!actores.contains(actor))
			actores.add(actor);	
	}
	public void agregarDirector (String director) {
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

	//iterator?
	public List<String> getActores() { //es nehesario?
		return actores;
	}
	//iterator?
	public List<Genero> getGeneros() { //es nehesario?
		return generos;
	}
	//iterator?
	public List<String> getDirectores() { //es nehesario?
		return directores;
	}


	//	public String toString() {
	//		String imprimir = ("Título: " + titulo + ". Año de estreno: " + anio + ". Duración: " + duracion + " ");
	//		imprimir += this.toStringGeneros() + toStringActores();
	//		return imprimir;
	//	}


	//	public String toStringGeneros() {
	//		String imprimir= "Generos: ";
	//		for (int i=0; i<generos.length; i++) {
	//			imprimir += generos[i]+ " ";
	//		}
	//		return imprimir;
	//	}

	//	public String toStringActores(){
	//		String imprimir= "Actores protagonicos: ";
	//		for(int i=0; i < actores.size(); i++) {
	//			imprimir += actores.get(i)+ " ";
	//		}
	//		return imprimir;
	//	}


	//???
	//	public void setComentarios(String comentarios) {
	//		this.comentarios = comentarios;
	//	}

	public String toString() {
		return titulo + " (" + anio + ")";
	}

	public Boolean coincide(Condicion c1) {
		return c1.cumple(this);
	}
}