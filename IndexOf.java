package strings6A10;

public class IndexOf {
	
	public static int posicionCadena(String cad1, String cad2) {
		return cad1.indexOf(cad2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dondeBusco="cadena de prueba";
		String loQueBusco="de";
		
		if ((posicionCadena(dondeBusco,loQueBusco))>0) {
			System.out.println("La cadena empieza en la posicion " +(posicionCadena(dondeBusco,loQueBusco)));
		}else
			System.out.println("No se ha encontrado la cadena");
		
	}

}
