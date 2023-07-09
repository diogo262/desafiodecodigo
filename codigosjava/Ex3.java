package desafiodecodigo;
import java.util.Scanner; // importando Scanner
public class Ex3 {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in); // definindo scanner entra
		String palavra = entra.nextLine(); // String da palavra digitada pelo usuário
		String palindromo = ""; // String vazia palindromo
        int tamanho = palavra.length()-1; // inteiro para o tamanho da palavra
        
        for (int i = 0; i < tamanho; i++) { // loop externo percorre string palavra
            for (int j = i; j < tamanho; j++) { // loop interno
                palindromo += palavra.charAt(j); // atribui o caractere atual do loop interno a variavel palindromo
                if (j - i >= 2) { // verifica se a substring tem pelo menos 3 caracteres
                    String palavraInvertida = inverterString(palindromo); // chama o método inverterString
                    if (palindromo.equals(palavraInvertida)) { // verifica se a string atual é um palindromo
                        System.out.println(palindromo); //imprime a substring palindromo
                    }
                }
            }
        }
        entra.close();// fecha o Scanner
	}
	
	private static String inverterString(String s) {
        char[] caracteres = s.toCharArray(); // converte a string s em um chararray
        int i = 0; // declara indice inicial
        int j = caracteres.length - 1; // declara indice final

        while (i < j) { // enquanto i for menor que j para inverter
            char temp = caracteres[i]; // armazena o char atual em umm char temporario
            caracteres[i] = caracteres[j]; // substitui o char na pos i pelo j
            caracteres[j] = temp; // adiciona ao temporario a pos j
            i++; // incrementa o i
            j--; // incrementa o j
        }

        return new String(caracteres); // cria uma string dos caracteres invertidos
    }

}