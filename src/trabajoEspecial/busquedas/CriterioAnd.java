package trabajoEspecial.busquedas;

import trabajoEspecial.Carta;

public class CriterioAnd extends Busqueda {
	
	Busqueda c1;
	Busqueda c2;
	
	public CriterioAnd(Busqueda c1, Busqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public boolean cumple(Carta carta) {
		return c1.cumple(carta) && c2.cumple(carta);
	}

}
