package trabajoEspecial;

public class PocionCocktail extends Pocion{

	private Pocion p1;
	private Pocion p2;
	
	public PocionCocktail (Pocion p1, Pocion p2) {
		this.p1= p1;
		this.p2= p2;
	}

	@Override
	public int aplicar(int valor) {
		return this.p1.aplicar(valor) + this.p2.aplicar(valor);
	}
	
	
}
