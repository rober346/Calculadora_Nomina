package Nominas;

public class Descuentos {
	
	public static float descuentos(float sueldobruto) {
						
		if (sueldobruto <= 2000) {
			float descuento = (float) (sueldobruto - (sueldobruto * .16)); 
			System.out.println("Salario menor a $2,000, Descuento del 16 %");
			return descuento;
			
		}else {
			float descuento = (float) (sueldobruto - (sueldobruto * .18)); 
			System.out.println("Salario mayor a $2,000, Descuento del 18 %");
			return descuento;						
		}
	}
}
