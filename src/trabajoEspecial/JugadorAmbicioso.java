package trabajoEspecial;

public class JugadorAmbicioso extends Jugador{
	
	public JugadorAmbicioso(String nombre) {
		super(nombre);
	}
	
	@Override
	public String selecAtributo() {
		int aux= 0;
		String mayor= "";
		if (this.cartas.size()>0) {
			Carta c= super.getPrimerCarta();
			for (String key :c.getAtributos().keySet()) {
				System.out.println("Valor actual de " + key + " :" +  c.getAtributo(key));
				if (c.getAtributo(key) > aux) {
					aux= c.getAtributo(key);
					mayor = key;
				}
			}
		}
		return mayor;
	}

}
