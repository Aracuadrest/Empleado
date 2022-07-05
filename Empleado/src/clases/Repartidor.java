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
	}
	// Constructor con todos los par�metros invocando superclase
	public Repartidor(String nombre, String apellido, int edad, double salario, int antiguedad_a�os, String zona,
			String matricula, double kminicioMes, double kmFinales, double dietas) {
		super(nombre, apellido, edad, salario, antiguedad_a�os);
		this.zona = zona;
		this.matricula = matricula;
		this.kminicioMes = kminicioMes;
		this.kmFinales = kmFinales;
		this.dietas = dietas;
	}
			
	//Constructor de copia
	public Repartidor(Repartidor r) {
		super();
		this.zona=r.zona;
		this.matricula=r.matricula;
		this.kminicioMes=r.kminicioMes;
		this.kmFinales=r.kmFinales;
		this.dietas=r.dietas;
	}
	
	//Sobrescribe el m�todo toString
	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", matricula=" + matricula + ", kminicioMes=" + kminicioMes + ", kmFinales="
				+ kmFinales + ", dietas=" + dietas + "]";
	}
	//getters y setters
	
	
	public double getDietas() {
		return dietas;
	}
	public void setDietas(double dietas) {
		this.dietas = dietas;
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
		double totaldietas=this.dietas+dieta;
		if (totaldietas>25) {
			this.dietas=25;
		}else {
		this.dietas=this.dietas+dieta;
		}
		
	}
	
	// M�todo actualizaKms
	public void actualizaKms(double km) {
		if (km>this.kmFinales) {
			this.kmFinales=km;
		}
	}
	//Sobrescribe el metodo calculaSalario()
	public double calculaSalario() {
		double km = 0.45*(this.kmFinales-this.kminicioMes);
		return this.getSalario()+this.dietas+km;
	}
	
	
	
	
	
}
