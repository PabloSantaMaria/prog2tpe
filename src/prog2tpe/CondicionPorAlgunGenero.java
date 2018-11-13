package prog2tpe;

import java.util.Iterator;

public class CondicionPorAlgunGenero implements CondicionStrategy {
	private Cliente cliente;
	
	public CondicionPorAlgunGenero() {
		this.cliente = null;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public boolean cumpleCriterio(Pelicula pelicula) {
		boolean contieneAlguno = false;
		Iterator<Genero> generosCliente = cliente.getGenerosPreferidos().iterator();
		while (generosCliente.hasNext() && contieneAlguno == false) {
			Genero generoCliente = generosCliente.next();
			if (pelicula.getGeneros().contains(generoCliente))
				contieneAlguno = true;
		}
		return contieneAlguno;
	}
}