package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
	}
	
	public Mamifero(String nombre,int edad, String habitat,String genero,boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public Mamifero(boolean pelaje, int patas) {
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		int cantidad = listado.size(); 
		return cantidad;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad,String genero) {
		Mamifero caballo = new Mamifero(true,4);
		caballo.setNombre(nombre);
		caballo.setEdad(edad);
		caballo.setGenero(genero);
		caballo.setHabitat("pradera");
		caballos += 1;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad,String genero) {
		Mamifero leon = new Mamifero(true,4);
		leon.setNombre(nombre);
		leon.setEdad(edad);
		leon.setGenero(genero);
		leon.setHabitat("selva");
		leones += 1;
		return leon;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
}
