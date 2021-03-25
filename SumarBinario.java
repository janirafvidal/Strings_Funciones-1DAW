package strings16A20;

public class SumarBinario {
	
	public static String sumaBinaria(String cad1, String cad2) {
		int bin1=Integer.parseInt(cad1,2);
		int bin2=Integer.parseInt(cad2,2);
		int binResult=bin1+bin2;
		
		String result=Integer.toString(binResult,2);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String binario1="100";
		String binario2="111";
		
		System.out.println("El resultado es "+sumaBinaria(binario1,binario2));
	}

}
