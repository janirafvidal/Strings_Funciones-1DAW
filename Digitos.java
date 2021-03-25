package string11A15;

public class Digitos {

	public static int cuantosDigitos(String contenido) {
		int digitos=0;
		
		for (int i=0; i<contenido.length(); i++) {
				if (Character.isDigit(contenido.charAt(i))) {
					digitos++;
				}
			}
		return digitos;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena="hay un 7 un 12 y un 36";
		
		System.out.println("En la cadena hay " +cuantosDigitos(cadena) +" dígitos");
	}

}