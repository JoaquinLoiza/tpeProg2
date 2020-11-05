package trabajoEspecial.busquedas;

import trabajoEspecial.Carta;

public class CriterioNomAtribIguales extends Busqueda {
	
	private String nombre;
	
	public CriterioNomAtribIguales(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean cumple(Carta carta) {
		return carta.getAtributos().containsKey(this.nombre);
	}

}
