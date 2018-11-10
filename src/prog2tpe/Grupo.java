package prog2tpe;

import java.util.Vector;

public class Grupo extends Cliente {
	private String nombre;
	private Vector<Cliente> integrantes;
	private Vector<String> generos;
	
	public Grupo (String nombre){
		this.nombre = nombre;
		this.integrantes = new Vector<Cliente>();
		this.generos = new Vector<String>();
	}

	public String getNombre(){
		return nombre;
	}
	
	public Vector<String> getGeneros(){
		return generos;
	}
	
	public String toString(){
		String imprimir = ("\033[34m"+"Nombre: "+nombre+". " );
		String auxImprimir = " ";
		for (int i = 0; i < integrantes.size(); i++) {
			auxImprimir += integrantes.elementAt(i).toString()+" ";
		}
		imprimir += "integrantes del grupo : "+ auxImprimir;
		return imprimir;
	}
	
	public void valorar(Pelicula p, int valor){
		for(int i=0; i<integrantes.size(); i++){
			integrantes.elementAt(i).valorar(p,valor);			
		}
		
	}
	
	public void agregarGeneros(String g){
		if(!generos.contains(g)){
			generos.add(g);
		}
	}
	
	public void agregarIntegrantes(Cliente c){
		if (!integrantes.contains(c)){
			integrantes.add(c);
		}	
	}
}
