package prog2tpe;

import java.util.ArrayList;
import java.util.List;
/*
 * Objeto Compuesto
 * Se compone de uno o más objetos Componente
 */
public class Grupo extends Cliente {
	private List<Cliente> integrantes;
	
	public Grupo (String nombre) {
		super(nombre);
		this.integrantes = new ArrayList<Cliente>();
	}
	/*
	 * Obtiene recursivamente las películas vistas por todos sus integrantes
	 * @return:	una lista de películas sin repetidos
	 */
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
	/*
	 * Obtiene recursivamente los géneros preferidos de todos los integrantes
	 * @return:	una lista de géneros sin repetidos
	 */
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
	
	/*
	 * Llama recursivamente al método verPelícula de cada integrante
	 * para que cada uno agregue la película como vista
	 * @return:	void
	 */
	public void verPelicula(Pelicula p) {
		for (Cliente integrante : integrantes)
			integrante.verPelicula(p);
	}
	/*
	 * Agrega un objeto Cliente a la lista de integrantes
	 * Cliente puede componerse de otros grupos de integrantes
	 * @return:	void
	 */
	public void addIntegrante(Cliente cliente) {
		if (!integrantes.contains(cliente)) {
			integrantes.add(cliente);
		}	
	}
}