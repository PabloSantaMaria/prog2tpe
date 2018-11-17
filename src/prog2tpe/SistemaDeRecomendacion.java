package prog2tpe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
 * Sistema que usa Clientes, sin distinci�n e independientemente de si el Cliente es Usuario o Grupo,
 * realizando b�squedas y recomendaciones de acuerdo a la lista de pel�culas que existen en el Sistema
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
	 * Imprime la lista de pel�culas vistas por un Cliente
	 * @param cliente
	 */
	public void listarPeliculasVistas(Cliente cliente) {
		Iterator<Pelicula> iterator = cliente.getPeliculasVistas().iterator();
		System.out.println("Pel�culas vistas por " + cliente + ":");
		while (iterator.hasNext()) {
			Pelicula pelicula = iterator.next();
			System.out.print(pelicula + "\n");
		}
	}
	/**
	 * Imprime una lista de pel�culas seg�n la condici�n y las ordena seg�n criterio
	 * @param cliente:	el Cliente al que se le recomienda la lista
	 * @param condicion:	condici�n concreta que tienen que cumplir las pel�culas
	 * @param ordenamiento:	criterio por el cual se ordena la lista a imprimir
	 */
	public void recomendar(Cliente cliente, RecomendacionStrategy condicion, Comparator<Pelicula> ordenamiento) {
		condicion.setCliente(cliente);
		List<Pelicula> recomendadas = getRecomendaciones(condicion);
		Collections.sort(recomendadas, ordenamiento);
		imprimirResultados(recomendadas, -1);
	}
	/**
	 * Overload del m�todo recomendar, que pone un l�mite a la lista de recomendaciones
	 * @param limite:	n�mero m�ximo de �tems
	 */
	public void recomendar(Cliente cliente, RecomendacionStrategy condicion, Comparator<Pelicula> ordenamiento, int limite) {
		condicion.setCliente(cliente);
		List<Pelicula> recomendadas = getRecomendaciones(condicion);
		Collections.sort(recomendadas, ordenamiento);
		imprimirResultados(recomendadas, limite);
	}
	/**
	 * Imprime una lista de pel�culas buscadas seg�n el criterio de b�squeda
	 * @param criterio:	criterio concreto de b�squeda
	 */
	public void buscar(BusquedaStrategy criterio) {
		List<Pelicula> resultados = criterio.buscar(peliculas);
		imprimirResultados(resultados, -1);
	}
	/**
	 * Overload de buscar que pone un l�mite a la cantidad de �tems impresos
	 * @param limite
	 */
	public void buscar(BusquedaStrategy criterio, int limite) {
		List<Pelicula> resultados = criterio.buscar(peliculas);
		imprimirResultados(resultados, limite);
	}
	/**
	 * M�todo auxiliar que busca pel�culas seg�n la condici�n de recomendaci�n
	 * @param condicion
	 * @return:	una lista de pel�culas que no haya visto el Cliente
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
	 * M�todo auxiliar que imprime una lista de pel�culas, todas o hasta un l�mite
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