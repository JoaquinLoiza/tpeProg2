package trabajoEspecial;

import java.util.ArrayList;

public class Carta {

	private ArrayList <Atributo> atributos;
	private String nombre;
	
	public Carta (String nombre) {
		this.nombre= nombre;
		this.atributos= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addAtributo (Atributo atributo) {
		if (!this.atributos.contains(atributo)) {
			this.atributos.add(atributo);
		}
	}
	
	
}
