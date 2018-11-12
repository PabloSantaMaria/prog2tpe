package prog2tpe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SistemaDeRecomendacion {
	private List<Cliente> clientes;
	private List<Pelicula> peliculas;
	private List<Genero> generos;

	public SistemaDeRecomendacion() {
		this.clientes = new ArrayList<Cliente>();
		this.peliculas = new ArrayList<Pelicula>();
		this.generos = new ArrayList<Genero>();
	}
	
	public void listarPeliculasVistas(Cliente cliente) {
		Iterator<Pelicula> iterator = cliente.getPeliculasVistas().iterator();
		System.out.println("Películas vistas por " + cliente + ":");
		while (iterator.hasNext()) {
			Pelicula pelicula = iterator.next();
			System.out.print(pelicula + "\n");
		}
	}

	public void crearUsuario(String nombre) {
		Usuario nuevo = new Usuario(nombre);
		if (!clientes.contains(nuevo)) {
			clientes.add(nuevo);
		}
	}
	public void crearGrupo(String nombre) {
		Grupo nuevo = new Grupo(nombre);
		if (!clientes.contains(nuevo)) {
			clientes.add(nuevo);
		}
	}
	public void addPelicula(String titulo, int anio) {
		Pelicula nueva = new Pelicula(titulo, anio);
		if (!peliculas.contains(nueva)) {
			peliculas.add(nueva);
		}
	}
	public void addGenero(String nombre) {
		Genero nuevo = new Genero(nombre);
		if (!generos.contains(nuevo)) {
			generos.add(nuevo);
		}
	}
	
	public void addCliente(Cliente cliente) {
		if (!clientes.contains(cliente)) {
			clientes.add(cliente);
		}
	}
	public void addPelicula(Pelicula pelicula) {
		if (!peliculas.contains(pelicula)) {
			peliculas.add(pelicula);
		}
	}
	public void addGenero(Genero genero) {
		if (!generos.contains(genero)) {
			generos.add(genero);
		}
	}
}
