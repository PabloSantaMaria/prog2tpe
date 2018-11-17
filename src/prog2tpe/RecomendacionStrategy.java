package prog2tpe;
/**
 * Interface que implementan las estrategias de recomendaciones
 */
public interface RecomendacionStrategy {
	public Cliente getCliente();
	public void setCliente(Cliente cliente);
	public boolean cumpleCriterio(Pelicula pelicula);
}
