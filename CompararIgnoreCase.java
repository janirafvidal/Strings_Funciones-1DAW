package strings1A5;

public class CompararIgnoreCase {
	
	public static int comparaIgnoreCase(String cad1, String cad2) {
		
		return cad1.compareToIgnoreCase(cad2);
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String cadena1="AzC";
			String cadena2="aZc";
			
			if (comparaIgnoreCase(cadena1,cadena2)<0) {
				System.out.println(cadena1 +" menor que " +cadena2);
			}else if (comparaIgnoreCase(cadena1,cadena2)>0) {
				System.out.println(cadena1 +" mayor que " +cadena2);
			}else 
				System.out.println("ESTAS CADENAS SON IGUALES");
		}

	}