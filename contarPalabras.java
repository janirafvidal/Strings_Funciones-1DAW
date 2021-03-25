package strings21aFin;

public class Palabras1 {
	// puede haber espacios delante, detrás, repetidos
	
	public static int contarPalabras (String[] arrayDePalabras) {
		int palabras = 0;
		for (String palabra:arrayDePalabras) {
			if (palabra != " ") {
				palabras++;
			}
		}
		return palabras;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = Utilidades.leerCadena("Introduce una cadena : ");
		String[] cadenaDividida = Utilidades.dividirEnPalabras(cadena);
		
		System.out.println("Hay " +contarPalabras(cadenaDividida) +" palabras");

	}

}
