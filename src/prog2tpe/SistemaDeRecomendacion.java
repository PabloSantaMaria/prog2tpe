package prog2tpe;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeRecomendacion {
	private List<Cliente> clientes;
	private List<Pelicula> peliculas;
	private List<Genero> generos;

	public SistemaDeRecomendacion() {
		this.clientes = new ArrayList<Cliente>();
		this.peliculas = new ArrayList<Pelicula>();
		this.generos = new ArrayList<Genero>();
	}

	public void addCliente(Cliente cliente) {
		if (!clientes.contains(cliente)) {
			clientes.add(cliente);
		}
	}
	public void addPelicula(Pelicula pelicula) {
		if (!peliculas.contains(pelicula)) {
			peliculas.add(pelicula);
		}
	}
	public void addGenero(Genero genero) {
		if (!generos.contains(genero)) {
			generos.add(genero);
		}
	}


}
