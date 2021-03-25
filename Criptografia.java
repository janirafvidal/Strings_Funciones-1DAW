package strings21aFin;
/**
 * 
 * @author Janira
 *
 */
public class Criptografia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = Utilidades.leerCadena("Introduce una cadena para encriptar: ");
		int codigo = Utilidades.leerEntero("Introduce el codigo de encriptacion: ");
		
		String cadenaEncriptada = Encriptar.encripta(cadena,codigo);
		
		System.out.println("La cadena encriptada es : " +cadenaEncriptada);
		System.out.println("La cadena desencriptada es : " +Desencriptar.desencripta(cadenaEncriptada,codigo));
	}

}
