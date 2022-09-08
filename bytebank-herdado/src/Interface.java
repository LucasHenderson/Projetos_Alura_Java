
public class Interface {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha("teste123");
		g1.setSalario(100.0);
		System.out.println(g1.autenticar("teste123"));
		System.out.println(g1.getSalario());
		//System.out.println(g1.bonificar());
		g1.bonificar();
		System.out.println(g1.getSalario());
		
		Adm adm = new Adm();
		adm.setSalario(10.0);
		adm.bonificar();
		adm.setSenha("teste");
		System.out.println(adm.autenticar("teste"));
		System.out.println("Salario adm: "+adm.getSalario());
	}
}
