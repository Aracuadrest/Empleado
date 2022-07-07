package main;

import clases.Comercial;
import clases.Empleado;

public class PruebaEmpleado {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado();
		System.out.println("El empleado creado con el constructor sin parámetros es "+emp);
		
		emp = new Empleado("Carlos","Soles",34,1000);
		System.out.println("El empleado es \n"+emp);
		
		System.out.println("El salario de "+emp.getNombre()+" es: "+emp.calculaSalario());
		System.out.println("---------------------------------------------");
		System.out.println("Actualizando la antiguedad a 22 años");
		emp.setAntiguedad_años(22);
		
		System.out.printf("El salario de Carlos es: %.2f ",emp.calculaSalario());
		
		Empleado e = new Comercial("Sonia","Mendez",34,1200,3,4);
		
		System.out.println("Añadiendo ventas");
		
		// hay que hacer una conversion ya que la variable e es Empleado y las ventas
		//es un método de Comercial
		((Comercial)e).contabilizaVentas(8);
		//Por el poliformismo el calculaSalario es de Comercial no necesitamos hacer la conversion
		
		System.out.println("El salario de Sonia es:"+e.calculaSalario());
		
		

	}

}
