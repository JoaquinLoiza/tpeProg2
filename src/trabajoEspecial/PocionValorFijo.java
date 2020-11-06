package trabajoEspecial;

public class PocionValorFijo extends Pocion{

	private int valor;
	
	public PocionValorFijo (int valor) {
		this.valor= valor;
	}

	@Override
	public int aplicar(int valor) {
		return this.valor;
	}
	
	
}
