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
	
<<<<<<< HEAD
	
	
=======
	public HashSet<Carta> getCartas() {
		
		HashSet<Carta> cartas = new HashSet<>();
		
		for(Carta carta : this.cartas) {
			cartas.add(carta);
		}
		return cartas;
	}
>>>>>>> 3e3f290a93171232a3e47d743c5b6fc564766470
}
