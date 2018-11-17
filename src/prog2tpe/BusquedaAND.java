package prog2tpe;

import java.util.List;

/**
 * Recibe m�ltiples criterios de b�squeda y devuelve una lista con todas las pel�culas que los cumplen.
 * Usa varargs.
 */
public class BusquedaAND implements BusquedaStrategy {
	private BusquedaStrategy[] criterios;
	
	public BusquedaAND(BusquedaStrategy... criterios) {
		this.criterios = criterios;
	}

	@Override
	public List<Pelicula> buscar(List<Pelicula> peliculas) {
		List<Pelicula> salida = peliculas;
		for (BusquedaStrategy criterio : criterios) {
			List<Pelicula> aux = criterio.buscar(salida);
			salida = aux;
		}
		return salida;
	}
}