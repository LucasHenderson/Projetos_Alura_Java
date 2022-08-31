
public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 18;
		if (idade >= 18) {
			System.out.println("A idade é maior do que 18");
		} else {
			System.out.println("A idade é menor do que 18");
		}

		boolean teste = idade < 18;
		System.out.println("Resultado do teste: " + teste);

		System.out.println((boolean) (idade == 18));

		boolean condicao = true;
		if (idade == 19 || condicao) {
			System.out.println("Entrou nessa condição");
		}
		
		int caso = 1;
		switch (caso) {
		case 1:
			System.out.println("Entrou aqui");
			break;
		default:
			//valor padrão caso n encontre
			break;
		
		}
	}
}
