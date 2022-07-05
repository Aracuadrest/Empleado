package clases;

public class Comercial extends Empleado {

	private int numero_ventas;
	private static double importe = 45.90;

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
	// Sobrescribe el método toString

	@Override
	public String toString() {
		return "Comercial [numero_ventas=" + numero_ventas + ", toString()=" + super.toString() + "]";
	}
	// getters y setters
	

	public int getNumero_ventas() {
		return numero_ventas;
	}

	public void setNumero_ventas(int numero_ventas) {
		this.numero_ventas = numero_ventas;
	}

	public static double getImporte() {
		return importe;
	}

	public static void setImporte(double importe) {
		Comercial.importe = importe;
	}
	
	
	// Método contabilizaVentas
	public int contabilizaVentas(int i) {
		if (i > 7) {
			i = 7;
		}
		this.numero_ventas = this.numero_ventas + i;

		if (this.numero_ventas >= 25) {
			this.numero_ventas = 25;
		}
		return this.numero_ventas;

	}


	// Método reseteaContadorVentas
	public void reseteaContadorVentas() {
		this.numero_ventas = 0;

	}

	// Sobrescribe el metodo calculaSalario para que se le añada la 
	//cantidad ganada en comisiones

	 public double calculaSalario() {
		 return super.calculaSalario()+(Comercial.importe*this.numero_ventas);
		 
	 }

}
