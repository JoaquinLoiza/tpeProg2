package trabajoEspecial;

import java.util.ArrayList;
import java.util.HashSet;

public class Mazo {

	private String nombre;
	private HashSet <Carta> cartas;
	private ArrayList <Pocion> pociones;
	
	public Mazo (String nombre) {
		this.nombre= nombre;
		this.cartas = new HashSet <>();
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
		for (Carta c: this.cartas) {
			while (this.pociones.size() > 0) {
				c.setPocion(this.pociones.get(0));
				this.pociones.remove(0);
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
			else if (aux1.get(0).getAtributos().keySet().equals(carta.getAtributos().keySet())){
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
		
		ArrayList<Carta> copiaMazo = new ArrayList<>();
		copiaMazo.addAll(this.cartas);
		ArrayList<Carta> aux = new ArrayList<>();
		
		while(!copiaMazo.isEmpty()){
			int num = (int)(Math.random()*copiaMazo.size());
			aux.add(copiaMazo.get(num));
			copiaMazo.remove(copiaMazo.get(num));	
		}
		return aux;
	}
}
