package desafiodecodigo;
import java.util.Scanner; // importando Scanner

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // definindo scanner entrada
		String frase = entrada.nextLine(); // String da frase digitada pelo usuário
		String[] palavras = frase.split(" "); // definindo stringvetor para separar as palavras
		int tamanho = palavras.length-1; // definindo um inteiro para o tamanho
		String fraseCompleta = ""; // iniciando uma String para frase completa
		
		
		for(int i = 0; i<=tamanho; i++) { // laço for para percorrer frase
			String palavra = palavras[i]; // string palavra sendo definida como a palavra do indice atual
			
			char primeiraLetra = palavra.charAt(0); // definindo um caracter para acessar a primeira letra
			if(i==0) { // se o indice for igual a zero
				String primeiraLetraMaiuscula = String.valueOf(primeiraLetra).toUpperCase(); // a coloca a primeira letra em maiuscula com o toUpperCase()
				String palavraCompleta = primeiraLetraMaiuscula+palavra.substring(1); // String palavraCompleta para juntar a letra maiúscula com a palavra(começando do primeiro caractere) usando substring
				fraseCompleta += palavraCompleta+" "; // atribuindo para fraseCompleta a palavra completa mais um espaço
			}else if(i>0){ // se for maior que 0 executa
				String deTras = palavras[i-1]; // definindo uma String para acessar o indice anterior ao atual
				if(deTras.contains(".") || deTras.contains("!") || deTras.contains("?")) { // se o indice anterior possuir ponto, acento de exclamação ou ponto de interrog. executa
					
					String primeiraLetraMaiuscula = String.valueOf(primeiraLetra).toUpperCase(); // a coloca a primeira letra em maiuscula com o toUpperCase()
					String palavraCompleta = primeiraLetraMaiuscula+palavra.substring(1); // String palavraCompleta para juntar a letra maiúscula com a palavra(começando do primeiro caractere) usando substring
					fraseCompleta += palavraCompleta+" "; // atribui a palavraCompleta junto com um espaço para fraseCompleta
					
			    }else { // caso contrario
			    	fraseCompleta += palavra+" "; // atribui a palavra sem modificações para fraseCompleta
			    }
			}	
		}
		System.out.print(fraseCompleta+" "); // imprime a string fraseCompleta junto com espaço
		entrada.close(); // fecha o Scanner
	}
		
		
}

