package prog2tpe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
 * Sistema que usa Clientes, sin distinción e independientemente de si el Cliente es Usuario o Grupo,
 * realizando búsquedas y recomendaciones de acuerdo a la lista de películas que existen en el Sistema
 */
public class SistemaDeRecomendacion {
	private List<Cliente> clientes;
	private List<Pelicula> peliculas;

	public SistemaDeRecomendacion() {
		this.clientes = new ArrayList<Cliente>();
		this.peliculas = new ArrayList<Pelicula>();
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
	/**
	 * Imprime la lista de películas vistas por un Cliente
	 * @param cliente
	 */
	public void listarPeliculasVistas(Cliente cliente) {
		Iterator<Pelicula> iterator = cliente.getPeliculasVistas().iterator();
		System.out.println("Películas vistas por " + cliente + ":");
		while (iterator.hasNext()) {
			Pelicula pelicula = iterator.next();
			System.out.print(pelicula + "\n");
		}
	}
	/**
	 * Imprime una lista de películas según la condición y las ordena según criterio
	 * @param cliente:	el Cliente al que se le recomienda la lista
	 * @param condicion:	condición concreta que tienen que cumplir las películas
	 * @param ordenamiento:	criterio por el cual se ordena la lista a imprimir
	 */
	public void recomendar(Cliente cliente, RecomendacionStrategy condicion, Comparator<Pelicula> ordenamiento) {
		condicion.setCliente(cliente);
		List<Pelicula> recomendadas = getRecomendaciones(condicion);
		Collections.sort(recomendadas, ordenamiento);
		imprimirResultados(recomendadas, -1);
	}
	/**
	 * Overload del método recomendar, que pone un límite a la lista de recomendaciones
	 * @param limite:	número máximo de ítems
	 */
	public void recomendar(Cliente cliente, RecomendacionStrategy condicion, Comparator<Pelicula> ordenamiento, int limite) {
		condicion.setCliente(cliente);
		List<Pelicula> recomendadas = getRecomendaciones(condicion);
		Collections.sort(recomendadas, ordenamiento);
		imprimirResultados(recomendadas, limite);
	}
	/**
	 * Imprime una lista de películas buscadas según el criterio de búsqueda
	 * @param criterio:	criterio concreto de búsqueda
	 */
	public void buscar(BusquedaStrategy criterio) {
		List<Pelicula> resultados = criterio.buscar(peliculas);
		imprimirResultados(resultados, -1);
	}
	/**
	 * Overload de buscar que pone un límite a la cantidad de ítems impresos
	 * @param limite
	 */
	public void buscar(BusquedaStrategy criterio, int limite) {
		List<Pelicula> resultados = criterio.buscar(peliculas);
		imprimirResultados(resultados, limite);
	}
	/**
	 * Método auxiliar que busca películas según la condición de recomendación
	 * @param condicion
	 * @return:	una lista de películas que no haya visto el Cliente
	 */
	private List<Pelicula> getRecomendaciones(RecomendacionStrategy condicion) {
		List<Pelicula> salida = new ArrayList<Pelicula>();
		for (Pelicula pelicula : peliculas) {
			if (pelicula.cumple(condicion) && !condicion.getCliente().getPeliculasVistas().contains(pelicula))
				salida.add(pelicula);
		}
		return salida;
	}
	/**
	 * Método auxiliar que imprime una lista de películas, todas o hasta un límite
	 * @param resultados
	 * @param limite
	 */
	private void imprimirResultados(List<Pelicula> resultados, int limite) {
		if (limite == -1 || resultados.size() < limite)
			limite = resultados.size();
		if (resultados.isEmpty())
			System.out.println("No existen resultados con ese criterio");
		for (int i = 0; i < limite; i++) {
			System.out.println(resultados.get(i));
		}
	}
}