package trabajoEspecial;

public class PocionKriptonita extends Pocion{

	private int porcentaje;
	
	public PocionKriptonita (String nombre, int porcentaje) {
		super(nombre);
		this.porcentaje= porcentaje;
	}

	@Override
	public int aplicar(int valor) {
		return valor - ((valor*this.porcentaje)/100);
	}
	
}
