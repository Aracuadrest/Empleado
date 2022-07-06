package clases;

public class Empleado {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antiguedad_años;
	
	public static final double factorTrienio1=0.05;
	public static final double factorTrienio2=0.08;
	
	
	
	// Constructor sin parámetros
	public Empleado() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.salario = 0;
		this.antiguedad_años = 0;
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
	// Constructor con la antiguedad a 0 por defecto:
	public Empleado(String nombre, String apellido, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad_años=0;
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

	/**
	 * Método calculaTrienios que calcula el dinero que se lleva un empleado cada 3 años
	 * trabajados en la empresa
	 * @return int importe trienios en euros
	 */
	public double calculaTrienios() {
		int trienios=this.antiguedad_años/3;
		double importe_tri=0;
		double sal=this.salario;
		
		for (int i=1;i<=trienios;i++) {
			sal=salario+importe_tri;
			if (i<=5) { 
			importe_tri=importe_tri+sal*factorTrienio1;
			}else {
			importe_tri=importe_tri+sal*factorTrienio2;
			}
		}
		return importe_tri;
		}
	
	/**
	 * Método calculaSalario suma el salario del empleado más los trienios que tiene
	 * @return double Salario total en euros
	 */
	public double calculaSalario() {
		return this.salario+this.calculaTrienios();
		
	}
	
	
	

}
