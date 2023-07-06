import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a palavra a ser invertida: ");
        String palavra = entrada.nextLine();
        String[] palavras = palavra.split(" ");

        entrada.close();

	}

}
