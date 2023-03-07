package ejercicio5OB;

public class Coche {
	
	// atributos
	String marca;
	String modelo;
	String color;
	double peso;
	double largo;
	
	//constructores
	public Coche() {}

	public Coche(String marca, String modelo, String color, double peso, double largo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.peso = peso;
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", peso=" + peso + ", largo="
				+ largo + "]";
	}
}
