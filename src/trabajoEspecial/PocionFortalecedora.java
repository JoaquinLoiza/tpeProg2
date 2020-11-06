package trabajoEspecial;

public class PocionFortalecedora extends Pocion{

	private int porcentaje;
	
	public PocionFortalecedora (int porcentaje) {
		this.porcentaje= porcentaje;
	}

	@Override
	public int aplicar(int valor) {
		return valor + ((valor * this.porcentaje) / 100);
	}
	
	
}
