package strings1A5;

public class Comparar {
	
	public static int compara(String cad1, String cad2) {
		
	return cad1.compareTo(cad2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1="zbc";
		String cadena2="zwx";
		
		if (compara(cadena1,cadena2)<0) {
			System.out.println(cadena1 +" menor que " +cadena2);
		}else if (compara(cadena1,cadena2)>0) {
			System.out.println(cadena1 +" mayor que " +cadena2);
		}else 
			System.out.println("cadenas iguales");
	}

}