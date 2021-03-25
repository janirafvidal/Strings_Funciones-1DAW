package strings1A5;

public class Contains {

	public static boolean contiene (String cad1,String cad2) {
		return cad1.contains(cad2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String principal="Ejercicio 4 de programacion";
		String contiene="gra";
		
		if (contiene(principal,contiene)==true) {
			System.out.println("La cadena principal contiene " +contiene);
		}else
			System.out.println("La cadena principal no contiene " +contiene);
	}

}
