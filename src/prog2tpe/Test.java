package prog2tpe;

public class Test {
	public static void main(String[] args) {
		SistemaDeRecomendacion s1 = new SistemaDeRecomendacion();
		
		Pelicula p1 = new Pelicula("p1", 2000, 90);
		
		Usuario u1 = new Usuario("u1", 1);
		Usuario u2 = new Usuario("u2", 2);
		Usuario u3 = new Usuario("u3", 3);
		
		Grupo g1 = new Grupo("g1");
			g1.addIntegrante(u1);
			g1.addIntegrante(u2);
		Grupo g2 = new Grupo("g2");
			g2.addIntegrante(g1);
			g2.addIntegrante(u3);
		
		g1.verPelicula(p1);
		
		System.out.println(p1);
		System.out.println(u1.getPeliculasVistas());
		System.out.println(g1.getPeliculasVistas());
		
		u1.valorarPelicula(p1, 3);
		u2.valorarPelicula(p1, 5);
		u3.valorarPelicula(p1, 2);
		System.out.println(p1.getPuntaje());
		
		s1.addCliente(u1);
		s1.addCliente(g1);
		
		
	}
}
