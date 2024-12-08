package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
	}
	
	public Anfibio(String nombre,int edad, String habitat,String genero,String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio(String colorPiel,boolean venenoso) {
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		int cantidad = listado.size(); 
		return cantidad;
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad,String genero) {
		Anfibio rana = new Anfibio("rojo",true);
		rana.setHabitat("selva");
		rana.setNombre(nombre);
		rana.setEdad(edad);
		rana.setGenero(genero);
		Anfibio.ranas += 1;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad,String genero) {
		Anfibio salamandra = new Anfibio("negro y amarillo",false);
		salamandra.setHabitat("selva");
		salamandra.setNombre(nombre);
		salamandra.setEdad(edad);
		salamandra.setGenero(genero);
		Anfibio.salamandras += 1;
		return salamandra;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
}
