package string11A15;

public class Longitud3 {
	
	public static boolean todasCortas(String[] words, int longitud) {
		boolean algunaLarga=false;

		for (int i=0; i<words.length; i++) {
			if (words[i].length() >= longitud) {
				algunaLarga=true;
				break;
			}
		}
		return !algunaLarga;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena="cadena de prueba numero tres";
		String[] palabras=Utilidades.dividirEnPalabras(cadena);
		int longitud=9;
		
		if (todasCortas(palabras,longitud)) {
			System.out.println("Todas las cadenas son cortas.");
		}else System.out.println("Hay alguna palabra larga.");
	}

}
