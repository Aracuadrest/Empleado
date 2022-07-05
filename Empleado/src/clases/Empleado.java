package clases;

public class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	private int antiguedad_años;
	
	
	// Constructor sin parámetros
	public Empleado() {
		super();
	}


	// Constructor con parámetros
	public Empleado(String nombre, String apellido, int edad, double salario, int antiguedad_años) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad_años = antiguedad_años;
	}
	
	//Constructor de copia
	public Empleado(Empleado e) {
		super();
		this.nombre = e.nombre;
		this.apellido = e.apellido;
		this.edad = e.edad;
		this.salario = e.salario;
		this.antiguedad_años = e.antiguedad_años;
	}

	// Métodos getters y setters
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


	public int getAntiguedad_años() {
		return antiguedad_años;
	}


	public void setAntiguedad_años(int antiguedad_años) {
		this.antiguedad_años = antiguedad_años;
	}
	//Sobreescribe el método toString	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad_años=" + antiguedad_años + "]";
	}

	//Método calculaTrienios
	public double calculaTrienios() {
		int trienios=this.antiguedad_años/3;
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
	//Método calculaSalario
	public double calculaSalario() {
		return this.salario+this.calculaTrienios();
		
	}
	
	
	

}
