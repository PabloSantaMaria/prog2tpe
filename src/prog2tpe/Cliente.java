package prog2tpe;

import java.util.List;

public abstract class Cliente {
	private static final int CALIFICACION_MINIMA = 1;
	private static final int CALIFICACION_MAXIMA = 5;
	protected String nombre;
	
	protected Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public abstract void verPelicula(Pelicula pelicula);
	public abstract List<Pelicula> getPeliculasVistas();
	public abstract List<Genero> getGenerosPreferidos();
	
	public void valorarPelicula(Pelicula p, int valoracion) {
		if (valoracion >= CALIFICACION_MINIMA && valoracion <= CALIFICACION_MAXIMA)
			p.valorar(valoracion);
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Cliente c = (Cliente) o;
		return this.getNombre().equals(c.getNombre());
	}
	public String toString() {
		return this.nombre;
	}
}