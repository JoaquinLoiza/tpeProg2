package trabajoEspecial;

public class Main {

	public static void main(String[] args) {
		
		int cantRondas = 50;
		
		Jugador j1 = new Jugador("Juan");
		Jugador j2 = new Jugador("Pedro");
		Mazo mazo1 = new Mazo("Mazo de super heroes");
		Juego juego = new Juego(cantRondas,j1,j2);
		
		Carta c1 = new Carta("Superman");
		Carta c2 = new Carta("Linterna Verde");
		Carta c3 = new Carta("Spiderman");
		Carta c4 = new Carta("Batman");
		Carta c5 = new Carta("Joker");
		Carta c6 = new Carta("Robin");
		
		Atributo at1 = new Atributo("Fuerza", 100);
		Atributo at2 = new Atributo("Velocidad", 100);
		Atributo at3 = new Atributo("Altura", 90);
		c1.addAtributo(at1);
		c1.addAtributo(at2);
		c1.addAtributo(at3);
		
		Atributo at4 = new Atributo("Fuerza", 80);
		Atributo at5 = new Atributo("Velocidad", 90);
		Atributo at6 = new Atributo("Altura", 90);
		c2.addAtributo(at4);
		c2.addAtributo(at5);
		c2.addAtributo(at6);
		
		Atributo at7 = new Atributo("Fuerza", 95);
		Atributo at8 = new Atributo("Velocidad", 70);
		Atributo at9 = new Atributo("Altura", 82);
		c3.addAtributo(at7);
		c3.addAtributo(at8);
		c3.addAtributo(at9);

		Atributo at10 = new Atributo("Fuerza", 73);
		Atributo at11 = new Atributo("Velocidad", 82);
		Atributo at12 = new Atributo("Altura", 85);
		c4.addAtributo(at10);
		c4.addAtributo(at11);
		c4.addAtributo(at12);
		
		Atributo at13 = new Atributo("Fuerza", 81);
		Atributo at14 = new Atributo("Velocidad", 78);
		Atributo at15 = new Atributo("Altura", 86);
		c5.addAtributo(at13);
		c5.addAtributo(at14);
		c5.addAtributo(at15);
		
		Atributo at16 = new Atributo("Fuerza", 70);
		Atributo at17 = new Atributo("Velocidad", 80);
		Atributo at18 = new Atributo("Altura", 75);
		c6.addAtributo(at16);
		c6.addAtributo(at17);
		c6.addAtributo(at18);
		
		mazo1.addCartas(c1);
		mazo1.addCartas(c2);
		mazo1.addCartas(c3);
		mazo1.addCartas(c4);
		mazo1.addCartas(c5);
		mazo1.addCartas(c6);
		
		juego.repartirMazo(mazo1, j1, j2);
				
		while(j1.cantCartas() != 0 && j2.cantCartas() != 0 &&  juego.getRonda() < juego.getRondasMax()){
			
			System.out.println("\nRonda: "+juego.getRonda());
			
			System.out.println("ganador ronda anterior: "+ "\n"+juego.getGanadorRondaAnterior());
			
			System.out.println("\n"+juego.ganadorRonda(j1, j2));
			
			//Al final
			juego.setRonda(juego.getRonda()+1);
		}
	}
}
