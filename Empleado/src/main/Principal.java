package main;

import clases.Empleado;
import clases.Comercial;
import clases.Repartidor;

public class Principal {

	public static void main(String[] args) {

	/**	Comercial c1 = new Comercial("Araceli","Cuadra",29,2400,4,4);
		Comercial c2 = new Comercial("Doña","Maca",30,2000,8,8);
		
		System.out.println("Empleado: "+c1.getNombre());
		
		System.out.println("Añadiendo 8 ventas");
		c1.contabilizaVentas(8);
		System.out.println("Ventas totales: "+c1.getNumero_ventas());
				
		c1.reseteaContadorVentas();
		System.out.println("Ventas totales: "+c1.getNumero_ventas());
		
		System.out.println("Añadiendo 3 ventas");
		c1.contabilizaVentas(3);
		System.out.println("Ventas totales: "+c1.getNumero_ventas());
		
		System.out.println("El salario total es "+c1.calculaSalario());*/
		
		Repartidor r1 = new Repartidor("Juan","Perez",45,1600,10,"Cordoba","4515dnq",155647.25,168400,12);
		
		System.out.println("Repartidor: "+r1.getNombre());
		r1.añadirDieta(15);
		System.out.println("Dietas totales: "+r1.getDietas());
		r1.actualizaKms(850);
		System.out.println("km finales son: ");
		
	}

}
