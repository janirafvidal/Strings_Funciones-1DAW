package strings6A10;

public class LastIndexOf {
	
	public static int ultimaPosicion(String cad1, String cad2) {
			return cad1.lastIndexOf(cad2);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String cadena="cadena de pruebas";
			String ultima="s";
			
			if (ultimaPosicion(cadena,ultima)>0) {
				System.out.println("La cadena acaba en la posicion " +(ultimaPosicion(cadena,ultima)));
			}else
				System.out.println("No se ha encontrado la cadena");
			
		}

	}
