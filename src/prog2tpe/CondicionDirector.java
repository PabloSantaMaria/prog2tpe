package prog2tpe;

public class CondicionDirector implements Condicion{
	private String valor;
	
	public CondicionDirector(String valor){
		this.valor = valor;
	}
	
	public boolean cumple(Pelicula e1) {
		return (e1).getDirector().toLowerCase().contains(valor.toLowerCase());
	}		
}