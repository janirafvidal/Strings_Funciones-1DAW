package strings6A10;

public class Reemplazar {
	
	public static String reemplazar(String cad1, String cad2, String cad3) {
		return cad1.replace(cad2,cad3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String principal="varias palabras";
		String cambiar="a";
		String cambioPor="o";
		
		System.out.println(reemplazar(principal,cambiar,cambioPor));
	}

}
