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
		int tamaño = -1;	
		if (this.cantCartas() != 0) {
			tamaño = this.cartas.get(0).getTamaño();
			return (int)(Math.random()*tamaño+1);
		}else
			return tamaño;
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

	@Override
	public String toString() {	
		return "El jugador: " + this.getNombre() + "\nCantidad de cartas: "+this.cantCartas();
	}
}
