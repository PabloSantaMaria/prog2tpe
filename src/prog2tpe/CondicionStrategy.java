package prog2tpe;

public interface CondicionStrategy {
	public void setCliente(Cliente cliente);
	public boolean cumpleCriterio(Pelicula pelicula);
}
