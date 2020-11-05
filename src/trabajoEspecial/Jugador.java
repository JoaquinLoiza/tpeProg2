package trabajoEspecial;

import java.util.ArrayList;

public class Jugador {

	protected String nombre;
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
	
	public String selecAtributo() {
		ArrayList<String>claves= new ArrayList<>();
		for (String i : this.getPrimerCarta().getAtributos().keySet()) {
			 claves.add(i);
			}
		int aux= (int)Math.random()*claves.size();
		
		return claves.get(aux);
		
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
