package trabajoEspecial;

public class Juego {
	
	private int rondasMax;
	
	//Averiguar si corresponden aca o en el Main
	public static int numRonda = 1;
	public static Jugador jugadorGanadorRonda = null;
	
	public Juego(int rondas) {
		this.rondasMax = rondas;
	}
	
	public void repartirMazo(Mazo mazo, Jugador j1, Jugador j2) {
		boolean aux = false;
		for(Carta carta : mazo.getCartas()) {
			if (aux == false) {
				j1.addCartas(carta);
				aux=true;
			}
			else {
				j2.addCartas(carta);
				aux=false;
			}
		}
	}
	
	public Jugador jugadorQueDecide(Jugador j1, Jugador j2) {
		if (jugadorGanadorRonda == j1) {
			return j1;
		} else
			return j2;
	}
	
	public Jugador ganadorRonda(Jugador j1, Jugador j2) {
		int aux = -1;
		
		if (numRonda == 1) {
			aux = j1.selecAtributo();
		} 
		else {
			aux = this.jugadorQueDecide(j1,j2).selecAtributo();
		}
		
		compararAtributos(j1,j2,aux);
	}

	private void compararAtributos(Jugador j1, Jugador j2, int aux) {
		int valorCartaJ1 = (int)j1.getPrimerCarta().getAtributo(aux).getValor();
		int valorCartaJ2 = (int)j2.getPrimerCarta().getAtributo(aux).getValor();
	
		if(valorCartaJ1 > valorCartaJ2) {
			moverCartas(j1, j2);
			jugadorGanadorRonda = j1;
		}
		else if (valorCartaJ1 < valorCartaJ2) {
			moverCartas(j2, j1);
			jugadorGanadorRonda = j2;
		}
		else {
			j1.moverCartaAlFinal();
			j2.moverCartaAlFinal();
		}
	}
	
	public void moverCartas(Jugador j1, Jugador j2) {
		Carta cartaPerdida = null;
		
		j1.moverCartaAlFinal();
		cartaPerdida = j2.getPrimerCarta();
		j2.eliminarCarta();
		j1.addCartas(cartaPerdida);
	}
}