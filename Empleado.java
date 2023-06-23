package Nominas;

public class Empleado {
	
	public static float empleado(float horastrabajo, float horasextra) {
		
		float sueldobase = (float)(horastrabajo * 72.87);
		System.out.println("El sueldo base es de: " + sueldobase);
		
		float sueldobruto = (float)((horastrabajo * 72.87) + (horasextra * 25.96));
		
		return sueldobruto;
	}
}
