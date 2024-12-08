package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	
	
	public Reptil(String nombre,int edad, String habitat,String genero,String colorEscamas, int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil(String colorEscamas,int largoCola) {
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		int cantidad = listado.size(); 
		return cantidad;
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad,String genero) {
		Reptil iguana = new Reptil("blanco",1);
		iguana.setHabitat("jungla");
		iguana.setNombre(nombre);
		iguana.setEdad(edad);
		iguana.setGenero(genero);
		Reptil.iguanas += 1;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad,String genero) {
		Reptil serpiente = new Reptil("blanco",1);
		serpiente.setHabitat("jungla");
		serpiente.setNombre(nombre);
		serpiente.setEdad(edad);
		serpiente.setGenero(genero);
		Reptil.serpientes += 1;
		return serpiente;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
}
