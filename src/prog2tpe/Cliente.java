package prog2tpe;

import java.util.Iterator;
import java.util.List;
/*
 * Objeto Componente abstracto.
 * Define los métodos que deben implementar las Hojas y Compuestos.
 * Abstrae atributos y comportamientos comunes para Hojas y Compuestos.
 */
public abstract class Cliente {
	private static final int CALIFICACION_MINIMA = 1;
	private static final int CALIFICACION_MAXIMA = 5;
	protected String nombre;
	/**
	 * Constructor
	 * @param nombre
	 */
	protected Cliente(String nombre) {
		this.nombre = nombre;
	}
	/*
	 * Getters
	 */
	public String getNombre() { return nombre; }
	/*
	 * Setters
	 */
	public void setNombre(String nombre) { this.nombre = nombre; }
	/*
	 * Métodos abstractos
	 */
	public abstract void verPelicula(Pelicula pelicula);
	protected abstract List<Pelicula> getPeliculasVistas();
	protected abstract List<Genero> getGenerosPreferidos();
	/**
	 * Otorga una manera de recorrer las películas vistas sin revelar la estructura
	 * @return: un iterator de tipo Pelicula
	 */
	public Iterator<Pelicula> getPeliculasIterator() {
		return this.getPeliculasVistas().iterator();
	}
	/**
	 * Otorga una manera de recorrer los géneros preferidos sin revelar la estructura
	 * @return: un iterator de tipo Genero
	 */
	public Iterator<Genero> getGenerosIterator() {
		return this.getGenerosPreferidos().iterator();
	}
	/**
	 * Valora una película con puntaje entre constantes CALIFICACION_MINIMA y CALIFICACION_MAXIMA
	 * @param p:	objeto tipo Pelicula
	 * @param valoracion:	puntaje tipo int
	 * @return: void
	 */
	public void valorarPelicula(Pelicula p, int valoracion) {
		if (valoracion >= CALIFICACION_MINIMA && valoracion <= CALIFICACION_MAXIMA)
			p.valorar(valoracion);
	}
	
	@Override
	/*
	 * Define la igualdad del objeto Cliente por su nombre.
	 */
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Cliente c = (Cliente) o;
		return this.getNombre().equals(c.getNombre());
	}
	@Override
	public String toString() {
		return this.nombre;
	}
}