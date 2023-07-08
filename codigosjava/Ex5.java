package desafiodecodigo;
import java.util.Scanner; // importando o scanner
public class Ex5 {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in); // definindo scanner entrada
		String palavra = entra.nextLine(); // String da palavra digitada pelo usuário
		int tamanho = palavra.length()-1; // inteiro para o tamanho
		String[] anagrama = palavra.split(""); // Stringvetor para o anagrama
		String palavraAnagrama = ""; // String da palavra específica para o anagrama
		String palavraAnagramaInvertida = ""; // String para inverter a palavra anagrama
		boolean palindromoAnagrama = false; // boolean para definir se é um anagrama de um palindromo (pode ser true ou false)
		
		for(int i = 0; i < tamanho; i++) { // laço for para percorrer
	        if(i==0) { // se o indice for igual a 0
	        	String primeiraPos = anagrama[0]; // define uma string para a primeira posiçao do vetorstring anagrama
	        	String ultimaPos = anagrama[tamanho];  // define uma string para a ultima posiçao do vetorstring anagrama
	        	String segundaPos = anagrama[1];  // define uma string para a segunda posiçao do vetorstring anagrama
	        	String penultimaPos = anagrama[tamanho-1];  // define uma string para a penultima posiçao do vetorstring anagrama
	        	palavraAnagrama += segundaPos; // atribui a segunda posiçao para a String palavraAnagrama
	        	palavraAnagrama += primeiraPos; // atribui a primeira posiçao para a String palavraAnagrama
	        	palavraAnagrama += ultimaPos; // atribui a ultima posiçao para a String palavraAnagrama
	        	palavraAnagrama += penultimaPos; // // atribui a penultima posiçao para a String palavraAnagrama
	        	for(int t = palavraAnagrama.length()-1; t >= 0; t--) { // laço secundario percorrendo a string de tras pra frente
	                    palavraAnagramaInvertida += palavraAnagrama.charAt(t); // atribui a palavraAnagramaInvertida a palavra anagrama ao contrário
	            }
	        	if (palavraAnagrama.equals(palavraAnagramaInvertida)) { // se a palavraAnagrama (que é segundaposicão+primeira+ultima+penultima) for igual a ela mesma invertida executa
	        			palindromoAnagrama = true; // define o boolean palindromo anagrama como true
	            }
	        }
	    }
		System.out.print(palindromoAnagrama); // imprime o valor do boolean
		entra.close(); // fecha o Scanner
	 }
}
		
