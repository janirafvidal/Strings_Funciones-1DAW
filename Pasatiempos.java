package strings16A20;

public class Pasatiempos {

	public static boolean esVocal(char letra) {
		char[] vocales= {'a','e','i','o','u'};
	//	boolean esVocal=false;
		
			for (char vocal:vocales) {
				if (letra==vocal) {
					return true;
				}
				
			}
			
		return false;
	}
	
	public static String cambiarVocales(String cadena) {
		char cambioPor='.';
		
		for (int i=0; i<cadena.length(); i++) {
			if (esVocal(cadena.charAt(i))) {
				cadena=cadena.replace(cadena.charAt(i),cambioPor);
			}
		}
		return cadena;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pasatiempos="un ejemplo de pasatiempos";
		
		System.out.println(cambiarVocales(pasatiempos));
	}

}
