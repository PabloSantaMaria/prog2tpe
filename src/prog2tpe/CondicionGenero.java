package prog2tpe;

public class CondicionGenero implements Condicion {
	private String valor;
	
	public CondicionGenero(String valor) {
		this.valor = valor;
	}
	
	public boolean cumple(Pelicula e1) {
		String[] recorre = e1.getGeneros();
		for (int i=0; i<recorre.length; i++) {
			if (recorre[i].toLowerCase().contains(valor.toLowerCase()))
				return true;
		}
		return false;
	}
}
