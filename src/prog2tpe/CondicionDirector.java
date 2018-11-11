package prog2tpe;

public class CondicionDirector implements Condicion {
	///no entiendo
	
	
	private String director;
	
	public CondicionDirector(String director) {
		this.director = director;
	}
	
	public boolean cumple(Pelicula p) {
		for (String director : p.getDirectores()) {
			if (p.getDirectores().contains(director))
				return true;
		}
		return false;
	}		
}