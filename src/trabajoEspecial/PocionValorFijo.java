package trabajoEspecial;

public class PocionValorFijo extends Pocion{

	private int valor;
	
	public PocionValorFijo (String nombre, int valor) {
		super(nombre);
		this.valor= valor;
	}

	@Override
	public int aplicar(int valor) {
		return this.valor;
	}
	
	
}
