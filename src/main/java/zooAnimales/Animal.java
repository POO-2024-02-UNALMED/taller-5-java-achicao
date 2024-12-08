package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona = null;
	
	public Animal() {
	}
	
	public Animal(String nombre, int edad, String habitat, String genero,Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		totalAnimales += 1;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this(nombre,edad,habitat,genero,null);
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		int mamiferos = Mamifero.cantidadMamiferos();
		int aves = Ave.cantidadAves();
		int reptiles = Reptil.cantidadReptiles();
		int peces = Pez.cantidadPeces();
		int anfibios = Anfibio.cantidadAnfibios();
				
		return "Mamíferos: "+mamiferos+"\nAves: "+aves+"\nReptiles: "+reptiles+"\nPeces: "+peces+"\nAnfibios: "+anfibios;
	}
	
	public String toString() {
		if (zona != null) {
			return "Mi nombre es"+nombre+",tengo una edad de "+edad+",habito en "+habitat+" y mi género es "+genero+", la zona en la que me ubico es "+zona.getNombre()+" en el "+zona.getZoo().getNombre();
		}
		else {
			return "Mi nombre es"+nombre+",tengo una edad de "+edad+",habito en "+habitat+" y mi género es "+genero;
		}
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public String getGenero() {
		return genero;
	}
}
