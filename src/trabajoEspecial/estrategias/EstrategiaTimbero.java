package trabajoEspecial.estrategias;

import java.util.ArrayList;

import trabajoEspecial.Carta;

public class EstrategiaTimbero extends Estrategia {

	@Override
	public String seleccionarAtributo(Carta carta) {
		ArrayList<String>claves = new ArrayList<>();
		for (String i : carta.getAtributos().keySet()) {
			 claves.add(i);
		}
		int aux = (int)(Math.random()*claves.size());
		return claves.get(aux);
	}

}
