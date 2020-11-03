package trabajoEspecial;

public class Main {

	public static void main(String[] args) {
		
		int cantRondas = 20;
		String nomMazo = "Mazo super heroes";
		String rutaJson = "./superheroes.json";
		
		Jugador j1 = new Jugador("Juan");
		Jugador j2 = new Jugador("Pedro");
		Juego juego = new Juego(cantRondas,j1,j2,nomMazo,rutaJson);
		
		System.out.println(juego.jugar());
	}
}
