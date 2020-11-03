package trabajoEspecial.busquedas;

import trabajoEspecial.Carta;

public class CriterioNomAtribIguales extends Busqueda {
	
	private Carta c;
	
	public CriterioNomAtribIguales(Carta carta) {
		this.c = carta;
	}
	
	@Override
	public boolean cumple(Carta carta) {
		
		for (int i = 0; i<carta.getTamano(); i++) {
			if (!(carta.getAtributo(i).getNombre().equals(c.getAtributo(i).getNombre()))) {
				return false;
			}			
		}
		return true;
	}

}
