package prog2tpe;

import java.util.Vector;

public class Pelicula {
	private String titulo;
	private String director;
	private String comentarios;
	private Vector<String>actores;
	private String[] generos;
	private int duracion;
	private int anioEstreno;
	private int contador;
	private double valoracion;


	public Pelicula(String titulo, String director, String[] generos, int duracion, int anioEstreno) {
		this.titulo = titulo;
		this.director =director;
		this.comentarios = "";
		this.actores = new Vector<String>();
		this.generos = generos;
		this.duracion = duracion;
		this.anioEstreno = anioEstreno;
		this.contador = 0;
		this.valoracion = 0;
	}

	public int getDuracion(){
		return duracion;
	}

	public String getComentarios(){
		return comentarios;
	}

	public Vector<String> getActoresPrinc(){
		return actores;
	}

	public String[] getGenero(){
		return generos;
	}

	public String getTitulo(){
		return titulo;
	}

	public String getDirector(){
		return director;
	}

	public int getAnio(){
		return anioEstreno;
	}

	public int cantidadElementos(){
		return 1;
	}

	public String toString(){
		String imprimir = ("Titulo: "+titulo+". Año de estreno: "+anioEstreno+". Durcion: "+duracion+ " ");
		imprimir += this.toStringGeneros() + toStringActores();
		return imprimir;
	}

	public String toStringGeneros(){
		String imprimir= "Generos: ";
		for(int i=0; i<generos.length; i++){
			imprimir += generos[i]+ " ";
		}
		return imprimir;
	}

	public String toStringActores(){
		String imprimir= "Actores protagonicos: ";
		for(int i=0; i<actores.size(); i++){
			imprimir += actores.elementAt(i)+ " ";
		}
		return imprimir;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setAnio(int anio) {
		this.anioEstreno = anio;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public void valorar(int valor){
		this.valoracion += valor;
		this.contador ++ ;
	}

	public double getValoracion(){
		return valoracion/contador;
	}

	public Boolean coincide(Condicion c1){
		if (c1.cumple(this)){
			return true;
		}
		return false;
	}

	public void agregarActores (String g){
		if (!actores.contains(g)){
			actores.add(g);
		}	
	}
}