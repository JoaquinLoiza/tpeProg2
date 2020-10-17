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
	
	
}
