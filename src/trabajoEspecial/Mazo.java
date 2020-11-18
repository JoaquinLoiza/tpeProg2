package trabajoEspecial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import trabajoEspecial.pociones.Pocion;

public class Mazo {

	private String nombre;
	private HashSet<Carta> cartas;
	private ArrayList <Pocion> pociones;
	
	public Mazo (String nombre) {
		this.nombre= nombre;
		this.cartas = new HashSet<>();
		this.pociones= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addCartas(ArrayList<Carta> cartas) {
		this.cartas.addAll(cartas);
	}
	
	public HashSet<Carta> getCartas() {
		return new HashSet<Carta>(this.cartas);
	}
	
	public void addPocion (Pocion p) {
		this.pociones.add(p);
	}
	
	public void addPocionACarta() {
		for (Carta c : this.cartas) {
			if (c.getPocion() == null && !this.pociones.isEmpty()) {
				c.setPocion(this.pociones.get(0));
				this.pociones.remove(this.pociones.get(0));
			}
		}
	}
	
	public void eliminarCartasInvalidas() {
		ArrayList<Carta> aux1 = new ArrayList<>();
		ArrayList<Carta> aux2 = new ArrayList<>();
		for(Carta carta : this.cartas) {
			if(aux1.isEmpty()) {
				aux1.add(carta);
			}
			else if (aux1.get(0).esCoherente(carta)){
				aux1.add(carta);
			}
			else {
				aux2.add(carta);
			}
		}
		
		if (aux1.size() >= aux2.size()) {
			this.cartas.removeAll(aux2);
		}
		else {
			this.cartas.removeAll(aux1);
		}
	}

	public ArrayList<Carta> mezclarMazo(){	
		ArrayList<Carta> copiaMazo = new ArrayList<>(this.cartas);
		Collections.shuffle(copiaMazo);
		return copiaMazo;	
	}
}
