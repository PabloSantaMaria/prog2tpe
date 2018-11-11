package prog2tpe;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends Cliente {
	private List<Cliente> integrantes;
	
	public Grupo (String nombre) {
		super(nombre);
		this.integrantes = new ArrayList<Cliente>();
	}
	
	public void addIntegrante(Cliente c) {
		if (!integrantes.contains(c)) {
			integrantes.add(c);
		}	
	}
	
	public void verPelicula(Pelicula p) {
		for (Cliente integrante : integrantes)
			integrante.verPelicula(p);
	}
	
	public List<Pelicula> getPeliculasVistas() {
		List<Pelicula> salida = new ArrayList<Pelicula>();
		for (Cliente integrante : integrantes) {
			for (Pelicula pelicula : integrante.getPeliculasVistas()) {
				if (!salida.contains(pelicula))
					salida.add(pelicula);
			}
		}
		return salida;
	}
	
	public List<Genero> getGenerosPreferidos() {
		List<Genero> salida = new ArrayList<Genero>();
		for (Cliente integrante : integrantes) {
			for (Genero genero : integrante.getGenerosPreferidos()) {
				if (!salida.contains(genero))
					salida.add(genero);
			}
		}
		return salida;
	}
	
//	public String toString() {
//		String imprimir = ("\033[34m"+"Nombre: "+nombre+". " );
//		String auxImprimir = "";
//		for (int i = 0; i < integrantes.size(); i++) {
//			auxImprimir += integrantes.get(i).toString()+" ";
//		}
//		imprimir += "integrantes del grupo : "+ auxImprimir;
//		return imprimir;
//	}

}
