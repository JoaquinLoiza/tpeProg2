package trabajoEspecial;

public class Atributo {

	private String nombre;
	private Object valor;
	
	public Atributo (String nombre, Object valor) {
		this.nombre= nombre;
		this.valor= valor;
	}

	public String getNombre() {
		return nombre;
	}

	public Object getValor() {
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

	@Override
	public String toString() {
		return "Atributo seleccionado: "+this.getNombre()+ "\nValor "+this.getNombre()+": "+this.getValor();
	}
	
	
}
