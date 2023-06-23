package Nominas;

import java.util.Scanner;

public class ClaseMainNomina {
	
	public static void main (String [] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del empleado? ");
		String nombre = ent.nextLine();
		
		System.out.println("Ingrese el puesto del empleado? ");
		String puesto = ent.nextLine();
		
		System.out.println("Ingrese las horas trabajadas del empleado? ");
		Float horastrabajo = ent.nextFloat();
		
		System.out.println("Ingrese las horas extras del empleado? ");
		Float horasextra = ent.nextFloat();
				
		System.out.println("Nombre Empleado: " + nombre);
		System.out.println("Puesto del Empleado: " + puesto);
					
		float sueldobruto = Empleado.empleado(horastrabajo, horasextra);
		
		System.out.println("El sueldo bruto (+ horas extras) es de: " + sueldobruto);
		
		float sueldofinal = Descuentos.descuentos(sueldobruto);
						
		System.out.println("Sueldo final de: " + sueldofinal);
		
		ent.close();
	}

}
