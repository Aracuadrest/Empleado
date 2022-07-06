package main;

import clases.Empleado;

public class PruebaEmpleado {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado();
		System.out.println("El empleado creado con el constructor sin par�metros es "+emp);
		
		emp = new Empleado("Carlos","Soles",34,1000);
		System.out.println("El empleado es \n"+emp);
		
		System.out.println("El salario de "+emp.getNombre()+" es: "+emp.calculaSalario());
		System.out.println("---------------------------------------------");
		System.out.println("Actualizando la antiguedad a 22 a�os");
		emp.setAntiguedad_a�os(22);
		
		System.out.printf("El salario de Carlos es: %.2f ",emp.calculaSalario());
		
		

	}

}
