package desafiodecodigo;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		String palavra = entra.nextLine();
		int tamanho = palavra.length()-1;
		String[] anagrama = palavra.split("");
		String palavraAnagrama = "";
		String palavraAnagramaInvertida = "";
		boolean palindromoAnagrama = false;
		
		for(int i = 0; i < tamanho; i++) {
	        if(i==0) {
	        	String primeiraPos = anagrama[0];
	        	String ultimaPos = anagrama[tamanho];
	        	String segundaPos = anagrama[1];
	        	String penultimaPos = anagrama[tamanho-1];
	        	palavraAnagrama += segundaPos;
	        	palavraAnagrama += primeiraPos;
	        	palavraAnagrama += ultimaPos;
	        	palavraAnagrama += penultimaPos;
	        	for(int t = palavraAnagrama.length()-1; t >= 0; t--) { // laço secundario percorrendo a string de tras pra frente
	                    palavraAnagramaInvertida += palavraAnagrama.charAt(t);
	            }
	        	if (palavraAnagrama.equals(palavraAnagramaInvertida)) {
	        			palindromoAnagrama = true;
	            }
	        }
	    }
		System.out.print(palindromoAnagrama);
		entra.close();
	 }
}
		
