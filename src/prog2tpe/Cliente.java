package prog2tpe;

import java.util.List;

public abstract class Cliente {
	protected String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public void valorarPelicula(Pelicula p, int valoracion) {
		if (valoracion >= 1 && valoracion <= 5)
			p.valorar(valoracion);
	}
	
	public abstract void verPelicula(Pelicula p);
	public abstract List<Pelicula> getPeliculasVistas();
	public abstract List<Genero> getGenerosPreferidos();
}