package strings6A10;

public class Longitud {
	
	public static int cuantasConKLongitud(String[] words, int longitud) {
		int cuantas=0;
		for (int i=0; i<words.length; i++) {
			if (words[i].length()==longitud) {
				cuantas++;
			}
		}
		return cuantas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena="Esto va a ser un array de palabras";
		String[] divididas=Utilidades.dividirEnPalabras(cadena);
		int longitud=2;
		
		System.out.println("la cadena tiene " 
		+cuantasConKLongitud(divididas,longitud) 
		+" palabras con esa longitud");

	}

}
