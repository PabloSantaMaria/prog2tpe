package prog2tpe;

import java.util.Iterator;

public class CondicionPorGenerosPreferidos implements CondicionStrategy {
	private Cliente cliente;
	
	public CondicionPorGenerosPreferidos() {
		this.cliente = null;
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