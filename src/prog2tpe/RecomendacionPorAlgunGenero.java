package prog2tpe;

import java.util.Iterator;

public class RecomendacionPorAlgunGenero implements RecomendacionStrategy {
	private Cliente cliente;
	
	public RecomendacionPorAlgunGenero() {
		this.cliente = null;
	}
	
	@Override
	public Cliente getCliente() {
		return cliente;
	}
	
	@Override
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