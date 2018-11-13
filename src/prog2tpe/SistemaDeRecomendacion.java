package prog2tpe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SistemaDeRecomendacion {
	private List<Cliente> clientes;
	private List<Pelicula> peliculas;
	public List<Genero> generos;

	public SistemaDeRecomendacion() {
		this.clientes = new ArrayList<Cliente>();
		this.peliculas = new ArrayList<Pelicula>();
		this.generos = new ArrayList<Genero>();
	}

	public void listarPeliculasVistas(Cliente cliente) {
		Iterator<Pelicula> iterator = cliente.getPeliculasVistas().iterator();
		System.out.println("Películas vistas por " + cliente + ":");
		while (iterator.hasNext()) {
			Pelicula pelicula = iterator.next();
			System.out.print(pelicula + "\n");
		}
	}

	public void recomendarPeliculas(Cliente cliente, CondicionStrategy condicion, Comparator<Pelicula> ordenamiento, int limite) {
		condicion.setCliente(cliente);
		List<Pelicula> salida = new ArrayList<Pelicula>();
		for (Pelicula pelicula : peliculas) {
			if (pelicula.cumple(condicion))
				salida.add(pelicula);
		}
		Collections.sort(salida, ordenamiento);
		imprimirRecomendaciones(salida, limite);
	}
	
	private void imprimirRecomendaciones(List<Pelicula> recomendadas, int limite) {
		if (recomendadas.size() < limite)
			limite = recomendadas.size();
		for (int i = 0; i < limite; i++) {
			System.out.println(recomendadas.get(i));
		}
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
