package trabajoEspecial.estrategias;

import java.util.ArrayList;

import trabajoEspecial.Carta;

public class EstrategiaObstinado extends Estrategia {

	private String atributoSeleccionado;
	
	public EstrategiaObstinado() {
		this.atributoSeleccionado = "";
	}
	
	public void setAtributo(String clave) {
		this.atributoSeleccionado = clave;
	}
	
	@Override
	public String seleccionarAtributo(Carta carta) {
		if (atributoSeleccionado == "") {
			ArrayList<String>claves = new ArrayList<>();
			for (String i : carta.getAtributos().keySet()) {
				 claves.add(i);
			}
			int aux = (int)(Math.random()*claves.size());
			this.setAtributo(claves.get(aux));
		}
		return this.atributoSeleccionado;
	}
}
