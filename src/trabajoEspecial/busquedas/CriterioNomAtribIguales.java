package trabajoEspecial.busquedas;

import trabajoEspecial.Carta;

public class CriterioNomAtribIguales extends Busqueda {
	
	private Carta carta;
	
	public CriterioNomAtribIguales(Carta carta) {
		this.carta = carta;
	}
	
	@Override
	public boolean cumple(Carta carta2) {
		
		boolean cumple = true;
		
		for (String i : this.carta.getAtributos().keySet()) {
			if(!carta2.getAtributos().containsKey(i)) {				
				cumple = false;
			}
		}
		return cumple;
	}

}
