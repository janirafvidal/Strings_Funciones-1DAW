package strings1A5;

public class Ends {

	public static boolean acabaCon(String cad1, String cad2) {
		return cad1.endsWith(cad2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena="Ejercicios de prueba";
		String fin="ba";
		
		if (acabaCon(cadena,fin)==true) {
			System.out.println("La cadena acaba con " +fin);
		}else
			System.out.println("La cadena no acaba con " +fin);
	}

}
