
public class TestaVariaveis {
	
	public static void main(String[] args) {
		
		double idade = 37.5;
		int teste = (int) idade;
		
		Double numero = 18.2;
		int outroNumero = numero.intValue();
		
		long numeroMuitoGrande = 999999999999999l; //tem q colocar um L ou l no final
		float pontoFlutuante = 15.6f; //mesma coisa do long
		short numeroPequeno = 6500;
		byte numeroMuitoPequeno = 127; //so vai ate +127 e -128
		
		System.out.println(outroNumero);
		System.out.println(idade+numero);
	}
}
