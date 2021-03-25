package strings6A10;

public class Substring {
	
	public static String subcadenas(String cad, int position1, int position2) {
		return cad.substring(position1,position2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena="la cadena para la prueba";
		int pos1=5;
		int pos2=9;
		
		System.out.println(subcadenas(cadena,pos1,pos2));
	}

}
