package trabajoEspecial.estrategias;

import trabajoEspecial.Carta;

public class EstrategiaAmbicioso extends Estrategia {

	@Override
	public String seleccionarAtributo(Carta carta) {
		int aux= 0;
		String mayor= "";
	
		for (String key : carta.getAtributos().keySet()) {
			if (carta.getValor(key) > aux) {
				aux= carta.getValor(key);
				mayor = key;
			}
		}
		return mayor;
	}

}
