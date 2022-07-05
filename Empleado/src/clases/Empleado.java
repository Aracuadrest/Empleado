package clases;

public class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	private int antiguedad_a�os;
	
	
	// Constructor sin par�metros
	public Empleado() {
		super();
	}


	// Constructor con par�metros
	public Empleado(String nombre, String apellido, int edad, double salario, int antiguedad_a�os) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad_a�os = antiguedad_a�os;
	}
	
	//Constructor de copia
	public Empleado(Empleado e) {
		super();
		this.nombre = e.nombre;
		this.apellido = e.apellido;
		this.edad = e.edad;
		this.salario = e.salario;
		this.antiguedad_a�os = e.antiguedad_a�os;
	}

	// M�todos getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getAntiguedad_a�os() {
		return antiguedad_a�os;
	}


	public void setAntiguedad_a�os(int antiguedad_a�os) {
		this.antiguedad_a�os = antiguedad_a�os;
	}
	//Sobreescribe el m�todo toString	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad_a�os=" + antiguedad_a�os + "]";
	}

	//M�todo calculaTrienios
	public double calculaTrienios() {
		int trienios=this.antiguedad_a�os/3;
		double importe_tri=0;
		double sal=this.salario;
		
		for (int i=0;i<=trienios;i++) {
			sal=salario+importe_tri;
			if (i<=5) { 
			importe_tri=importe_tri+sal*0.05;
			}else {
			importe_tri=importe_tri+sal*0.08;
			}
		}
		return importe_tri;
		}
	//M�todo calculaSalario
	public double calculaSalario() {
		return this.salario+this.calculaTrienios();
		
	}
	
	
	

}
