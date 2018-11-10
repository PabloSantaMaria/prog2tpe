package prog2tpe;

public class AND implements Condicion{

	Condicion uno;
	Condicion dos;
	
	public AND(Condicion c1,Condicion c2){
		this.uno = c1;
		this.dos = c2;
	}

	public boolean cumple(Pelicula e1) {
		return (uno.cumple(e1))&&(dos.cumple(e1));
	}
}
