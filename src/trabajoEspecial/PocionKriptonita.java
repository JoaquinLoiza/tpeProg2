package trabajoEspecial;

public class PocionKriptonita extends Pocion{

	private int porcentaje;
	
	public PocionKriptonita (int porcentaje) {
		this.porcentaje= porcentaje;
	}

	@Override
	public int aplicar(int valor) {
		return valor - ((valor*this.porcentaje)/100);
	}
	
}
