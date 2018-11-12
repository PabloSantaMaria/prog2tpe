package prog2tpe;

public class Main {
	public static void main(String[] args) {
		SistemaDeRecomendacion sistema = new SistemaDeRecomendacion();
		
		Genero Romantico = new Genero("Romántico");
		Genero Musical = new Genero("Musical");
		Genero Infantil = new Genero("Infantil");
		Genero Aventura = new Genero("Aventura");
		Genero Accion = new Genero("Acción");
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
		Up.setSinopsis("Carl Fredricksen es un vendedor de globos de 78 años de edad dispuesto a cumplir su sueño: atar miles de globos a su casa y volar a Sudamérica. Sin embargo, descubre demasiado tarde a un joven e inesperado polizón. Lo que en principio será recelo, acabará por tornarse simpatía hacia el muchacho mientras juntos pasan fascinantes aventuras en exóticos lugares.");
		Up.addDirector("Pete Docter");
		Up.addDirector("Bob Peterson");
		Up.addActor("Pete Docter");
		Up.addActor("Ed Asner");
		Up.addActor("Bob Peterson");
		Up.addActor("Jordan Nagai");
		Up.addGenero(Infantil);
		Up.addGenero(Accion);
		Up.addGenero(Drama);
		Pelicula LosSimpson = new Pelicula("Los Simpson: la película", 2007);
		LosSimpson.setSinopsis("La combinación de Homero (Dan Castellaneta), su nuevo puerco mascota, y un silo lleno de excremento podrían provocar un desastre que amenace no sólo a Springfield, sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson, dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara para intentar redimirse con la intención de salvar al mundo y ganarse el perdón de Marge (Julie Kavner).");
		LosSimpson.addDirector("David Silverman");
		LosSimpson.addActor("Dan Castellaneta");
		LosSimpson.addActor("Harry Shearer");
		LosSimpson.addActor("Julie Kavner");
		LosSimpson.addGenero(Infantil);
		LosSimpson.addGenero(Romantico);
		LosSimpson.addGenero(Musical);
		LosSimpson.addGenero(Aventura);
		LosSimpson.addGenero(Comedia);
		Pelicula LosIncreibles = new Pelicula("Los Increíbles", 2004);
		LosIncreibles.setSinopsis("Un súper héroe retirado lucha contra el aburrimiento en un suburbio y junto con su familia tiene la oportunidad de salvar al mundo.");
		LosIncreibles.addDirector("Brad Bird");
		LosIncreibles.addActor("Brad Bird");
		LosIncreibles.addActor("Craig T. Nelson");
		LosIncreibles.addActor("Holly Hunter");
		LosIncreibles.addGenero(Infantil);
		LosIncreibles.addGenero(Musical);
		LosIncreibles.addGenero(Aventura);
		LosIncreibles.addGenero(Accion);
		Pelicula LosIncreibles2 = new Pelicula("Los Increíbles 2", 2018);
		LosIncreibles2.setSinopsis("Helen entra en acción y debe luchar contra un cibercriminal que planea hipnotizar el mundo a través de las pantallas de las computadoras. Eso deja al Sr. Increíble con uno de sus mayores desafíos: quedarse en casa y cuidar de tres niños traviesos.");
		LosIncreibles2.addDirector("Brad Bird");
		LosIncreibles2.addActor("Brad Bird");
		LosIncreibles2.addActor("Craig T. Nelson");
		LosIncreibles2.addActor("Holly Hunter");
		LosIncreibles2.addGenero(Infantil);
		LosIncreibles2.addGenero(Musical);
		LosIncreibles2.addGenero(Aventura);
		LosIncreibles2.addGenero(Accion);
		Pelicula ToyStory = new Pelicula("Toy Story", 1995);
		ToyStory.setSinopsis("Lo mejor de la animación computarizada produce esta historia sobre juguetes que cobran vida cuando su dueño se ausenta.");
		ToyStory.addDirector("John Lasseter");
		ToyStory.addActor("Tim Allen");
		ToyStory.addActor("Tom Hanks");
		ToyStory.addActor("Don Rickles");
		ToyStory.addActor("Wallace Shawn");
		ToyStory.addGenero(Infantil);
		ToyStory.addGenero(Aventura);
		ToyStory.addGenero(Accion);
		Pelicula MonstersInc = new Pelicula("Monsters Inc.", 2001);
		MonstersInc.setSinopsis("Monsters, Incorporated es la fábrica de sustos más grande en el mundo de los monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores. Sullivan es un monstruo grande e intimidante de piel azul, grandes manchas color púrpura y cuernos. Su asistente, mejor amigo y compañero de cuarto es Mike Wazowski (Billy Crystal), un pequeño y alegre monstruo verde con un solo ojo. Boo (Mary Gibbs), una niña pequeña visita lugares en donde nunca antes había estado un ser humano.");
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
		sistema.addGenero(Comedia);
		sistema.addGenero(Drama);
		sistema.addGenero(Accion);
		sistema.addGenero(Aventura);
		sistema.addGenero(Infantil);
		sistema.addGenero(Musical);
		sistema.addGenero(Romantico);
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
		
		//RESOLUCION
		sistema.listarPeliculasVistas(Marge);
		sistema.listarPeliculasVistas(Bart);
	}
}