package prog2tpe;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Cliente {
	private int edad;
	private List<Pelicula> peliculasVistas;
	private List<Genero> generosPreferidos;

	public Usuario (String nombre, int edad) {
		super(nombre);
		this.edad = edad;
		this.peliculasVistas = new ArrayList<Pelicula>();
		this.generosPreferidos = new ArrayList<Genero>();
	}

	public int getEdad() { return edad; }

	public void verPelicula(Pelicula pelicula) {
		if (!peliculasVistas.contains(pelicula)) {
			peliculasVistas.add(pelicula);
			pelicula.aumentarPopularidad();
			this.addGenerosPreferidos(pelicula.getGeneros());
		}
	}
	private void addGenerosPreferidos(List<Genero> generos) {
		for (Genero genero : generos) {
			if (!generosPreferidos.contains(genero) && genero != null)
				generosPreferidos.add(genero);
		}
	}
	
	//iterator?
	public List<Genero> getGenerosPreferidos() {
		return generosPreferidos;
	}
	//iterator?
	public List<Pelicula> getPeliculasVistas() {
		return peliculasVistas;
	}


	//	public String toString() {
	//		String imprimir = ("Nombre: "+nombre+". Edad: "+edad+". " );
	//		String auxImprimir = "";
	//		for (int i = 0; i < generosPreferidos.length; i++) {
	//			auxImprimir += generosPreferidos[i] + " ";
	//		}
	//		imprimir += "Generos Preferidos : " + auxImprimir;
	//		return imprimir;
	//	}

}