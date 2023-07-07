public class Ex2 {

	public static void main(String[] args) {
		String frase = "Hello, World!";
		String fraseSaida = "";
		
		for(int i = 0; i < frase.length(); i++) {
			char letraAtual = frase.charAt(i);
			
			if(frase.charAt(i - 1)!=letraAtual) {
				fraseSaida += letraAtual;
			}
			System.out.println(fraseSaida);
		}
		
	}

}
