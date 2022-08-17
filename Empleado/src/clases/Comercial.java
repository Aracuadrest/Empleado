package clases;

public class Comercial extends Empleado {

	private int numero_ventas;
	private static double importeVentas = 45.90;

	// Constructor sin parámetros con numero de ventas=0

	public Comercial() {
		super();
		this.numero_ventas = 0;

	}

	// Constructor todos los atributos y de la superclase

	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedad_años, int numero_ventas) {
		super(nombre, apellido, edad, salario, antiguedad_años);
		this.numero_ventas = numero_ventas;

	}
	// Constructor sin ventas para poder añadirlas con el metodo
	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedad_años) {
		super(nombre, apellido, edad, salario, antiguedad_años);
		this.numero_ventas = 0;

	}

	// Constructor copia
	public Comercial(Comercial c) {
		super(c);
		this.numero_ventas = c.numero_ventas;
	}

	// Sobrescribe el método toString

	@Override
	public String toString() {
		return "Comercial [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad_años=" + antiguedad_años + ", numero_ventas=" + numero_ventas + "]";
	}
	
	
	// getters y setters

	public int getNumero_ventas() {
		return numero_ventas;
	}
	
	public static void setImporteVentas(double importeVentas) {
		Comercial.importeVentas = importeVentas;
	}

	// Método contabilizaVentas
	public void contabilizaVentas(int i) {
		if (i > 7) {
			i = 7;
		}
		this.numero_ventas = this.numero_ventas + i;

		if (this.numero_ventas >= 25) {
			this.numero_ventas = 25;
		}
		//this.numero_ventas=Math.min(this.numero_ventas+Math.min(i,7),25);

	}

	// Método reseteaContadorVentas
	public void reseteaContadorVentas() {
		this.numero_ventas = 0;

	}
	
	 //Sobrescribe el metodo calculaSalario para que se le añada la
	 //cantidad ganada en comisiones
	 
	@Override
	public double calculaSalario() {
		return super.calculaSalario() + (Comercial.importeVentas * this.numero_ventas);

	}

}
