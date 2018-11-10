package prog2tpe;

import java.util.Vector;

public class Usuario extends Cliente {
	private String nombre;
	private Vector<Pelicula> vistas;
	private String[] generosPreferidos;
	private int edad;
	
	public Usuario (String nombre, int edad){
		this.nombre =nombre;
		this.vistas = new Vector<Pelicula>();
		this.edad = edad;
		this.generosPreferidos = null;
	}
	public Usuario (String nombre, int edad, String[] generos){
		this.nombre = nombre;
		this.vistas = new Vector<Pelicula>();
		this.edad = edad;
		this.generosPreferidos = generos;
	}
	
	public Usuario (String nombre, int edad, String[] generos, Vector<Pelicula> vistas){
		this.nombre = nombre;
		this.vistas = vistas;
		this.edad = edad;
		this.generosPreferidos = generos;
	}
	
	public int getedad(){
		return edad;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public Vector<Pelicula> getPeliculas(){
		return vistas;
	}
	
	public String[] getGenerosFavoritos(){
		return generosPreferidos;
	}
	
	public String toString(){
		String imprimir = ("Nombre: "+nombre+". Edad: "+edad+". " );
		String auxImprimir = " ";
		for (int i = 0; i < generosPreferidos.length; i++) {
			auxImprimir += generosPreferidos[i] + " ";
		}
		imprimir += "Generos Preferidos : " + auxImprimir;
		return imprimir;
	}
	
	public void valorar(Pelicula p, int valor){
		p.valorar(valor);
	}
}
