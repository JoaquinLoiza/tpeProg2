package trabajoEspecial;

import java.util.ArrayList;

public class Juego {
	
	private int rondasMax;
	private Jugador j1;
	private Jugador j2;
	private Mazo mazo;
	
	//Averiguar si corresponden aca o en el Main
	public static int numRonda = 1;
	public static Jugador ganadorRondaAnt = null;
	public static int posicionAtributo = -1;
	public static Atributo atrJ1 = null;
	public static Atributo atrJ2 = null;
	public static boolean empate = false;
	
	public Juego(int rondas, Jugador j1, Jugador j2, Mazo mazo) {
		this.rondasMax = rondas;
		this.j1 = j1;
		this.j2 = j2;
		this.mazo = mazo;
	}
	
	//------- Getters and Setters--------
	
	public Jugador getJugador1() {
		return this.j1;
	}
	
	public Jugador getJugador2() {
		return this.j2;
	}
		
	public int getRondasMax() {
		return rondasMax;
	}
	
	public Mazo getMazo() {
		return this.mazo;
	}
	
	public void setRondasMax(int cant) {
		this.rondasMax = cant;
	}
	
	private void setRonda(int num) {
		numRonda = num;
	}
	
	private void setPosicion(int num) {
		posicionAtributo = num;
	}
	
	private void setAtributos(Atributo a1, Atributo a2) {
		atrJ1 = a1;
		atrJ2 = a2;
	}
	
	private ArrayList<Carta> mezclarMazo(Mazo mazo){
		
		ArrayList<Carta> copiaMazo = new ArrayList<>();
		copiaMazo.addAll(mazo.getCartas());
		ArrayList<Carta> aux = new ArrayList<>();
		
		while(!copiaMazo.isEmpty()){
			int num = (int)(Math.random()*copiaMazo.size());
			aux.add(copiaMazo.get(num));
			copiaMazo.remove(copiaMazo.get(num));	
		}
		return aux;
	}

	private void repartirMazo() {
		boolean aux = false;
		for(Carta carta : this.mezclarMazo(this.mazo)) {
			if (aux == false) {
				this.j1.addCartas(carta);
				aux=true;
			}
			else {
				this.j2.addCartas(carta);
				aux=false;
			}
		}
	}
	
	private Jugador turnoJugador() {
		if (ganadorRondaAnt == this.j1) {
			return this.j1;
		} else
			return this.j2;
	}
	
	private void buscarPosicion() {
		int aux = -1;
		
		if (numRonda == 1) {
			aux = this.j1.selecAtributo();
			this.setPosicion(aux);
		}
		else {
			aux = this.turnoJugador().selecAtributo();
			this.setPosicion(aux);
		}
	}
	
	private void ganadorRonda() {
		this.buscarPosicion();
		compararAtributos();
	}

	private void compararAtributos() {
		
		empate= false;
		Atributo aJ1 = this.j1.getPrimerCarta().getAtributo(posicionAtributo);
		Atributo aJ2 = this.j2.getPrimerCarta().getAtributo(posicionAtributo);
		setAtributos(aJ1, aJ2);
		int valorCartaJ1 = (int)atrJ1.getValor();
		int valorCartaJ2 = (int)atrJ2.getValor();
		
		if(valorCartaJ1 > valorCartaJ2) {
			moverCartas(this.j1, this.j2);
			ganadorRondaAnt = this.j1;
		}
		else if (valorCartaJ1 < valorCartaJ2) {
			moverCartas(this.j2, this.j1);
			ganadorRondaAnt = this.j2;
		}
		else {
			this.j1.moverCartaAlFinal();
			this.j2.moverCartaAlFinal();
			empate= true;
		}
	}
	
	private void moverCartas(Jugador j1, Jugador j2) {
		Carta cartaPerdida = null;
		
		j1.moverCartaAlFinal();
		cartaPerdida = j2.getPrimerCarta();
		j2.eliminarCarta();
		j1.addCartas(cartaPerdida);
	}
	
	public void jugar(){
		
		this.repartirMazo();

		while(this.j1.cantCartas() != 0 && this.j2.cantCartas() != 0 &&  numRonda < this.rondasMax){
			
			this.ganadorRonda();

			System.out.println(this);
			if (empate == false) {
				this.setRonda(numRonda+1);
			}
		}
	}

	@Override
	public String toString() {
		
		return  "\nRonda N�: " + numRonda +
				"\nAtributo Seleccionado: " + atrJ1.getNombre() +
				"\nValor J1: " + atrJ1.getValor() +
				"\nValor J2: " + atrJ2.getValor() +
				"\nGanador ronda: " + ganadorRondaAnt.getNombre() +
				"\nCantidad cartas " + this.j1.getNombre() +": "+j1.cantCartas() +
				"\nCantidad cartas " + this.j2.getNombre() +": "+j2.cantCartas() + "\n";
	}
}
