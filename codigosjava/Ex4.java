package desafiodecodigo;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase = entrada.nextLine();
		String[] palavras = frase.split(" ");
		int tamanho = palavras.length-1;
		String fraseCompleta = "";
		
		
		for(int i = 0; i<=tamanho; i++) {
			String palavra = palavras[i];
			
			char primeiraLetra = palavra.charAt(0); 
			if(i==0) {
				String primeiraLetraMaiuscula = String.valueOf(primeiraLetra).toUpperCase();
				String palavraCompleta = primeiraLetraMaiuscula+palavra.substring(1);
				fraseCompleta += palavraCompleta+" ";
			}else if(i>0){
				String deTras = palavras[i-1];
				if(deTras.contains(".") || deTras.contains("!") || deTras.contains("?")) {
					
					String primeiraLetraMaiuscula = String.valueOf(primeiraLetra).toUpperCase();
					String palavraCompleta = primeiraLetraMaiuscula+palavra.substring(1);
					fraseCompleta += palavraCompleta+" ";
					
			    }else {
			    	fraseCompleta += palavra+" ";
			    }
			}	
		}
		System.out.print(fraseCompleta+" ");
		entrada.close();
	}
		
		
}

