package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
	}
	
	public Ave(String nombre,int edad, String habitat,String genero,String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static int cantidadAves() {
		int cantidad = listado.size(); 
		return cantidad;
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad,String genero) {
		Ave halcon = new Ave("cafe glorioso");
		halcon.setHabitat("montañas");
		halcon.setNombre(nombre);
		halcon.setEdad(edad);
		halcon.setGenero(genero);
		Ave.halcones += 1;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad,String genero) {
		Ave aguila = new Ave("blanco y amarillo");
		aguila.setHabitat("montañas");
		aguila.setNombre(nombre);
		aguila.setEdad(edad);
		aguila.setGenero(genero);
		Ave.aguilas += 1;
		return aguila;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
}