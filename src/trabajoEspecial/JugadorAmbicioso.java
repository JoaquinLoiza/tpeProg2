package trabajoEspecial;

import java.util.ArrayList;

public class JugadorAmbicioso extends Jugador{

	private ArrayList <Carta> cartas;
	
	
	public JugadorAmbicioso(String nombre) {
		super(nombre);
		this.cartas= new ArrayList<>();
	}
	
	public void addCartas(Carta carta) {
		super.addCartas(carta);;
	}
	
	public Carta getPrimerCarta() {
		return super.getPrimerCarta();
	}
	
	@Override
	public int selecAtributo() {
		int aux= -1;
		if (this.cartas.size()>0) {
			Carta c= this.getPrimerCarta();
			for (int i=0; i<c.getTamano(); i++) {
				Atributo a= c.getAtributo(i);
				if ((int)a.getValor() > aux) {
					aux= (int)a.getValor();
				}
			}
		}
		
		return aux;
	}

	public void moverCartaAlFinal() {
		super.moverCartaAlFinal();
	}

	public void eliminarCarta() {
		super.eliminarCarta();;
	}
	
	public int cantCartas() {
		return super.cantCartas();
	}


}
