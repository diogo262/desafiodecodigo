import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase = entrada.nextLine();
		String[] palavras = frase.split(" ");
		int tamanho = palavras.length-1;
		
		
		
		for(int i = 0; i<=tamanho; i++) {
			String palavra = palavras[i];
			char primeiraLetra = palavra.charAt(0);
			String primeiraLetraMaiuscula = String.valueOf(primeiraLetra).toUpperCase();
			String fraseCompleta = primeiraLetraMaiuscula+palavra.substring(1);
			System.out.print(fraseCompleta+" ");
		}
		
		entrada.close();
	}

}
