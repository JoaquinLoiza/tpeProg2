package trabajoEspecial;

public class PocionCocktail extends Pocion{

	private Pocion p1;
	private Pocion p2;
	
	public PocionCocktail (String nombre, Pocion p1, Pocion p2) {
		super(nombre);
		this.p1= p1;
		this.p2= p2;
	}

	@Override
	public int aplicar(int valor) {
		int valorTotal= this.p1.aplicar(valor);
		valorTotal= this.p2.aplicar(valorTotal);
		
		return valorTotal;
	}
	
	
}
