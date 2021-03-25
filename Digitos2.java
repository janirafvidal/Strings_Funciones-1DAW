package string11A15;

public class Digitos2 {

	public static int cuantosNumeros(String[] contenido) {
		int numeros = 0;

		for (int i = 0; i < contenido.length; i++) {
				for (int j = 0; j<contenido[i].length()-1; j++) {
					if (Character.isDigit(contenido[i].charAt(j)) && contenido[i].charAt(j+1)==' ') {
					//numeros++;
				}
			}
		
		}

		return numeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "hay un 7e un 1e2 y un 36";
		String[] dividido = Utilidades.dividirEnPalabras(cadena);

		System.out.println("En la cadena hay " + cuantosNumeros(dividido) + " numeros");
	}

}