package trabajoEspecial.estrategias;

import trabajoEspecial.Carta;

public class EstrategiaAmbicioso extends Estrategia {

	@Override
	public String seleccionarAtributo(Carta carta) {
		int aux= 0;
		String mayor= "";
	
		for (String key : carta.getAtributos().keySet()) {
			if (carta.getAtributo(key) > aux) {
				aux= carta.getAtributo(key);
				mayor = key;
			}
		}
		return mayor;
	}

}
