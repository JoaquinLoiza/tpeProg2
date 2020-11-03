package trabajoEspecial;

import java.util.HashSet;

public class Mazo {

	private String nombre;
	private HashSet <Carta> cartas;
	
	public Mazo (String nombre) {
		this.nombre= nombre;
		this.cartas = new HashSet <>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addCarta(Carta carta) {
		this.cartas.add(carta);
	}
	
	public HashSet<Carta> getCartas() {
		return new HashSet<Carta>(this.cartas);
	}
}
