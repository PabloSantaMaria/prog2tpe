package prog2tpe;

import java.util.Vector;

public class Sistema {

	public static void imprimir(Vector<Pelicula> pelCondicion){
		for(int i=0; i < pelCondicion.size(); i++){
			System.out.println(pelCondicion.elementAt(i).toString());
		}
	}

	public void ordenar(Vector<Pelicula> listado) {
		for(int k=0; k < listado.size(); k++) {
			for(int i=0;i<listado.size()-1;i++) {
				if (listado.elementAt(i).getValoracion() < listado.elementAt(i+1).getValoracion()) {
					Pelicula aux = listado.elementAt(i);
//					listado.elementAt(i) = listado.elementAt(i+1);
//					listado.elementAt(i+1) = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] vec = {"Romantico","Musical","Infantil","Aventura"};
		String[] vec2 = {"Musical","Infantil","Aventura","Accion"};
		String[] vec3 = {"Musical","Infantil","Aventura"};
		String[] vec4 = {"Musical","Infantil","Accion"}; 

		String[] genA = {"Infantil", "Drama", "Accion"};
		String[] genB = {"Infantil","Romantico" , "Aventura", "Musical"};
		String[] genC = {"Infantil", "Aventura", "Accion"};

		Usuario us1 = new Usuario("Lisa",10,vec);
		Usuario us2 = new Usuario("Bart",12,vec2);
		Usuario us3 = new Usuario("Maggie",2,vec3);
		Usuario us4 = new Usuario("Marge",28,vec);
		Usuario us5 = new Usuario("Homero",30,vec4);

		String nombreA = "Hombres Simpson";
		String nombreB = "Hermanos Simpson";
		String nombreC = "Familia Simpson";

		Grupo g1 = new Grupo(nombreA);
		Grupo g2 = new Grupo(nombreB);
		Grupo g3 = new Grupo(nombreC);

		g1.agregarIntegrantes(us2);
		g1.agregarIntegrantes(us5);

		g2.agregarIntegrantes(us1);
		g2.agregarIntegrantes(us2);
		g2.agregarIntegrantes(us3);

		g3.agregarIntegrantes(us4);
		g3.agregarIntegrantes(us5);
		g3.agregarIntegrantes(g2);

		int duracion=2;

		Pelicula p1= new Pelicula("UP: una aventura de altura","Pete Docter"+ "Bob Peterson",genA,duracion,2009);  
		p1.agregarActores("Pete Docter");
		p1.agregarActores("Ed Asner");
		p1.agregarActores("Bob Peterson");
		p1.agregarActores("Jordan Nagai");
		Pelicula p2= new Pelicula("Los Simpson: la pelicula","David Silverman",genB,duracion,2007);
		p2.agregarActores("Dan Castellaneta");
		p2.agregarActores("Harry Shearerr");
		p2.agregarActores("Julie Kavner");
		Pelicula p3= new Pelicula("Los increibles","Brad Bird",vec2,duracion,2004);
		p3.agregarActores("Brad Bird");
		p3.agregarActores("Craig T. Nelson");
		p3.agregarActores("Holly Hunter");
		Pelicula p4= new Pelicula("Los increibles 2","Brad Bird",vec2,duracion,2018);
		p4.agregarActores("Brad Bird");
		p4.agregarActores("Craig T. Nelson");
		p4.agregarActores("Holly Hunter");
		Pelicula p5= new Pelicula("Toy Story","John Lasseter",genC,duracion,1995);
		p5.agregarActores("Tim Allen");
		p5.agregarActores("Tom Hanks");
		p5.agregarActores("Don Rickles");
		p5.agregarActores("Wallace Shawn");
		Pelicula p6= new Pelicula("Monsters Inc.","Pete Docter",vec2,duracion,2001);
		p6.agregarActores("John Goodman");
		p6.agregarActores("Billy Crystal");
		p6.agregarActores("John Ratzenberger");

		Vector<Pelicula> PelCondicion = new Vector<Pelicula>();
		Vector<Pelicula> listado = new Vector<Pelicula>();
		listado.add(p1);
		listado.add(p2);
		listado.add(p3);
		listado.add(p4);
		listado.add(p5);
		listado.add(p6);

		CondicionDirector c1= new CondicionDirector("Pete Docter");
		CondicionGenero c2= new CondicionGenero("Infantil");
		CondicionGenero c3= new CondicionGenero("Ed Asner");
		AND c4= new AND(c2,c1);

		for(int i=0; i<listado.size(); i++){
			if(listado.elementAt(i).coincide(c4)){
				PelCondicion.addElement(listado.elementAt(i));
			}
		}

		imprimir(PelCondicion);


		//System.out.println(p1.toString());
		//System.out.println(us1.toString());
		//System.out.println(g3.toString());
		//System.out.println(p1.toString());
		//System.out.println(p1.toStringGeneros());
		//System.out.println("Condicion3: " + p1.coincide(c3));
	}
}
