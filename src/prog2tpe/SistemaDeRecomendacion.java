package prog2tpe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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

	public void listarPeliculasVistas(Cliente cliente) {
		Iterator<Pelicula> iterator = cliente.getPeliculasVistas().iterator();
		System.out.println("Películas vistas por " + cliente + ":");
		while (iterator.hasNext()) {
			Pelicula pelicula = iterator.next();
			System.out.print(pelicula + "\n");
		}
	}

	public void recomendar(Cliente cliente, RecomendacionStrategy condicion, Comparator<Pelicula> ordenamiento) {
		condicion.setCliente(cliente);
		List<Pelicula> recomendadas = getRecomendaciones(condicion, ordenamiento);
		imprimirRecomendaciones(recomendadas, -1);
	}

	public void recomendar(Cliente cliente, RecomendacionStrategy condicion, Comparator<Pelicula> ordenamiento, int limite) {
		condicion.setCliente(cliente);
		List<Pelicula> recomendadas = getRecomendaciones(condicion, ordenamiento);
		imprimirRecomendaciones(recomendadas, limite);
	}

	private List<Pelicula> getRecomendaciones(RecomendacionStrategy condicion, Comparator<Pelicula> ordenamiento) {
		List<Pelicula> salida = new ArrayList<Pelicula>();
		for (Pelicula pelicula : peliculas) {
			if (pelicula.cumple(condicion) && !condicion.getCliente().getPeliculasVistas().contains(pelicula))
				salida.add(pelicula);
		}
		Collections.sort(salida, ordenamiento);
		return salida;
	}

	private void imprimirRecomendaciones(List<Pelicula> recomendadas, int limite) {
		if (limite == -1 || recomendadas.size() < limite)
			limite = recomendadas.size();
		if (recomendadas.isEmpty())
			System.out.println("No existen recomendaciones con ese criterio");
		for (int i = 0; i < limite; i++) {
			System.out.println(recomendadas.get(i));
		}
	}
}