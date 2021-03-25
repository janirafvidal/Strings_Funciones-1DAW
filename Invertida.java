package strings16A20;

public class Invertida {
	
	public static String fraseInvertida(String[] contenido) {
		String inverso= "";
		
			for (int i=contenido.length-1; i>=0; i--) {
				inverso=inverso +contenido[i] +" ";
			}
			
		
		return inverso;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cad = "cadena de prueba para invertir";
		String[] dividido = Utilidades.dividirEnPalabras(cad);
		
		System.out.println(fraseInvertida(dividido));

	}

}

