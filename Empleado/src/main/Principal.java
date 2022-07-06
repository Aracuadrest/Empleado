package main;

import clases.Empleado;
import clases.Comercial;
import clases.Repartidor;

public class Principal {

	public static void main(String[] args) {

		Comercial c1 = new Comercial("Araceli","Cuadra",29,2000,4,4);
		Comercial c2 = new Comercial("Doña","Maca",30,2000,8);
		
		System.out.println("Comercial: "+c1.getNombre());
		
		System.out.println("Añadiendo 8 ventas");
		c1.contabilizaVentas(8);
		System.out.println("Ventas totales: "+c1.getNumero_ventas());
		System.out.println("Reseteando ventas");
		c1.reseteaContadorVentas();
		System.out.println("Ventas totales: "+c1.getNumero_ventas());
		
		System.out.println("Añadiendo 3 ventas");
		c1.contabilizaVentas(3);
		System.out.println("Ventas totales: "+c1.getNumero_ventas());
		
		System.out.println("El salario total es "+c1.calculaSalario());
		System.out.println("Los trienios totales son "+c1.calculaTrienios());
		
		System.out.println("---------------");
		
		System.out.println("Comercial: "+c2.getNombre()+" "+c2.getApellido());
		
		System.out.println("Añadiendo 8 ventas");
		c2.contabilizaVentas(8);
		System.out.println("Ventas totales: "+c2.getNumero_ventas());
		System.out.printf("El salario total es %.2f ",c2.calculaSalario());
		
		System.out.println("Los trienios totales son "+c2.calculaTrienios());
		
		System.out.println("---------------");
		System.out.println("Black friday: Comisión hoy a 100");
		Comercial.setImporteVentas(100);
		System.out.println(c2);
		System.out.println("Añadiendo 5 ventas");
		c2.contabilizaVentas(5);
		System.out.println("Ventas totales: "+c2.getNumero_ventas());
		System.out.println("El salario total es "+c2.calculaSalario());
		
		System.out.println("---------------");
		
		Repartidor r1 = new Repartidor("Juan","Perez",45,1600,10,"Cordoba","4515dnq",155647.25,155990,12);
		
		System.out.println("Repartidor: "+r1.getNombre());
		r1.añadirDieta(15);
		System.out.println("Dietas totales: "+r1.getDietas());
		r1.actualizaKms(160100);
		System.out.println("km finales son: "+r1.getKmFinales());
		
		System.out.printf("El salario total es %.2f",r1.calculaSalario());
	}

}
