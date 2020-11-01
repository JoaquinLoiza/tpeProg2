package trabajoEspecial;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private ArrayList <Carta> cartas;
	
	public Jugador (String nombre) {
		this.nombre= nombre;
		this.cartas= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addCartas(Carta carta) {
		this.cartas.add(carta);
	}
	
	public int selecAtributo() {
		int tamano = -1;	
		if (this.cantCartas() != 0) {
			tamano = this.cartas.get(0).getTamano();
			return (int)(Math.random()*tamano);
		}else
			return tamano;
	}
	
	public Carta getPrimerCarta() {
		return this.cartas.get(0);
	}

	public void moverCartaAlFinal() {
		Carta primerCarta = cartas.get(0);
		this.eliminarCarta();
		this.cartas.add(primerCarta);
	}

	public void eliminarCarta() {
		this.cartas.remove(0);
	}
	
	public int cantCartas() {
		return cartas.size();
	}
}
