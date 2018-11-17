package prog2tpe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Recibe m�ltiples criterios de b�squeda y devuelve una lista con todas las pel�culas que cumplen con alguno.
 * Usa varargs.
 */
public class BusquedaOR implements BusquedaStrategy {
	private BusquedaStrategy[] criterios;
	
	public BusquedaOR(BusquedaStrategy... criterios) {
		this.criterios = criterios;
	}

	@Override
	public List<Pelicula> buscar(List<Pelicula> peliculas) {
		Set<Pelicula> salida = new HashSet<Pelicula>();
		for (BusquedaStrategy criterio : criterios) {
			salida.addAll(criterio.buscar(peliculas));
		}
		return new ArrayList<>(salida);	
	}
}