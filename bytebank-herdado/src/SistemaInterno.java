
public class SistemaInterno {
	
	private String senha = "senha123";
	
	public void autenticar(Altenticavel altenticavel) {
		//somente quem implementou a interface altenticavel pode ser executar esse metodo
		if(altenticavel.autenticar(this.senha)) {
			System.out.println("Senha correta!");
		} else {
			System.out.println("Senha incorreta!");
		}
	}
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha("senha123");
		SistemaInterno sistemaInterno = new SistemaInterno();
		//sistemaInterno.autenticar(gerente);
		
		Adm adm = new Adm();
		adm.setSenha("teste");
		//sistemaInterno.autenticar(adm);
		
		//Altenticavel altenticavel = new Altenticavel(); nao funciona pois é uma interface
		
		Cliente cliente = new Cliente();
		cliente.setSenha("senha123");
		Altenticavel clienteAlt = cliente; //ao fazer isso vc "limita" as ações de um cliente
											//"quase igual a um cast"
		sistemaInterno.autenticar(clienteAlt);
	}
}
