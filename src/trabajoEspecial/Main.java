package trabajoEspecial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class Main {

	public static void main(String[] args) {
		
		int cantRondas = 50;
		String nomMazo = "Mazo super heroes";
		String rutaJson = "./superheroes.json";
		
		Jugador j1 = new JugadorObstinado("Juan");
		Jugador j2 = new JugadorAmbicioso("Pedro");
		Mazo mazoSuperHeroes = new Mazo(nomMazo);
		
		Pocion p1= new PocionKriptonita("Kriptonita",100);
		Pocion p2= new PocionKriptonita("Kriptonita",100);
		Pocion p3= new PocionKriptonita("Kriptonita",100);
		Pocion p4= new PocionKriptonita("Kriptonita",100);
		Pocion p5= new PocionKriptonita("Kriptonita",100);
		Pocion p6= new PocionValorFijo("Valor fijo",100000000);
		Pocion p7= new PocionValorFijo("Valor fijo",100000000);
		Pocion p8= new PocionValorFijo("Valor fijo",100000000);
		Pocion p9= new PocionValorFijo("Valor fijo",100000000);
		Pocion p10= new PocionValorFijo("Valor fijo",100000000);
		
		mazoSuperHeroes.addCartas(crearMazo(rutaJson));
		mazoSuperHeroes.addPocion(p1);
		mazoSuperHeroes.addPocion(p2);
		mazoSuperHeroes.addPocion(p3);
		mazoSuperHeroes.addPocion(p4);
		mazoSuperHeroes.addPocion(p5);
		mazoSuperHeroes.addPocion(p6);
		mazoSuperHeroes.addPocion(p7);
		mazoSuperHeroes.addPocion(p8);
		mazoSuperHeroes.addPocion(p9);
		mazoSuperHeroes.addPocion(p10);
		
		Juego juego = new Juego(cantRondas,j1,j2,mazoSuperHeroes);
		
		System.out.println(juego.jugar());
		
		System.out.println(juego.getHistorial());
	}
	
	public static ArrayList<Carta> crearMazo(String jsonFile) {
		
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        
        ArrayList<Carta> mazo = new ArrayList<>();
        try {
            is = new FileInputStream(jsonInputFile);
            
            JsonReader reader = Json.createReader(is);
            
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
                String nombreCarta = carta.getString("nombre");
                
                Carta c = new Carta(nombreCarta);
                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                
                for (String nombreAtributo:atributos.keySet()){                	
                	c.addAtributo(nombreAtributo, atributos.getInt(nombreAtributo));
                }
                mazo.add(c);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		return mazo;
	}
}
