import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a frase a ser invertida: ");
        String frase = entrada.nextLine();
        String[] palavras = frase.split(" ");
        String fraseInvertida = "";

        for(int i = palavras.length-1; i>=0; i--){ //laço for com index é igual
            fraseInvertida += palavras[i]+" ";
        }

        System.out.println(fraseInvertida);

        entrada.close();

	}

}
