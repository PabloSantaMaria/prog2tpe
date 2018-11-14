package prog2tpe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BusquedaOR implements BusquedaStrategy {
	private BusquedaStrategy[] criterios;
	
	public BusquedaOR(BusquedaStrategy... criterios) {
		this.criterios = criterios;
	}

	@Override
	public List<Pelicula> buscar(List<Pelicula> peliculas) {
		Set<Pelicula> aux = new HashSet<Pelicula>();
		for (BusquedaStrategy criterio : criterios) {
			aux.addAll(criterio.buscar(peliculas));
		}
		return new ArrayList<>(aux);	
	}
}