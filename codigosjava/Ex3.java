import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		String palavra = entra.nextLine();
		String palindromo = "";
        int tamanho = palavra.length()-1;
        
        for(int i = 0; i <= tamanho; i++) {
        	palindromo += palavra.charAt(i);
        	if(i > 1) {  // para imprimir apenas palindromos com 3 caracteres ou mais
        		String palavraBase = palindromo;
        		String palavraInvertida = "";
        		for(int j = palindromo.length()-1; j >= 0; j--) { // laço secundario percorrendo a string palidromo de tras pra frente
                    palavraInvertida += palindromo.charAt(j);
                }
        		if (palavraBase.equals(palavraInvertida)) {
                    System.out.println(palindromo);
            }
        	}
        }
		
	}

}

