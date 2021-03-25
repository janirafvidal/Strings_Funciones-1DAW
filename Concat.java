package strings1A5;

public class Concat {
	
	public static String concatenar(String cad1,String cad2) {
		return cad1.concat(cad2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1="¡Que pasa chavales! ¿Todo bien? ";
		String cadena2="¿Todo correcto? Y yo que me alegro";
		
		System.out.println(concatenar(cadena1,cadena2));
	}

}
