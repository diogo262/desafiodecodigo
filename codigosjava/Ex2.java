import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		String frase = entra.nextLine();
		String fraseSaida = "";
		
		for(int i = 0; i < frase.length(); i++) { //percorre os indices
			char letraAtual = frase.charAt(i); //atribui para um char a letra atual do indice especifico
			if (!fraseSaida.contains(String.valueOf(letraAtual))){ // verifica se a frase saida não contém a letra atual convertida para string
				fraseSaida += letraAtual; // atribui para a frase saida essa letra que não está na frase saida
			}
		}
		
		System.out.println(fraseSaida); //imprime a frase da saida
	}

}
