
public class Cliente implements Altenticavel {
//pode-se implemetar varias interfaces
	private String senha;
	
	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticar(String senha) {
		if(this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}
	}

}
