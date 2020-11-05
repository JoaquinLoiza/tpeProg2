package trabajoEspecial;

import java.util.ArrayList;

public class JugadorObstinado extends Jugador{

	private ArrayList <Carta> cartas;
	private int atrbutoSeleccionado;
	
	public JugadorObstinado (String nombre) {
		super(nombre);
		this.cartas= new ArrayList <>();
	}
	
	public void setAtributo(int num) {
		this.atrbutoSeleccionado= num;
	}
	
	
	public void addCartas(Carta carta) {
		super.addCartas(carta);;
	}
	
	public Carta getPrimerCarta() {
		return super.getPrimerCarta();
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

	private void atributoObstinado () {
		Carta c= this.getPrimerCarta();
		int aux= (int) (Math.random()* (c.getTamano()));
		this.setAtributo(aux);
	}
	
	@Override
	public int selecAtributo() {
		if (this.cartas.size() > 0) {
			return this.atrbutoSeleccionado;
		}
		
		return -1;
	}

}
