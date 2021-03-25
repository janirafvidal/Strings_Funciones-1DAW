package strings16A20;

public class Siglas {
	
	public static String siglas (String[] text) {

		String siglas="";
		
			for (int i=0; i<text.length; i++) {
				char letra = text[i].charAt(0);
				if (Character.isUpperCase(letra)) {
					siglas+=letra;
				}
			}
		
		return siglas;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "Escuela Oficial de Idiomas";
		String[] palabras = Utilidades.dividirEnPalabras(texto);
		
		System.out.println("Las siglas de " +texto +" son " +siglas(palabras));
	}

}
