
public class TestaLacoDeRepeticao {
	public static void main(String[] args) {
		int numero = 1;
		int total = 0;
		while (numero <= 3) {
			System.out.println(numero);
			total += numero;
			numero++;
		}
		System.out.println("Numero dps do laco :" + numero);
		System.out.println("Total: " + total);
		
		for (int i = 1; i <=3; i++) {
			//i só existe dentro do for
			System.out.println("Mostra i: " + i);
		}
		//System.out.println("i final: " + i); não funciona
		
		for (;numero <= 6; numero++) {
			System.out.println("entrou aqui");
		}
	}
}
