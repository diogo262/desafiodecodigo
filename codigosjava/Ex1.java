package desafiodecodigo;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // definindo scanner entrada
        String frase = entrada.nextLine(); // String da frase digitada pelo usuário
        String[] palavras = frase.split(" "); // adicionando cada palavra para String vetor 
        String fraseInvertida = ""; // String vazia para armazenar a frase invertida depois

        for(int i = palavras.length-1; i>=0; i--){ // laço for percorrendo de traz pra frente
            fraseInvertida += palavras[i]+" "; // atribuindo cada elemento do indice para a frase invertida
        }

        System.out.println(fraseInvertida); // imprimindo a String fraseInvertida

        entrada.close(); // fechando o Scanner

	}

}
