package strings16A20;

public class Alfabetica {
	
	public static boolean alfabetica(String palabra) {
		
		for (int i=0; i<palabra.length()-1; i++) {
			if (palabra.charAt(i)>palabra.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "amor";
		
		if (alfabetica(palabra)) {
			System.out.println("Es alfabetica");
		}else 
			System.out.println("No es alfabetica");
	}

}
