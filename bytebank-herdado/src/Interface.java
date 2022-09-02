
public class Interface {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha("teste123");
		g1.setSalario(100.0);
		System.out.println(g1.autenticar("teste123"));
		
		System.out.println(g1.bonificar());
	}
}
