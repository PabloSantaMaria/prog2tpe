package prog2tpe;

import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		SistemaDeRecomendacion sistema = new SistemaDeRecomendacion();
		
		Genero Romantico = new Genero("Rom�ntico");
		Genero Musical = new Genero("Musical");
		Genero Infantil = new Genero("Infantil");
		Genero Aventura = new Genero("Aventura");
		Genero Accion = new Genero("Acci�n");
		Genero Drama = new Genero("Drama");
		Genero Comedia = new Genero("Comedia");
		
		Usuario Lisa = new Usuario("Lisa");
		Lisa.addGeneroPreferido(Romantico);
		Lisa.addGeneroPreferido(Musical);
		Lisa.addGeneroPreferido(Infantil);
		Lisa.addGeneroPreferido(Aventura);
		Usuario Bart = new Usuario("Bart");
		Bart.addGeneroPreferido(Musical);
		Bart.addGeneroPreferido(Infantil);
		Bart.addGeneroPreferido(Aventura);
		Bart.addGeneroPreferido(Accion);
		Usuario Maggie = new Usuario("Maggie");
		Maggie.addGeneroPreferido(Musical);
		Maggie.addGeneroPreferido(Infantil);
		Maggie.addGeneroPreferido(Aventura);
		Usuario Marge = new Usuario("Marge");
		Marge.addGeneroPreferido(Romantico);
		Marge.addGeneroPreferido(Musical);
		Marge.addGeneroPreferido(Infantil);
		Marge.addGeneroPreferido(Aventura);
		Usuario Homero = new Usuario("Homero");
		Homero.addGeneroPreferido(Musical);
		Homero.addGeneroPreferido(Infantil);
		Homero.addGeneroPreferido(Accion);
		
		Grupo HombresSimpson = new Grupo("Hombres Simpson");
		HombresSimpson.addIntegrante(Homero);
		HombresSimpson.addIntegrante(Bart);
		Grupo HermanosSimpson = new Grupo("Hermanos Simpson");
		HermanosSimpson.addIntegrante(Lisa);
		HermanosSimpson.addIntegrante(Bart);
		HermanosSimpson.addIntegrante(Maggie);
		Grupo FamiliaSimpson = new Grupo("Familia Simpson");
		FamiliaSimpson.addIntegrante(HermanosSimpson);
		FamiliaSimpson.addIntegrante(Homero);
		FamiliaSimpson.addIntegrante(Marge);
		
		Pelicula Up = new Pelicula("Up : una aventura de altura", 2009);
		Up.setSinopsis("Carl Fredricksen es un vendedor de globos de 78 a�os de edad dispuesto a cumplir su sue�o: atar miles de globos a su casa y volar a Sudam�rica. Sin embargo, descubre demasiado tarde a un joven e inesperado poliz�n. Lo que en principio ser� recelo, acabar� por tornarse simpat�a hacia el muchacho mientras juntos pasan fascinantes aventuras en ex�ticos lugares.");
		Up.addDirector("Pete Docter");
		Up.addDirector("Bob Peterson");
		Up.addActor("Pete Docter");
		Up.addActor("Ed Asner");
		Up.addActor("Bob Peterson");
		Up.addActor("Jordan Nagai");
		Up.addGenero(Infantil);
		Up.addGenero(Accion);
		Up.addGenero(Drama);
		Pelicula LosSimpson = new Pelicula("Los Simpson: la pel�cula", 2007);
		LosSimpson.setSinopsis("La combinaci�n de Homero (Dan Castellaneta), su nuevo puerco mascota, y un silo lleno de excremento podr�an provocar un desastre que amenace no s�lo a Springfield, sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson, dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara para intentar redimirse con la intenci�n de salvar al mundo y ganarse el perd�n de Marge (Julie Kavner).");
		LosSimpson.addDirector("David Silverman");
		LosSimpson.addActor("Dan Castellaneta");
		LosSimpson.addActor("Harry Shearer");
		LosSimpson.addActor("Julie Kavner");
		LosSimpson.addGenero(Infantil);
		LosSimpson.addGenero(Romantico);
		LosSimpson.addGenero(Musical);
		LosSimpson.addGenero(Aventura);
		LosSimpson.addGenero(Comedia);
		Pelicula LosIncreibles = new Pelicula("Los Incre�bles", 2004);
		LosIncreibles.setSinopsis("Un s�per h�roe retirado lucha contra el aburrimiento en un suburbio y junto con su familia tiene la oportunidad de salvar al mundo.");
		LosIncreibles.addDirector("Brad Bird");
		LosIncreibles.addActor("Brad Bird");
		LosIncreibles.addActor("Craig T. Nelson");
		LosIncreibles.addActor("Holly Hunter");
		LosIncreibles.addGenero(Infantil);
		LosIncreibles.addGenero(Musical);
		LosIncreibles.addGenero(Aventura);
		LosIncreibles.addGenero(Accion);
		Pelicula LosIncreibles2 = new Pelicula("Los Incre�bles 2", 2018);
		LosIncreibles2.setSinopsis("Helen entra en acci�n y debe luchar contra un cibercriminal que planea hipnotizar el mundo a trav�s de las pantallas de las computadoras. Eso deja al Sr. Incre�ble con uno de sus mayores desaf�os: quedarse en casa y cuidar de tres ni�os traviesos.");
		LosIncreibles2.addDirector("Brad Bird");
		LosIncreibles2.addActor("Brad Bird");
		LosIncreibles2.addActor("Craig T. Nelson");
		LosIncreibles2.addActor("Holly Hunter");
		LosIncreibles2.addGenero(Infantil);
		LosIncreibles2.addGenero(Musical);
		LosIncreibles2.addGenero(Aventura);
		LosIncreibles2.addGenero(Accion);
		Pelicula ToyStory = new Pelicula("Toy Story", 1995);
		ToyStory.setSinopsis("Lo mejor de la animaci�n computarizada produce esta historia sobre juguetes que cobran vida cuando su due�o se ausenta.");
		ToyStory.addDirector("John Lasseter");
		ToyStory.addActor("Tim Allen");
		ToyStory.addActor("Tom Hanks");
		ToyStory.addActor("Don Rickles");
		ToyStory.addActor("Wallace Shawn");
		ToyStory.addGenero(Infantil);
		ToyStory.addGenero(Aventura);
		ToyStory.addGenero(Accion);
		Pelicula MonstersInc = new Pelicula("Monsters Inc.", 2001);
		MonstersInc.setSinopsis("Monsters, Incorporated es la f�brica de sustos m�s grande en el mundo de los monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores. Sullivan es un monstruo grande e intimidante de piel azul, grandes manchas color p�rpura y cuernos. Su asistente, mejor amigo y compa�ero de cuarto es Mike Wazowski (Billy Crystal), un peque�o y alegre monstruo verde con un solo ojo. Boo (Mary Gibbs), una ni�a peque�a visita lugares en donde nunca antes hab�a estado un ser humano.");
		MonstersInc.addDirector("Pete Docter");
		MonstersInc.addActor("John Goodman");
		MonstersInc.addActor("Billy Crystal");
		MonstersInc.addActor("John Ratzenberger");
		MonstersInc.addGenero(Infantil);
		MonstersInc.addGenero(Aventura);
		MonstersInc.addGenero(Accion);
		MonstersInc.addGenero(Musical);
		
		sistema.addCliente(Lisa);
		sistema.addCliente(Bart);
		sistema.addCliente(Maggie);
		sistema.addCliente(Marge);
		sistema.addCliente(Homero);
		sistema.addCliente(HombresSimpson);
		sistema.addCliente(HermanosSimpson);
		sistema.addCliente(FamiliaSimpson);
		sistema.addPelicula(MonstersInc);
		sistema.addPelicula(ToyStory);
		sistema.addPelicula(LosIncreibles2);
		sistema.addPelicula(LosIncreibles);
		sistema.addPelicula(LosSimpson);
		sistema.addPelicula(Up);
		
		Lisa.verPelicula(LosIncreibles);
		Lisa.valorarPelicula(LosIncreibles, 5);
		Bart.verPelicula(LosIncreibles);
		Bart.valorarPelicula(LosIncreibles, 2);
		Homero.verPelicula(LosIncreibles);
		Homero.valorarPelicula(LosIncreibles, 4);
		Marge.verPelicula(LosIncreibles);
		Marge.valorarPelicula(LosIncreibles, 2);
		
		Marge.verPelicula(LosIncreibles2);
		Marge.valorarPelicula(LosIncreibles2, 5);
		
		Maggie.verPelicula(ToyStory);
		Maggie.valorarPelicula(ToyStory, 1);
		
		RecomendacionStrategy todosLosGeneros = new RecomendacionPorGenerosPreferidos();
		RecomendacionStrategy algunGenero = new RecomendacionPorAlgunGenero();
		Comparator<Pelicula> popularidad = new ComparadorPopularidad();
		Comparator<Pelicula> puntaje = new ComparadorPuntaje();
		
		//RESOLUCION
		//1.
		System.out.println("<< Punto 1 >>");
		sistema.listarPeliculasVistas(Marge);
		
		//2.
		System.out.println("\n<< Punto 2 >>");
		sistema.listarPeliculasVistas(Bart);
		
		//3.
		System.out.println("\n<< Punto 3 >>");
		System.out.println("Recomendadas que incluyen TODOS los g�neros, ordenadas por popularidad:");
		System.out.println("\nPara Lisa:");
		sistema.recomendar(Lisa, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Bart:");
		sistema.recomendar(Bart, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Maggie:");
		sistema.recomendar(Maggie, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Marge:");
		sistema.recomendar(Marge, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Homero:");
		sistema.recomendar(Homero, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Hombres Simpson:");
		sistema.recomendar(HombresSimpson, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Hermanos Simpson:");
		sistema.recomendar(HermanosSimpson, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Familia Simpson:");
		sistema.recomendar(FamiliaSimpson, todosLosGeneros, popularidad, 2);
		
		//4.
		System.out.println("\n<< Punto 4 >>");
		System.out.println("Recomendadas que incluyen ALG�N g�nero, ordenadas por puntaje:");
		System.out.println("\nPara Lisa:");
		sistema.recomendar(Lisa, algunGenero, puntaje, 5);
		System.out.println("\nPara Bart:");
		sistema.recomendar(Bart, algunGenero, puntaje, 5);
		System.out.println("\nPara Maggie:");
		sistema.recomendar(Maggie, algunGenero, puntaje, 5);
		System.out.println("\nPara Marge:");
		sistema.recomendar(Marge, algunGenero, puntaje, 5);
		System.out.println("\nPara Homero:");
		sistema.recomendar(Homero, algunGenero, puntaje, 5);
		System.out.println("\nPara Hombres Simpson:");
		sistema.recomendar(HombresSimpson, algunGenero, puntaje, 5);
		System.out.println("\nPara Hermanos Simpson:");
		sistema.recomendar(HermanosSimpson, algunGenero, puntaje, 5);
		System.out.println("\nPara Familia Simpson:");
		sistema.recomendar(FamiliaSimpson, algunGenero, puntaje, 5);
		
		//5.
		HermanosSimpson.verPelicula(Up);
		HermanosSimpson.valorarPelicula(Up, 4);
		
		//6.
		System.out.println("\n<< Punto 6 >>");
		System.out.println("\n<< Punto 2 bis >>");
		sistema.listarPeliculasVistas(Bart);
		
		System.out.println("\n<< Punto 3 bis >>");
		System.out.println("Recomendadas que incluyen TODOS los g�neros, ordenadas por popularidad:");
		System.out.println("\nPara Lisa:");
		sistema.recomendar(Lisa, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Bart:");
		sistema.recomendar(Bart, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Maggie:");
		sistema.recomendar(Maggie, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Marge:");
		sistema.recomendar(Marge, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Homero:");
		sistema.recomendar(Homero, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Hombres Simpson:");
		sistema.recomendar(HombresSimpson, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Hermanos Simpson:");
		sistema.recomendar(HermanosSimpson, todosLosGeneros, popularidad, 2);
		System.out.println("\nPara Familia Simpson:");
		sistema.recomendar(FamiliaSimpson, todosLosGeneros, popularidad, 2);
		
		System.out.println("\n<< Punto 4 bis >>");
		System.out.println("Recomendadas que incluyen ALG�N g�nero, ordenadas por puntaje:");
		System.out.println("\nPara Lisa:");
		sistema.recomendar(Lisa, algunGenero, puntaje, 5);
		System.out.println("\nPara Bart:");
		sistema.recomendar(Bart, algunGenero, puntaje, 5);
		System.out.println("\nPara Maggie:");
		sistema.recomendar(Maggie, algunGenero, puntaje, 5);
		System.out.println("\nPara Marge:");
		sistema.recomendar(Marge, algunGenero, puntaje, 5);
		System.out.println("\nPara Homero:");
		sistema.recomendar(Homero, algunGenero, puntaje, 5);
		System.out.println("\nPara Hombres Simpson:");
		sistema.recomendar(HombresSimpson, algunGenero, puntaje, 5);
		System.out.println("\nPara Hermanos Simpson:");
		sistema.recomendar(HermanosSimpson, algunGenero, puntaje, 5);
		System.out.println("\nPara Familia Simpson:");
		sistema.recomendar(FamiliaSimpson, algunGenero, puntaje, 5);
		
		//7.a
		System.out.println("\n<< Punto 7.a >>");
		System.out.println("Resultados de pel�culas en las que haya actuado y dirigido Pete Docter:\n");
		sistema.buscar(new BusquedaAND(new BusquedaPorActor("Pete Docter"), new BusquedaPorDirector("Pete Docter")));
		
		//7.b
		System.out.println("\n<< Punto 7.b >>");
		System.out.println("Resultados de pel�culas en las que haya actuado Tom Hanks:\n");
		sistema.buscar(new BusquedaPorActor("Tom Hanks"));
		
		//7.c
		System.out.println("\n<< Punto 7.c >>");
		System.out.println("Resultados de pel�culas estrenadas a partir del a�o 2000:\n");
		sistema.buscar(new BusquedaPorAnio(2000, 2018));
		
		//7.d
		System.out.println("\n<< Punto 7.d >>");
		System.out.println("Resultados de pel�culas del genero Rom�ntico, Comedia, o Drama:\n");
		sistema.buscar(new BusquedaOR(new BusquedaPorGenero(Romantico), new BusquedaPorGenero(Comedia), new BusquedaPorGenero(Drama)));
	}
}