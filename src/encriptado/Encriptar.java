package encriptado;

import java.util.Scanner;

public class Encriptar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
		int resultado;
		char[] abecedario= {'A','B','C','D','E','F','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','X','Y','Z'};
		char[] encriptado ={'T','U','V','X','Y','Z','A','B','C','D','E','F','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S'};
		
		String captura;
		String b;
		String cifrar="";
		
		
		
		 
		System.out.println("Introduce mensaje a encriptar :");			
		captura = lectura.nextLine().toUpperCase().trim();
		
		for(char letra:captura.toCharArray()) {
		 for (int i = 0; i < abecedario.length; i++) {
			 if(letra==abecedario[i]) {
				 cifrar+=String.valueOf(encriptado[i]);
			 
				 if(letra==encriptado[i]) {
					 
					 captura+=String.valueOf(abecedario[i]);
					 
				 }
				 
			 }		
		}
		 
		}
		System.out.println("MENSAJE ENCRIPTADO");
		System.out.println(cifrar);
		System.out.println("MENSAJE NORMAL");
		System.out.println(captura);
		
		
		

	
		
		
	
		 
	
	
		
	}

}
