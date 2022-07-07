package clases;

public class Repartidor extends Empleado {
	private String zona;
	private String matricula;
	private double kminicioMes;
	private double kmFinales;
	private double dietas;
	
	//Constructor sin par�metros
	public Repartidor() {
		super();
		this.zona = "";
		this.matricula = "";
		this.kminicioMes = 0;
		this.kmFinales = 0;
		this.dietas = 0;
	}
	// Constructor con todos los par�metros invocando superclase
	public Repartidor(String nombre, String apellido, int edad, double salario, 
			int antiguedad_a�os, String zona, String matricula, double kminicioMes,
			double kmFinales, double dietas) {
		super(nombre, apellido, edad, salario, antiguedad_a�os);
		this.zona = zona;
		this.matricula = matricula;
		this.kminicioMes = kminicioMes;
		this.kmFinales = kmFinales;
		this.dietas = dietas;
	}
	
	// Constructor sin antiguedad y sin km y sin dietas ya que son inicializadas a 0

	public Repartidor(String nombre, String apellido, int edad, double salario, String zona, String matricula) {
		super(nombre, apellido, edad, salario);
		this.zona = zona;
		this.matricula = matricula;
		this.kminicioMes=0;
		this.kmFinales=0;
		this.dietas=0;
	}
			
	//Constructor de copia
	public Repartidor(Repartidor r) {
		super(r);
		this.zona=r.zona;
		this.matricula=r.matricula;
		this.kminicioMes=r.kminicioMes;
		this.kmFinales=r.kmFinales;
		this.dietas=r.dietas;
	}
	
	@Override
	public String toString() {
		return "Repartidor [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad_a�os=" + antiguedad_a�os + ", zona=" + zona + ", matricula=" + matricula
				+ ", kminicioMes=" + kminicioMes + ", kmFinales=" + kmFinales + ", dietas=" + dietas + "]";
	}
	
	//getters y setters
	public double getKmFinales() {
		return kmFinales;
	}
	public double getKminicioMes() {
		return kminicioMes;
	}
	
	public double getDietas() {
		return dietas;
	}
	
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//M�todo a�adirDieta
	public void a�adirDieta(double dieta) {
		
		if (dieta>25) {
			this.dietas=this.dietas+25;
		}else {
		this.dietas=this.dietas+dieta;
		}
		
	}
	// M�todo para reiniciar las dietas
	public void reiniciarDietas() {
		this.dietas=0;
	}
	
	// M�todo actualizaKms
	public void actualizaKms(double km) {
		if (km>this.kmFinales) {
			this.kmFinales=km;
		}
	}
	// M�todo actualizaci�n km a fin de mes
	public void reiniciarKm() {
		this.kminicioMes=this.kmFinales;
	}
	
	//Sobrescribe el metodo calculaSalario()
	public double calculaSalario() {
		double km = 0.45*(this.kmFinales-this.kminicioMes);
		return this.salario+this.dietas+km;
	}
	
	
	
	
	
}
