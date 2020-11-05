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
		
		int cantRondas = 20;
		String nomMazo = "Mazo super heroes";
		String rutaJson = "./superheroes.json";
		
		Jugador j1 = new JugadorObstinado("Juan");
		Jugador j2 = new JugadorAmbicioso("Pedro");
		Mazo mazoSuperHeroes = new Mazo(nomMazo);
		
		mazoSuperHeroes.addCartas(crearMazo(rutaJson));
		Juego juego = new Juego(cantRondas,j1,j2,mazoSuperHeroes);
		
		System.out.println(juego.jugar());
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
