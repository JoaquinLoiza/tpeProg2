package trabajoEspecial.busquedas;

import trabajoEspecial.Carta;

public class CriterioCantAtributos extends Busqueda {
	
	private Carta c;
	
	public CriterioCantAtributos(Carta carta) {
		this.c = carta;
	}
	
	@Override
	public boolean cumple(Carta carta) {
		return this.c.getTamanio() == carta.getTamanio();
	}
}
