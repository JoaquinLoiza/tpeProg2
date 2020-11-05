package trabajoEspecial;

public class JugadorObstinado extends Jugador{

	private String atributoSeleccionado;
	
	public JugadorObstinado (String nombre) {
		super(nombre);
		this.atributoSeleccionado = "";
	}
	
	public void setAtributo(String clave) {
		this.atributoSeleccionado= clave;
	}

	@Override
	public String selecAtributo() {
		if (atributoSeleccionado == "") {
			this.setAtributo(super.selecAtributo());
		}
		return this.atributoSeleccionado;
	}

}
