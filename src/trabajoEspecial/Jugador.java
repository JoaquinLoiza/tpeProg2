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
		int tama�o = -1;	
		if (this.cantCartas() != 0) {
			tama�o = this.cartas.get(0).getTama�o();
			return (int)(Math.random()*tama�o+1);
		}else
			return tama�o;
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
