package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
	}
	
	public Pez(String nombre,int edad, String habitat,String genero,String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez(String colorEscamas,int cantidadAletas) {
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public static int cantidadPeces() {
		int cantidad = listado.size(); 
		return cantidad;
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad,String genero) {
		Pez salmon = new Pez("rojo",6);
		salmon.setHabitat("oceano");
		salmon.setNombre(nombre);
		salmon.setEdad(edad);
		salmon.setGenero(genero);
		Pez.salmones += 1;
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad,String genero) {
		Pez bacalao = new Pez("gris",6);
		bacalao.setHabitat("oceano");
		bacalao.setNombre(nombre);
		bacalao.setEdad(edad);
		bacalao.setGenero(genero);
		Pez.bacalaos += 1;
		return bacalao;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
}
