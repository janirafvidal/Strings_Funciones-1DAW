package strings21aFin;
/**
 * 
 * @author Janira
 *
 */
public class Desencriptar {
	
public static String desencripta(String cadena, int codigo) {
		
		String desencripted = "";
		
		for (char letra : cadena.toCharArray()) {
			if (Character.isUpperCase(letra)) {
				desencripted+= (char)(((letra-65-codigo)%26) +65);
				//ASCII mayus del 65 a 90
			}else if (Character.isLowerCase(letra)) {
				desencripted+= (char)(((letra-97-codigo)%26) +97);
				//ASCII minus del 97 al 122
			}else if (Character.isDigit(letra)) {
				desencripted+= (char)(((letra-48-codigo)%10) +48);
				//ASCII nums del 48 al 57
			}else
				desencripted+=letra;
		}
		return desencripted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadenaEncriptada = Utilidades.leerCadena("Introduce la cadena encriptada: ");
		int codigoDeEncriptacion = Utilidades.leerEntero("Introduce el código de encriptacion: ");
		
		System.out.println("El mensaje es: " +desencripta(cadenaEncriptada,codigoDeEncriptacion));
		
	}

}
