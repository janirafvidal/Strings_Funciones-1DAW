package string11A15;

public class Longitud2 {
	
	public static boolean hayPalabraConKLongitud(String[] words, int longitud) {
		for (int i=0; i<words.length; i++) {
			if (words[i].length()==longitud) {
				return true;
			} 
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="esta cadena de palabras es de prueba";
		String[] divididas=Utilidades.dividirEnPalabras(cadena);
		int longitud=10;
		
		System.out.println("¿Hay palabras con esa longitud? " 
		+hayPalabraConKLongitud(divididas,longitud));
	}

}
