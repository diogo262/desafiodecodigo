package desafiodecodigo;
import java.util.Scanner; // importando Scanner
public class Ex3 {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in); // definindo scanner entra
		String palavra = entra.nextLine(); // String da palavra digitada pelo usuário
		String palindromo = ""; // String vazia palindromo
        int tamanho = palavra.length()-1; // inteiro para o tamanho da palavra
        
        for(int i = 0; i <= tamanho; i++) {
        	palindromo += palavra.charAt(i); // atribuindo o caractere do indice atual para a string palindromo
        	if(i > 1) {  // para imprimir apenas palindromos com 3 caracteres ou mais
        		String palavraBase = palindromo; // definindo String palavraBase
        		String palavraInvertida = ""; // definindo String para armazenar a palavra invertida
        		for(int j = palindromo.length()-1; j >= 0; j--) { // laço secundario percorrendo a string palidromo de tras para frente
                    palavraInvertida += palindromo.charAt(j); // atribuindo para palavraInvertida a string de traz pra frente
                }
        		if (palavraBase.equals(palavraInvertida)) { // se a palavra base for igual a palavra a palavra invertida
                    System.out.println(palindromo); // o programa irá imprimir a String palindromo
            }
        	}
        }
		entra.close(); // fecha o Scanner
	}

}

