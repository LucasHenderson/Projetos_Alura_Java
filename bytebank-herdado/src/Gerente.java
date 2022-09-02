
public class Gerente extends Funcionario {
	private String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double bonificar() {
		return super.bonificar() + super.getSalario(); //super = this, serve apenas para auxilio, eh uma boa pratica
		// esse bonificar vem de funcionario, se mudar la muda aqui tb
		// para noo precisar fazer os getters e setters novamente eh so usar o "super." e get/set que deseja
	}
	
	public boolean autenticar(String senha) {
		if(this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}
	}
}
