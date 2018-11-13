package prog2tpe;

import java.util.List;

public abstract class Cliente {
	protected String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public abstract void verPelicula(Pelicula pelicula);
	public abstract List<Pelicula> getPeliculasVistas();
	public abstract List<Genero> getGenerosPreferidos();
	
	public void valorarPelicula(Pelicula p, int valoracion) {
		if (valoracion >= 1 && valoracion <= 5)
			p.valorar(valoracion);
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Cliente c = (Cliente) o;
		return this.getNombre() == c.getNombre();
	}
	public String toString() {
		return this.nombre;
	}
}