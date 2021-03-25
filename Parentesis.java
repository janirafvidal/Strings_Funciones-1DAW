package string11A15;

public class Parentesis {

	public static boolean estaBienParentizado (String frase) {
		int contador=0;
		
		for (char letra : frase.toCharArray()) {
			if (letra == '(') {
				contador ++;
			}else if (letra == ')') {
				contador--;
				if (contador<0) {
					return false;
				}
			}
		}
		return contador==0;
	}	
	
	public static boolean estaBienParentizado2 (String frase) {
		int contador=0;
		
		for (int i=0; i < frase.length(); i++) {
			if (frase.charAt(i) == '(') {
				contador ++;
			}else if (frase.charAt(i) == ')') {
				contador--;
				if (contador<0) {
					return false;
				}
			}
		}
		return contador==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="(esto)((es) un ejemplo)";
		
		if (estaBienParentizado(cadena)) {
			System.out.println("La frase esta bien parentizada");
		}else
			System.out.println("No esta bien parentizada");

	}

}