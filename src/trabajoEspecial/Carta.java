package trabajoEspecial;

import java.util.HashMap;

public class Carta {

	private HashMap <String, Integer> atributos;
	private String nombre;
	
	public Carta (String nombre) {
		this.nombre= nombre;
		this.atributos= new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addAtributo (String nombre, int num) {
		if(this.atributos.get(nombre) == null) {
			this.atributos.put(nombre, num);
		}
	}
	
	public int getTamanio() {
		return this.atributos.size();
	}
	
	public HashMap<String, Integer> getAtributos() {
		return new HashMap<>(this.atributos);
	}
	
	public int getAtributo(String nombre) {
		return this.atributos.get(nombre);
	}
}
