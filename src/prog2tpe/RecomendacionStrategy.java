package prog2tpe;

public interface RecomendacionStrategy {
	public Cliente getCliente();
	public void setCliente(Cliente cliente);
	public boolean cumpleCriterio(Pelicula pelicula);
}
