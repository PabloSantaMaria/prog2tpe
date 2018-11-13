package prog2tpe;

import java.util.Iterator;

public class RecomendacionPorGenerosPreferidos implements RecomendacionStrategy {
	private Cliente cliente;
	
	public RecomendacionPorGenerosPreferidos() {
		this.cliente = null;
	}
	
	@Override
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public boolean cumpleCriterio(Pelicula pelicula) {
		boolean contieneTodos = true;
		Iterator<Genero> generosCliente = cliente.getGenerosPreferidos().iterator();
		while (generosCliente.hasNext() && contieneTodos) {
			Genero generoCliente = generosCliente.next();
			if (!pelicula.getGeneros().contains(generoCliente))
				contieneTodos = false;
		}
		return contieneTodos;
	}
}