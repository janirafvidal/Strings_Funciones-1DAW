package strings21aFin;
/**
 * 
 * @author Janira
 *
 */
public class Encriptar {
	
	public static String encripta(String cadena, int codigo) {
		
		String encripted = "";
		
		for (char letra : cadena.toCharArray()) {
			if (Character.isUpperCase(letra)) {
				encripted+= (char)(((letra-65+codigo)%26) +65);
				//ASCII mayus del 65 a 90
			}else if (Character.isLowerCase(letra)) {
				encripted+= (char)(((letra-97+codigo)%26) +97);
				//ASCII minus del 97 al 122
			}else if (Character.isDigit(letra)) {
				encripted+= (char)(((letra-48+codigo)%10) +48);
				//ASCII nums del 48 al 57
			}else
				encripted+=letra;
		}
		return encripted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String loQueEncripto = Utilidades.leerCadena("introduce texto a encriptar :");
		int code=Utilidades.leerEntero("introduce el valor para encriptar el texto:");
		
		System.out.println(encripta(loQueEncripto,code));
		
		
	}

}
