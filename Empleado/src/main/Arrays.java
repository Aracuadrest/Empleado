package main;

import clases.Comercial;
import clases.Empleado;
import clases.Repartidor;

public class Arrays {

	public static void main(String[] args) {
		
		Empleado lista []= new Empleado[5];
		
		lista [0] = new Empleado("Luis","López",45,1400,20);
		lista [1] = new Comercial("Ana","Martinez",33,1200,6);
		lista [2] = new Comercial("Juan", "Gómez", 36, 1000, 4, 3);
		lista [3] = new Repartidor("Pedro","Marin",55,1970,17,"Extremadura","1111-abc",
									63540,68730,125);
		lista [4] = new Repartidor("Julia","Soria",30,2100,8,"Murcia","2222-edc",122584,
								126598,89);
		
		System.out.println("Lista de empleados");
		for (int i=0;i<5;i++) {
			System.out.println(lista[i]);
		}
		// Calcula la suma de todos los salarios de la lista
		double totalSalarios=0;
		for (int i=0;i<5;i++) {
			System.out.println(lista[i]);
			totalSalarios=totalSalarios+lista[i].calculaSalario();
		}
		System.out.println("La empresa gasta "+totalSalarios+" en salarios");
		
		// Calculo del total de km en un mes
		double totalkm=0;
		for (int i=0;i<5;i++) {
			//para saber que es repartidor;
			if (lista[i] instanceof Repartidor) {
				Repartidor aux= (Repartidor) lista[i];
				totalkm=totalkm+aux.getKmFinales()-aux.getKminicioMes();
			}
		}
		System.out.println("Se han recorrido este mes "+totalkm+" Kms");	
	}

}
