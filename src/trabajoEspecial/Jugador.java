package trabajoEspecial;

import java.util.ArrayList;

import trabajoEspecial.estrategias.Estrategia;

public class Jugador {

	protected String nombre;
	protected ArrayList <Carta> cartas;
	private Estrategia estrategia;
	
	public Jugador (String nombre, Estrategia estrategia) {
		this.nombre = nombre;
		this.cartas = new ArrayList<>();
		this.estrategia = estrategia;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addCartas(Carta carta) {
		this.cartas.add(carta);
	}
	
	public void setEstrategia(Estrategia e) {
		this.estrategia = e;
	}
	
	public String selecAtributo() {
		return this.estrategia.seleccionarAtributo(this.getPrimerCarta());
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
