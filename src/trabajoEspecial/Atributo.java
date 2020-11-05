package trabajoEspecial;

public class Atributo {

	private String nombre;
	private int valor;
	
	public Atributo (String nombre, int valor) {
		this.nombre= nombre;
		this.valor= valor;
	}

	public String getNombre() {
		return nombre;
	}

	public int getValor() {
		return valor;
	}
	
	@Override
	public boolean equals (Object o) {
		try {
			Atributo nuevo= (Atributo)o;
			return this.getNombre().equals(nuevo.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}
}
