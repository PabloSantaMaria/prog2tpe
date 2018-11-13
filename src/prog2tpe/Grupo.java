package prog2tpe;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends Cliente {
	private List<Cliente> integrantes;
	
	public Grupo (String nombre) {
		super(nombre);
		this.integrantes = new ArrayList<Cliente>();
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
	
	public void verPelicula(Pelicula p) {
		for (Cliente integrante : integrantes)
			integrante.verPelicula(p);
	}
	
	public void addIntegrante(Cliente cliente) {
		if (!integrantes.contains(cliente)) {
			integrantes.add(cliente);
		}	
	}
}